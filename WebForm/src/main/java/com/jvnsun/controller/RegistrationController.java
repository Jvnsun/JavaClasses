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

// TODO: Auto-generated Javadoc
/**
 * The Class RegistrationController.
 */
@WebServlet(
    urlPatterns = {
        "/Registration.do"
    }, initParams = {
        @WebInitParam(name = "i18nBundle", value = "i18nBundle")
    }
)
public class RegistrationController extends HttpServlet {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -6371411476542370462L;

  /*
   * (non-Javadoc)
   * 
   * @see javax.servlet.GenericServlet#init(javax.servlet.ServletConfig)
   */
  @Override
  public void init(ServletConfig config) throws ServletException {}

  /*
   * (non-Javadoc)
   * 
   * @see
   * javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest,
   * javax.servlet.http.HttpServletResponse)
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    ResourceBundle localeBundle = ResourceBundle.getBundle(
        this.getServletConfig().getInitParameter("i18nBundle"),
        new Locale(request.getParameter("lang")));
    response.setContentType("text/html");
    request.setAttribute("title", localeBundle.getString("title"));
    request.setAttribute("firstName", localeBundle.getString("firstName"));
    request.setAttribute("lastName", localeBundle.getString("lastName"));
    request.setAttribute("submit", localeBundle.getString("submit"));
    request.setAttribute("firstNameBg", "white");
    request.setAttribute("lastNameBg", "white");
    request.setAttribute("firstNameValue", localeBundle.getString("firstName"));
    request.setAttribute("lastNameValue", localeBundle.getString("lastName"));
    request.getRequestDispatcher("/blank.jsp").forward(request, response);

  }

  /*
   * (non-Javadoc)
   * 
   * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.
   * HttpServletRequest, javax.servlet.http.HttpServletResponse)
   */
  @Override
  protected void doPost(HttpServletRequest request,
      HttpServletResponse response) throws ServletException, IOException {
    ResourceBundle localeBundle = ResourceBundle.getBundle(
        this.getServletConfig().getInitParameter("i18nBundle"),
        new Locale(request.getParameter("lang")));
    boolean invalidInput = false;
    for (Enumeration<String> fields = request.getParameterNames(); fields
        .hasMoreElements();) {
      String field = fields.nextElement();
      if (request.getParameter(field)
          .matches(localeBundle.getString(field + "Value"))) {
        request.setAttribute(field + "Value", request.getParameter(field));
        request.setAttribute(field + "Bg", "white");
      } else {
        invalidInput = true;
        request.setAttribute(field + "Value", "INVALID");
        request.setAttribute(field + "Bg", "red");
      }
    }
    if (invalidInput) {
      response.setContentType("text/html");
      request.setAttribute("title", localeBundle.getString("title"));
      request.setAttribute("firstName", localeBundle.getString("firstName"));
      request.setAttribute("lastName", localeBundle.getString("lastName"));
      request.setAttribute("submit", localeBundle.getString("submit"));
      request.setAttribute("inputBgColor", "red");
      request.getRequestDispatcher("/blank.jsp").forward(request, response);
    } else {
      response.getWriter().append("Cool!");
    }

  }

}
