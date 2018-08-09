package com.jvnsun.model.form;

import java.util.List;

public class FormService {
  private FormDAO dao;

  public FormService(FormDAO dao) {
    this.dao = dao;
  }

  public void persist(Form f) {
    dao.create(f);
  }

  public void checkLoginUniqueness(String login) throws LoginExistsException {
    List<Form> list = dao.findAll();
    for (Form f : list) {
      if (f.getLogin().equals(login)) {
        throw new LoginExistsException();
      }
    }
  }
}
