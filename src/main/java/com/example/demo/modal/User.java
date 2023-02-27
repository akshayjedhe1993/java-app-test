package com.example.demo.modal;

public class User {

  private Long id;
  private String name;
  private String email;
  private String role;
  private String description;

  User() {}

  public User(Long id, String name, String email, String role, String description) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.role = role;
    this.description = description;
  }

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public String getEmail() {
    return this.email;
  }

  public String getRole() {
    return this.role;
  }

  public String getDescription() {
    return this.description;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
