package com.tm.adminApp.service;

import com.tm.adminApp.dto.SaveUsersDTO;
import com.tm.adminApp.dto.UpdateUsersDTO;
import com.tm.adminApp.dto.UsersDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UsersService {
  Page<UsersDTO> getAllUsers(Pageable pageable);

  UsersDTO getUsersById(int id);

  UsersDTO saveUsers(SaveUsersDTO usersDTO);

  UsersDTO updateUsers(UpdateUsersDTO usersDTO);

  boolean deleteUsersById(int id);
}
