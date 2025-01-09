package com.tm.adminApp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.lang.Boolean;
import java.lang.String;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class SaveUsersDTO {
  private String name;

  private String email;

  private Boolean isdeleted;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Boolean getIsdeleted() {
    return isdeleted;
  }

  public void setIsdeleted(Boolean isdeleted) {
    this.isdeleted = isdeleted;
  }
}
