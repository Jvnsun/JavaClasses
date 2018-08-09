package com.jvnsun.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.jvnsun.model.form.FormDAO;
import com.jvnsun.model.form.JDBCFormDAO;

public class JDBCDAOFactory extends DAOFactory {

  @Override
  public FormDAO formDAO() {
    return new JDBCFormDAO(newConnection());
  }

  private Connection newConnection() {
    try {
      return DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/form_db?serverTimezone=UTC", "root",
          "1337");
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

}
