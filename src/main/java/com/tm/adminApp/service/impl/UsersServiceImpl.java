package com.tm.adminApp.service.impl;

import com.tm.adminApp.dto.SaveUsersDTO;
import com.tm.adminApp.dto.UpdateUsersDTO;
import com.tm.adminApp.dto.UsersDTO;
import com.tm.adminApp.entity.Users;
import com.tm.adminApp.mapper.UsersMapper;
import com.tm.adminApp.repository.UsersRepository;
import com.tm.adminApp.service.UsersService;
import java.lang.Override;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
  private static final Logger logger = LoggerFactory.getLogger(UsersServiceImpl.class);

  @Autowired
  private UsersRepository usersRepository;

  @Override
  public Page<UsersDTO> getAllUsers(Pageable pageable) {
    logger.info("UsersServiceImpl getAllUsers method initiated: {}");
    Page<Users> usersPage = usersRepository.findAll(pageable);
    List<UsersDTO> usersDTO= UsersMapper.INSTANCE.entityListToDTOList(usersPage.getContent());
    Page<UsersDTO> resultPage = new PageImpl<>(usersDTO, pageable,usersPage.getTotalElements());
    logger.info("UsersServiceImpl getAllUsers method terminated: {}");
    return resultPage;
  }

  @Override
  public UsersDTO getUsersById(int id) {
    logger.info("UsersServiceImpl getUsersById method initiated: {}");
    Users users = usersRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Data not found: ID " + id));
    logger.info("UsersServiceImpl getUsersById method terminated: {}");
    return UsersMapper.INSTANCE.toDto(users);
  }

  public UsersDTO saveUsers(SaveUsersDTO saveUsersDTO) {
    logger.info("UsersServiceImpl saveUsers method initiated: {}");
    Users users = UsersMapper.INSTANCE.saveDtoToEntity(saveUsersDTO);
    users.setCreatedAt(new Date());
    Users toBesaved = usersRepository.save(users);
    logger.info("UsersServiceImpl saveUsers method terminated: {}");
    return UsersMapper.INSTANCE.toDto(toBesaved);
  }

  public UsersDTO updateUsers(UpdateUsersDTO updateUsersDTO) {
    logger.info("UsersServiceImpl updateUsers method initiated: {}");
    Users users = usersRepository.findById(updateUsersDTO.getId()).orElseThrow(() -> new IllegalArgumentException("Users not found: ID " + updateUsersDTO.getId()));
    users = UsersMapper.INSTANCE.updateDtoToEntity(updateUsersDTO,users);
    users.setUpdatedAt(new Date());
    Users toBeUpdated = usersRepository.save(users);
    logger.info("UsersServiceImpl updateUsers method terminated: {}");
    return UsersMapper.INSTANCE.toDto(toBeUpdated);
  }

  public boolean deleteUsersById(final int id) {
    logger.info("UsersServiceImpl deleteUsersById method initiated: {}");
    Optional<Users> users = usersRepository.findById(id);
    if (users.isPresent()) {
      Users existingData = users.get();
      existingData.setIsDeleted(false);
      usersRepository.save(existingData);
      return true;
    }
    logger.info("UsersServiceImpl deleteUsersById method terminated: {}");
    return false;
  }
}
