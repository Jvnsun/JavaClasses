<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${form.getField('title')}</title>
<style type="text/css">
@charset "UTF-8";

#main {
	margin-left: 35%;
	width: 30%;
	text-align: center;
	font-family: Helvetica;
}

#left {
	width: 50%;
	text-align: left;
	line-height: 2.5;
	float: left;
}

#right {
	width: 50%;
	text-align: right;
	float: right;
}

#right input {
	margin: 8px;
	background-color: ${form.getField('loginValue')};
}

#submit {
	margin-top: 10px;
	buttom: 0;
	clear: both;
}

#submitDiv {
	buttom: 0;
	clear: both;
}
</style>
</head>
<body>
  <div id="main">
    <form action="Registration.do" method="post">
      <div id="left">
        <label for="i1">${form.getField("login")}</label> <br> <label
          for="i2">${form.getField('firstName')}</label> <br> <label
          for="i3">${form.getField('lastName')}</label> <br> <label
          for="i4">${form.getField('phone')}</label>
      </div>
      <div id="right">
        <input id="i1" type="text" name="login"
          value="${form.getField('loginValue')}" onfocus="this.value=''"
          style="background-color: ${form.getField('loginBg')};">
        <br>
        <input id="i2" type="text" name="firstName"
          value="${form.getField('firstNameValue')}" onfocus="this.value=''"
          style="background-color: ${form.getField('firstNameBg')};">
        <br>
        <input id="i3" type="text" name="lastName"
          value="${form.getField('lastNameValue')}" onfocus="this.value=''"
          style="background-color: ${form.getField('lastNameBg')};">
        <br>
        <input id="i4" type="text" name="phone"
          value="${form.getField('phoneValue')}" onfocus="this.value=''"
          style="background-color: ${form.getField('phoneBg')};">
        <br>
      </div>
      <div id="submitDiv">
        <input id="submit" type="submit" value="${form.getField('submit')}">
      </div>
    </form>
  </div>
</body>


</html>