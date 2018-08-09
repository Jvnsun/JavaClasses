<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${l10n.getString('title')}</title>
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
}

;
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
		<form action="Form" method="post">
			<div id="left">
				<label for="i1">${l10n.getString("login")}</label> <br> <label
					for="i2">${l10n.getString('firstName')}</label> <br> <label
					for="i3">${l10n.getString('lastName')}</label> <br> <label
					for="i4">${l10n.getString('phone')}</label>
			</div>
			<div id="right">
				<input id="i1" type="text" name="login"> <br> <input
					id="i2" type="text" name="firstName"> <br> <input
					id="i3" type="text" name="lastName"> <br> <input
					id="i4" type="text" name="phone"> <br>
			</div>
			<div id="submitDiv">
				<input id="submit" type="submit" value="${l10n.getString('submit')}">
			</div>
		</form>
	</div>
</body>


</html>