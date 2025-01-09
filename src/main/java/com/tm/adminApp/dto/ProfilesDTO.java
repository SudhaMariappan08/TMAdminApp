package com.tm.adminApp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.lang.Integer;
import java.lang.String;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class ProfilesDTO {
  private Integer id;

  private UsersDTO users;

  private String bio;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UsersDTO getUsers() {
    return users;
  }

  public void setUsers(UsersDTO users) {
    this.users = users;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }
}
