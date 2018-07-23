package com.jvnsun.model;

public class Form {
  private String firstName = "";
  private String lastName = "";

  public Form() {}

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

  @Override
  public String toString() {
    return "Form: first name = " + this.firstName + " last name = "
        + this.lastName;
  }

}
