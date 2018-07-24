package com.jvnsun.model.userbase;

import com.jvnsun.model.form.Form;

/**
 * Class representing model
 */
public final class UserBase {
  private UserBase() {}

  /**
   * Check if login is available and if it doesn't - modify corresponding field
   * in the form
   * 
   * @param f the form
   * @return true, if login is already used
   */
  public static boolean checkAndProcess(Form f) {
    String login = f.getField("loginValue");
    if (PredefinedLogins.logins.contains(login)) {
      f.setField("loginValue", "ALREADY USED");
      f.setField("loginBg", "yellow");
      return true;
    } else {
      return false;
    }
  }

}
