package com.jvnsun.model.dao;

import com.jvnsun.model.form.FormDAO;

public abstract class DAOFactory {
  private static DAOFactory daoFactory;

  public abstract FormDAO formDAO();

  public static DAOFactory getInstance() {
    if (daoFactory == null) {
      synchronized (DAOFactory.class) {
        if (daoFactory == null) {
          DAOFactory temp = new JDBCDAOFactory();
          daoFactory = temp;
        }
      }
    }
    return daoFactory;
  }
}
