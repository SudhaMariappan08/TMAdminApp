package com.tm.adminApp.service;

import com.tm.adminApp.dto.AdminDTO;
import com.tm.adminApp.dto.SaveAdminDTO;
import com.tm.adminApp.dto.UpdateAdminDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AdminService {
  Page<AdminDTO> getAllAdmin(Pageable pageable);

  AdminDTO getAdminById(int id);

  AdminDTO saveAdmin(SaveAdminDTO adminDTO);

  AdminDTO updateAdmin(UpdateAdminDTO adminDTO);
}
