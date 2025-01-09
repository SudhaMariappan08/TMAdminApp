package com.tm.adminApp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class UpdateUsersDTO {
  @NotNull
  private Integer id;

  @NotBlank
  @Size(
      max = 100
  )
  private String name;

  @NotBlank
  @Size(
      max = 100
  )
  private String email;

  private Boolean isdeleted;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

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
