<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Necklace</title>
<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="style.css">

</head>
<body>

  <div class="container">
    <div class="page-header text-center">
      <h1>Necklace with gems of ids 3, 4, 5, 6, 7 sorted by price with clarity within Tp and IF</h1>
    </div>
    <div class="row text-center">
      <c:forEach var="gem" items="${necklaceSortedRetained.gems}">
        <div class="col-lg-4 item">
          <c:forEach var="row" items="${gem.getDescription()}">
            <p>${row}</p>
          </c:forEach>
        </div>
      </c:forEach>
    </div>
    <hr>
    <div class="row text-center">
      <div class="col-lg-4">Price: ${necklaceSortedRetained.price}</div>
      <div class="col-lg-4">Carats: ${necklaceSortedRetained.carats}</div>
      <div class="col-lg-4">Grams: ${necklaceSortedRetained.grams}</div>
    </div>
  </div>
  <script src="bootstrap/js/jquery-3.3.1.js"></script>
  <script src="bootstrap/js/bootstrap.js"></script>

</body>
</html>