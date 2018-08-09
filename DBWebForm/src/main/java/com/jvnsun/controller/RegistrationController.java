package com.jvnsun.controller;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jvnsun.model.dao.DAOFactory;
import com.jvnsun.model.form.Form;
import com.jvnsun.model.form.FormDAO;

// TODO: Auto-generated Javadoc
/**
 * The Class RegistrationController.
 */
@WebServlet(
    urlPatterns = {
        "/Form"
    }, initParams = {
        @WebInitParam(name = "localeBundle", value = "i18nBundle")
    }
)
public class RegistrationController extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    request.getSession().setAttribute("l10n",
        ResourceBundle.getBundle(
            this.getServletConfig().getInitParameter("localeBundle"),
            new Locale(request.getParameter("lang"))));

    response.setContentType("text/html");
    request.getRequestDispatcher("/blank.jsp").forward(request, response);

  }

  @Override
  protected void doPost(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    ResourceBundle l10n = (ResourceBundle) request.getSession()
        .getAttribute("l10n");
    boolean invalidInput = false;
    String login = request.getParameter("login");
    if (!login.matches(l10n.getString("loginRegexp"))) {
      invalidInput = true;
    }
    try {
      
    }
    String fName = request.getParameter("firstName");
    if (!fName.matches(l10n.getString("firstNameRegexp"))) {
      invalidInput = true;
    }
    String lName = request.getParameter("lastName");
    if (!lName.matches(l10n.getString("lastNameRegexp"))) {
      invalidInput = true;
    }
    String phone = request.getParameter("phone");
    if (!phone.matches(l10n.getString("phoneRegexp"))) {
      invalidInput = true;
    }

    response.setContentType("text/html");
    if (invalidInput) {

      request.getRequestDispatcher("/blank.jsp").forward(request, response);
    } else {
      Form form = new Form(login, fName, lName, phone);
      FormDAO dao = DAOFactory.getInstance().formDAO();
      dao.create(form);
      response.getWriter().println("Form added to db");
    }

  }
}
