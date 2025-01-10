package com.tm.adminApp.service.impl;

import com.tm.adminApp.dto.AdminDTO;
import com.tm.adminApp.dto.SaveAdminDTO;
import com.tm.adminApp.dto.UpdateAdminDTO;
import com.tm.adminApp.entity.Admin;
import com.tm.adminApp.mapper.AdminMapper;
import com.tm.adminApp.repository.AdminRepository;
import com.tm.adminApp.service.AdminService;
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
public class AdminServiceImpl implements AdminService {
  private static final Logger logger = LoggerFactory.getLogger(AdminServiceImpl.class);

  @Autowired
  private AdminRepository adminRepository;

  @Override
  public Page<AdminDTO> getAllAdmin(Pageable pageable) {
    logger.info("AdminServiceImpl getAllAdmin method initiated: {}");
    Page<Admin> adminPage = adminRepository.findAll(pageable);
    List<AdminDTO> adminDTO= AdminMapper.INSTANCE.entityListToDTOList(adminPage.getContent());
    Page<AdminDTO> resultPage = new PageImpl<>(adminDTO, pageable,adminPage.getTotalElements());
    logger.info("AdminServiceImpl getAllAdmin method terminated: {}");
    return resultPage;
  }

  @Override
  public AdminDTO getAdminById(int id) {
    logger.info("AdminServiceImpl getAdminById method initiated: {}");
    Admin admin = adminRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Data not found: ID " + id));
    logger.info("AdminServiceImpl getAdminById method terminated: {}");
    return AdminMapper.INSTANCE.toDto(admin);
  }

  public AdminDTO saveAdmin(SaveAdminDTO saveAdminDTO) {
    logger.info("AdminServiceImpl saveAdmin method initiated: {}");
    Admin admin = AdminMapper.INSTANCE.saveDtoToEntity(saveAdminDTO);
    Admin toBesaved = adminRepository.save(admin);
    logger.info("AdminServiceImpl saveAdmin method terminated: {}");
    return AdminMapper.INSTANCE.toDto(toBesaved);
  }

  public AdminDTO updateAdmin(UpdateAdminDTO updateAdminDTO) {
    logger.info("AdminServiceImpl updateAdmin method initiated: {}");
    Admin admin = adminRepository.findById(updateAdminDTO.getId()).orElseThrow(() -> new IllegalArgumentException("Admin not found: ID " + updateAdminDTO.getId()));
    admin = AdminMapper.INSTANCE.updateDtoToEntity(updateAdminDTO);
    Admin toBeUpdated = adminRepository.save(admin);
    logger.info("AdminServiceImpl updateAdmin method terminated: {}");
    return AdminMapper.INSTANCE.toDto(toBeUpdated);
  }
}
