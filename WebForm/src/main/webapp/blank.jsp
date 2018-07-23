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
    <label>${form.login}</label>
    <input type="text" name="01login" value="${form.loginValue}"
      onfocus="this.value=''" style="background-color: ${form.loginBg}">
    <br> <label>${form.firstName}</label>
    <input type="text" name="02firstName" value="${form.firstNameValue}"
      onfocus="this.value=''" style="background-color: ${form.firstNameBg}">
    <br> <label>${form.lastName}</label>
    <input type="text" name="03lastName" value="${form.lastNameValue}"
      onfocus="this.value=''" style="background-color: ${form.lastNameBg}">
    <br> <label>${form.phone}</label>
    <input type="text" name="04phone" value="${form.phoneValue}"
      onfocus="this.value=''" style="background-color: ${form.phoneBg}">
    <br>
    <input type="submit" value="${form.submit}">
  </form>
</body>


</html>