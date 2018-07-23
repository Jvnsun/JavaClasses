<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${form.title}</title>
</head>
<body>
  <form action="Registration.do" method="post">
    <label>${form.firstName}</label>
    <input type="text" name="firstName" value="${form.firstNameValue}"
      onfocus="this.value=''" style="background-color: ${form.firstNameBg}">
    <br> <label>${form.lastName}</label>
    <input type="text" name="lastName" value="${form.lastNameValue}"
      onfocus="this.value=''" style="background-color: ${form.lastNameBg}">
    <br>
    <input type="submit" value="${form.submit}">
  </form>
</body>


</html>