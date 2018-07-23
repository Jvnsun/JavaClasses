<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${form.getField('title')}</title>
</head>
<body>
  <form action="Registration.do" method="post">
    <label>${form.getField("login")}</label>
    <input type="text" name="login" value="${form.getField('loginValue')}"
      onfocus="this.value=''"
      style="background-color: ${form.getField('loginBg')}">
    <br> <label>${form.getField('firstName')}</label>
    <input type="text" name="firstName"
      value="${form.getField('firstNameValue')}" onfocus="this.value=''"
      style="background-color: ${form.getField('firstNameBg')}">
    <br> <label>${form.getField('lastName')}</label>
    <input type="text" name="lastName" value="${form.getField('lastNameValue')}"
      onfocus="this.value=''"
      style="background-color: ${form.getField('lastNameBg')}">
    <br> <label>${form.getField('phone')}</label>
    <input type="text" name="phone" value="${form.getField('phoneValue')}"
      onfocus="this.value=''"
      style="background-color: ${form.getField('phoneBg')}">
    <br>
    <input type="submit" value="${form.getField('submit')}">
  </form>
</body>


</html>