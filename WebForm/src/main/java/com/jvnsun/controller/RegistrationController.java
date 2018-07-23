package com.jvnsun.controller;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jvnsun.model.form.Form;
import com.jvnsun.model.userbase.UserBase;

// TODO: Auto-generated Javadoc
/**
 * The Class RegistrationController.
 */
@WebServlet(
    urlPatterns = {
        "/Registration.do"
    }, initParams = {
        @WebInitParam(name = "localeBundle", value = "i18nBundle")
    }
)
public class RegistrationController extends HttpServlet {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -6371411476542370462L;
  private static ResourceBundle l10n;

  @Override
  public void init(ServletConfig config) throws ServletException {
    super.init(config);
    l10n = ResourceBundle.getBundle(config.getInitParameter("localeBundle"),
        Locale.getDefault());
  }

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    l10n = ResourceBundle.getBundle(
        this.getServletConfig().getInitParameter("localeBundle"),
        new Locale(request.getParameter("lang")));

    Form form = new Form(l10n);
    request.setAttribute("form", form);
    response.setContentType("text/html");
    request.getRequestDispatcher("/blank.jsp").forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    Form form = new Form(l10n);
    boolean invalidInput = false;
    for (Enumeration<String> fields = request.getParameterNames(); fields
        .hasMoreElements();) {
      String field = fields.nextElement();
      if (request.getParameter(field)
          .matches(l10n.getString(field + "Regexp"))) {
        form.setField(field + "Value", request.getParameter(field));
        form.setField(field + "Bg", "white");
      } else {
        invalidInput = true;
        form.setField(field + "Bg", "red");
      }
    }
    if (!invalidInput) {
      invalidInput = UserBase.checkAndProcess(form);
    }

    request.setAttribute("form", form);
    response.setContentType("text/html");
    if (invalidInput) {
      request.getRequestDispatcher("/blank.jsp").forward(request, response);
    } else {
      request.getRequestDispatcher("/report.jsp").forward(request, response);
    }

  }
}
