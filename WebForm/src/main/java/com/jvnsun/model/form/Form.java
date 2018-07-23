package com.jvnsun.model.form;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class Form {
  private Map<String, String> fields;

  public Form() {
    this.fields = new HashMap<>();
  }

  public Form(Map<String, String[]> m) {
    this();
    m.forEach((k, v) -> {
      this.fields.put(k, v[0]);
    });
  }

  public Form(ResourceBundle localization) {
    this();
    PropertyResourceBundle l10nProps = (PropertyResourceBundle) localization;
    for (Enumeration<String> keys = l10nProps.getKeys(); keys
        .hasMoreElements();) {
      String key = keys.nextElement();
      String value = l10nProps.getString(key);
      this.fields.put(key, value);
    }
  }

  public String getField(String k) {
    return this.fields.get(k);
  }

  public void setField(String k, String v) {
    this.fields.put(k, v);
  }

}
