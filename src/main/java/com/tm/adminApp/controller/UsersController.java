package com.tm.adminApp.controller;

import com.tm.adminApp.dto.ResponseDTO;
import com.tm.adminApp.dto.SaveUsersDTO;
import com.tm.adminApp.dto.UpdateUsersDTO;
import com.tm.adminApp.dto.UsersDTO;
import com.tm.adminApp.service.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
  private static final Logger logger = LoggerFactory.getLogger(UsersController.class);

  @Autowired
  private UsersService usersService;

  @GetMapping("/getAllUsers")
  public ResponseEntity<ResponseDTO<Page<UsersDTO>>> getAllUsers(Pageable pageable) {
    logger.info("UsersController getAllUsers method initiated: {}");
    Page<UsersDTO> users = usersService.getAllUsers(pageable);
    ResponseDTO<Page<UsersDTO>> response = new ResponseDTO<>(false, 200, "List fetched successfully", users);
    logger.info("UsersController getAllUsers method terminated: {}");
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  @GetMapping("/getUsersById")
  public ResponseEntity<ResponseDTO<UsersDTO>> getUsersById(@RequestParam int id) {
    logger.info("UsersController getUsersById method initiated: {}");
    UsersDTO usersDTO=usersService.getUsersById(id);
    logger.info("UsersController getUsersById method terminated: {}");
    return new ResponseEntity<>(new ResponseDTO<>(false, 200, "Success",usersDTO), HttpStatus.OK);
  }

  @PostMapping("/saveUsers")
  public ResponseEntity<ResponseDTO<UsersDTO>> saveUsers(@RequestBody SaveUsersDTO saveUsersDTO) {
    logger.info("UsersController saveUsers method initiated: {}");
    UsersDTO toBeSaved =usersService.saveUsers(saveUsersDTO);
    ResponseDTO<UsersDTO> response = new ResponseDTO<>(false, 201, "Details saved successfully", toBeSaved);
    logger.info("UsersController saveUsers method terminated: {}");
    return new ResponseEntity<>(response, HttpStatus.CREATED);
  }

  @PutMapping("/updateUsers")
  public ResponseEntity<ResponseDTO<UsersDTO>> updateUsers(
      @RequestBody UpdateUsersDTO updateUsersDTO) {
    logger.info("UsersController updateUsers method initiated: {}");
    UsersDTO toBeUpdated =usersService.updateUsers(updateUsersDTO);
    ResponseDTO<UsersDTO> response = new ResponseDTO<>(false, 201, "Details updated successfully", toBeUpdated);
    logger.info("UsersController updateUsers method terminated: {}");
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  @DeleteMapping("/deleteUsers")
  public ResponseEntity<ResponseDTO<Object>> deleteUsersById(@RequestParam int id) {
    logger.info("UsersController deleteUsersById method initiated: {}");
    boolean isDeleted = usersService.deleteUsersById(id);
    if (isDeleted) {
      return new ResponseEntity<>(new ResponseDTO<>(false, 200, "Data deleted successfully", null), HttpStatus.OK);
    }
    logger.info("UsersController deleteUsersById method terminated: {}");
    return new ResponseEntity<>(new ResponseDTO<>(true, 404, "Data not found", null), HttpStatus.NOT_FOUND);
  }
}
