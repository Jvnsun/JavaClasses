<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${form.getField('title')}</title>
</head>
<body>
  <p>${form.getField('congratulation')}</p>
  <ul>
    <li>${form.getField("login")}${form.getField('loginValue')}</li>
    <li>${form.getField("firstName")}${form.getField('firstNameValue')}</li>
    <li>${form.getField("lastName")}${form.getField('lastNameValue')}</li>
    <li>${form.getField("phone")}${form.getField('phoneValue')}</li>
  </ul>
</body>
</html>