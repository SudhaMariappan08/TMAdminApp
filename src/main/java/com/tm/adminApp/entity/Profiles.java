package com.tm.adminApp.entity;

import java.lang.Integer;
import java.lang.String;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity(
    name = "Profiles"
)
@Table(
    name = "Profiles"
)
public class Profiles {
  @Id
  @GeneratedValue(
      strategy = GenerationType.IDENTITY
  )
  @Column(
      nullable = false,
      columnDefinition = "INT"
  )
  private Integer id;

  @OneToOne(
      cascade = CascadeType.ALL,
      fetch = FetchType.LAZY
  )
  @JoinColumn(
      name = "user_id",
      referencedColumnName = "id"
  )
  private Users users;

  @Column(
      columnDefinition = "TEXT"
  )
  private String bio;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Users getUsers() {
    return users;
  }

  public void setUsers(Users users) {
    this.users = users;
  }

  public String getBio() {
    return bio;
  }

  public void setBio(String bio) {
    this.bio = bio;
  }
}
