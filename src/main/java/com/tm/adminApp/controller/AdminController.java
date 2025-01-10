package com.tm.adminApp.controller;

import com.tm.adminApp.dto.AdminDTO;
import com.tm.adminApp.dto.ResponseDTO;
import com.tm.adminApp.dto.SaveAdminDTO;
import com.tm.adminApp.dto.UpdateAdminDTO;
import com.tm.adminApp.service.AdminService;
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
@RequestMapping("/admin")
public class AdminController {
  private static final Logger logger = LoggerFactory.getLogger(AdminController.class);

  @Autowired
  private AdminService adminService;

  @GetMapping("/getAllAdmin")
  public ResponseEntity<ResponseDTO<Page<AdminDTO>>> getAllAdmin(Pageable pageable) {
    logger.info("AdminController getAllAdmin method initiated: {}");
    Page<AdminDTO> admin = adminService.getAllAdmin(pageable);
    ResponseDTO<Page<AdminDTO>> response = new ResponseDTO<>(false, 200, "List fetched successfully", admin);
    logger.info("AdminController getAllAdmin method terminated: {}");
    return new ResponseEntity<>(response, HttpStatus.OK);
  }

  @GetMapping("/getAdminById")
  public ResponseEntity<ResponseDTO<AdminDTO>> getAdminById(@RequestParam int id) {
    logger.info("AdminController getAdminById method initiated: {}");
    AdminDTO adminDTO=adminService.getAdminById(id);
    logger.info("AdminController getAdminById method terminated: {}");
    return new ResponseEntity<>(new ResponseDTO<>(false, 200, "Success",adminDTO), HttpStatus.OK);
  }

  @PostMapping("/saveAdmin")
  public ResponseEntity<ResponseDTO<AdminDTO>> saveAdmin(@RequestBody SaveAdminDTO saveAdminDTO) {
    logger.info("AdminController saveAdmin method initiated: {}");
    AdminDTO toBeSaved =adminService.saveAdmin(saveAdminDTO);
    ResponseDTO<AdminDTO> response = new ResponseDTO<>(false, 201, "Details saved successfully", toBeSaved);
    logger.info("AdminController saveAdmin method terminated: {}");
    return new ResponseEntity<>(response, HttpStatus.CREATED);
  }

  @PutMapping("/updateAdmin")
  public ResponseEntity<ResponseDTO<AdminDTO>> updateAdmin(
      @RequestBody UpdateAdminDTO updateAdminDTO) {
    logger.info("AdminController updateAdmin method initiated: {}");
    AdminDTO toBeUpdated =adminService.updateAdmin(updateAdminDTO);
    ResponseDTO<AdminDTO> response = new ResponseDTO<>(false, 201, "Details updated successfully", toBeUpdated);
    logger.info("AdminController updateAdmin method terminated: {}");
    return new ResponseEntity<>(response, HttpStatus.OK);
  }
}
