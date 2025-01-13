package com.tm.adminApp.service.impl;

import com.tm.adminApp.dto.ProfilesDTO;
import com.tm.adminApp.dto.SaveProfilesDTO;
import com.tm.adminApp.dto.UpdateProfilesDTO;
import com.tm.adminApp.entity.Profiles;
import com.tm.adminApp.entity.Users;
import com.tm.adminApp.mapper.ProfilesMapper;
import com.tm.adminApp.repository.ProfilesRepository;
import com.tm.adminApp.repository.UsersRepository;
import com.tm.adminApp.service.ProfilesService;
import java.lang.Override;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProfilesServiceImpl implements ProfilesService {
  private static final Logger logger = LoggerFactory.getLogger(ProfilesServiceImpl.class);

  @Autowired
  private UsersRepository usersRepository;

  @Autowired
  private ProfilesRepository profilesRepository;

  @Override
  public Page<ProfilesDTO> getAllProfiles(Pageable pageable) {
    logger.info("ProfilesServiceImpl getAllProfiles method initiated: {}");
    Page<Profiles> profilesPage = profilesRepository.findAll(pageable);
    List<ProfilesDTO> profilesDTO= ProfilesMapper.INSTANCE.entityListToDTOList(profilesPage.getContent());
    Page<ProfilesDTO> resultPage = new PageImpl<>(profilesDTO, pageable,profilesPage.getTotalElements());
    logger.info("ProfilesServiceImpl getAllProfiles method terminated: {}");
    return resultPage;
  }

  @Override
  public ProfilesDTO getProfilesById(int id) {
    logger.info("ProfilesServiceImpl getProfilesById method initiated: {}");
    Profiles profiles = profilesRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Data not found: ID " + id));
    logger.info("ProfilesServiceImpl getProfilesById method terminated: {}");
    return ProfilesMapper.INSTANCE.toDto(profiles);
  }

  public ProfilesDTO saveProfiles(SaveProfilesDTO saveProfilesDTO) {
    logger.info("ProfilesServiceImpl saveProfiles method initiated: {}");
    Profiles profiles = ProfilesMapper.INSTANCE.saveDtoToEntity(saveProfilesDTO);
    Users users = usersRepository.findById(saveProfilesDTO.getUserId()).orElseThrow(() -> new IllegalArgumentException("Users not found: ID " + saveProfilesDTO.getUserId()));
    profiles.setUsers(users);
    Profiles toBesaved = profilesRepository.save(profiles);
    logger.info("ProfilesServiceImpl saveProfiles method terminated: {}");
    return ProfilesMapper.INSTANCE.toDto(toBesaved);
  }

  public ProfilesDTO updateProfiles(UpdateProfilesDTO updateProfilesDTO) {
    logger.info("ProfilesServiceImpl updateProfiles method initiated: {}");
    Profiles profiles = profilesRepository.findById(updateProfilesDTO.getId()).orElseThrow(() -> new IllegalArgumentException("Profiles not found: ID " + updateProfilesDTO.getId()));
    profiles = ProfilesMapper.INSTANCE.updateDtoToEntity(updateProfilesDTO,profiles);
    Users users = usersRepository.findById(updateProfilesDTO.getUserId()).orElseThrow(() -> new IllegalArgumentException("Users not found: ID " + updateProfilesDTO.getUserId()));
    profiles.setUsers(users);
    Profiles toBeUpdated = profilesRepository.save(profiles);
    logger.info("ProfilesServiceImpl updateProfiles method terminated: {}");
    return ProfilesMapper.INSTANCE.toDto(toBeUpdated);
  }
}
