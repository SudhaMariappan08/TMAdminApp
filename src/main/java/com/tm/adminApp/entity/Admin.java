package com.tm.adminApp.entity;

import java.lang.Integer;
import java.lang.String;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(
    name = "Admin"
)
@Table(
    name = "Admin"
)
public class Admin {
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
}
