package com.tm.adminApp.controller;

import com.tm.adminApp.dto.ProfilesDTO;
import com.tm.adminApp.dto.ResponseDTO;
import com.tm.adminApp.dto.SaveProfilesDTO;
import com.tm.adminApp.dto.UpdateProfilesDTO;
import com.tm.adminApp.service.ProfilesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profiles")
public class ProfilesController {
  private static final Logger logger = LoggerFactory.getLogger(ProfilesController.class);

  @Autowired
  private ProfilesService profilesService;

  @GetMapping("/getAllProfiles")
  public ResponseEntity<ResponseDTO<Page<ProfilesDTO>>> getAllProfiles(Pageable pageable) {
    logger.info("ProfilesController getAllProfiles method initiated: {}");
    Page<ProfilesDTO> profiles = profilesService.getAllProfiles(pageable);
    ResponseDTO<Page<ProfilesDTO>> response = new ResponseDTO<>(false, 200, "List fetched successfully", profiles);
    logger.info("ProfilesController getAllProfiles method terminated: {}");
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  @GetMapping("/getProfilesById")
  public ResponseEntity<ResponseDTO<ProfilesDTO>> getProfilesById(@RequestParam int id) {
    logger.info("ProfilesController getProfilesById method initiated: {}");
    ProfilesDTO profilesDTO=profilesService.getProfilesById(id);
    logger.info("ProfilesController getProfilesById method terminated: {}");
    return new ResponseEntity<>(new ResponseDTO<>(false, 200, "Success",profilesDTO), HttpStatus.OK);
  }

  @PostMapping("/saveProfiles")
  public ResponseEntity<ResponseDTO<ProfilesDTO>> saveProfiles(
      @RequestBody SaveProfilesDTO saveProfilesDTO) {
    logger.info("ProfilesController saveProfiles method initiated: {}");
    ProfilesDTO toBeSaved =profilesService.saveProfiles(saveProfilesDTO);
    ResponseDTO<ProfilesDTO> response = new ResponseDTO<>(false, 201, "Details saved successfully", toBeSaved);
    logger.info("ProfilesController saveProfiles method terminated: {}");
    return new ResponseEntity<>(response, HttpStatus.CREATED);
  }

  @PutMapping("/updateProfiles")
  public ResponseEntity<ResponseDTO<ProfilesDTO>> updateProfiles(
      @RequestBody UpdateProfilesDTO updateProfilesDTO) {
    logger.info("ProfilesController updateProfiles method initiated: {}");
    ProfilesDTO toBeUpdated =profilesService.updateProfiles(updateProfilesDTO);
    ResponseDTO<ProfilesDTO> response = new ResponseDTO<>(false, 201, "Details updated successfully", toBeUpdated);
    logger.info("ProfilesController updateProfiles method terminated: {}");
    return new ResponseEntity<>(response, HttpStatus.OK);
  }
}
