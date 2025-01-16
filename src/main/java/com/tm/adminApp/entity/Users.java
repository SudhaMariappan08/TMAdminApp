package com.tm.adminApp.entity;

import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(
    name = "Users"
)
@Table(
    name = "Users"
)
public class Users {
  @Id
  @GeneratedValue(
      strategy = GenerationType.IDENTITY
  )
  @Column(
      nullable = false,
      columnDefinition = "INT",
      name = "id"
  )
  private Integer id;

  @Column(
      nullable = false,
      columnDefinition = "VARCHAR",
      name = "name"
  )
  private String name;

  @Column(
      nullable = false,
      columnDefinition = "VARCHAR",
      name = "email"
  )
  private String email;

  @Column(
      columnDefinition = "BIT",
      name = "isDeleted"
  )
  private Boolean isDeleted;

  @Column(
      columnDefinition = "VARCHAR",
      name = "created_by"
  )
  private String createdBy;

  @Column(
      columnDefinition = "DATETIME",
      name = "created_at"
  )
  private Date createdAt;

  @Column(
      columnDefinition = "VARCHAR",
      name = "updated_by"
  )
  private String updatedBy;

  @Column(
      columnDefinition = "DATETIME",
      name = "updated_at"
  )
  private Date updatedAt;

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

  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }
}
