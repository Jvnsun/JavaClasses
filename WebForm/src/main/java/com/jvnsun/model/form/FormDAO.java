package com.jvnsun.model.form;

import java.util.List;

public interface FormDAO extends AutoCloseable {
    void create(Form f);
    Form findById(int id);
    List<Form> findAll();
    void update(Form entity);
    void delete(int id);
}
