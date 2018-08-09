package com.jvnsun.model.form;

public class Form {
  private long id;
  private String login;
  private String firstName;
  private String lastName;
  private String phone;

  public Form(String login, String firstName, String lastName, String phone) {
    // TODO check login
    this.login = login;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
  }

  public Form(Long id, String login, String firstName, String lastName,
      String phone) {
    this.id = id;
    this.login = login;
    this.firstName = firstName;
    this.lastName = lastName;
    this.phone = phone;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }
}
