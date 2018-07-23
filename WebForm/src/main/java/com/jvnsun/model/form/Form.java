package com.jvnsun.model.form;

import java.util.LinkedHashMap;
import java.util.Map;

public class Form {
  private LinkedHashMap<String, String> fields;

  public Form() {
    this.fields = new LinkedHashMap<>();
  }

  public Form(Map<String, String> f) {
    this.fields = this.cloneForm(f);
  }

  public Form(LinkedHashMap<String, String> fields) {
    this.fields = (LinkedHashMap<String, String>) fields.clone();
  }

  private LinkedHashMap<String, String> cloneForm(Map<String, String> f) {
    if (f instanceof LinkedHashMap<?, ?>) {
      return (LinkedHashMap<String, String>) fields.clone();
    }
  }
}
