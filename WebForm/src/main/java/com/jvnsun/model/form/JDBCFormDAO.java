package com.jvnsun.model.form;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCFormDAO implements FormDAO {

  private Connection conn;

  public JDBCFormDAO(Connection conn) {
    super();
    this.conn = conn;
  }

  @Override
  public void close() throws Exception {
    conn.close();
  }

  @Override
  public void create(Form f) {
    try (PreparedStatement ps = conn.prepareStatement(
        "INSERT INTO form (login, first_name, last_name, phone) VALUES (?, ?, ?, ?)")) {
      ps.setString(1, f.getLogin());
      ps.setString(2, f.getFirstName());
      ps.setString(3, f.getLastName());
      ps.setString(4, f.getPhone());
      ps.executeUpdate();
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public Form findById(int id) {
    try (PreparedStatement select = conn
        .prepareStatement("SELECT (login) FROM form WHERE id = ?")) {
      select.setInt(1, id);
      ResultSet form = select.executeQuery();
      if (form.next()) {
        return new Form(form.getLong(1), form.getString(2), form.getString(3),
            form.getString(4), form.getString(5));
      }
      return null;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public List<Form> findAll() {
    List<Form> list = new ArrayList<>();
    try (Statement select = conn.createStatement()) {
      select.execute("SELECT * FROM form");
      ResultSet form = select.getResultSet();
      while (form.next()) {
        list.add(new Form(form.getLong(1), form.getString(2), form.getString(3),
            form.getString(4), form.getString(5)));
      }
      return list;
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public void update(Form entity) {
    // TODO Auto-generated method stub

  }

  @Override
  public void delete(int id) {
    // TODO Auto-generated method stub

  }

}
