package com.tm.adminApp.service;

import com.tm.adminApp.dto.ProfilesDTO;
import com.tm.adminApp.dto.SaveProfilesDTO;
import com.tm.adminApp.dto.UpdateProfilesDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProfilesService {
  Page<ProfilesDTO> getAllProfiles(Pageable pageable);

  ProfilesDTO getProfilesById(int id);

  ProfilesDTO saveProfiles(SaveProfilesDTO profilesDTO);

  ProfilesDTO updateProfiles(UpdateProfilesDTO profilesDTO);
}
