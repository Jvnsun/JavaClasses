package model.impl;

import model.api.Field;
import model.impl.regexp.LatinRegExps;
import model.impl.regexp.RegExps;

// TODO Add appliable value explanation for user
public enum PersonForm implements Field {
  Name(LatinRegExps.name), Surname(LatinRegExps.surname), Nick(RegExps.nickname), Phone(RegExps.phoneNumber);

  private String regExp;

  private PersonForm(String regExp) {
    this.regExp = regExp;
  }

  @Override
  public String getName() {
    return this.name();
  }

  @Override
  public String getRegExp() {
    return this.regExp;
  }

}
