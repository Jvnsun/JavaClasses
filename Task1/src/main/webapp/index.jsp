<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>BTSTRP</title>
<link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
</head>
<body>

  <div class="container">
    <div class="page-header text-center">
      <h1>Choose gems to include in necklace</h1>
    </div>
    <div class="row text-center">
      <c:forEach var="gem" items="${necklace.gems}">
        <div class="col-lg-4">
          <c:forEach var="row" items="${gem.getDescription()}">
            <p>${row}</p>
          </c:forEach>
        </div>
      </c:forEach>
    </div>
    <hr>
    <div class="row text-center">
      <div class="col-lg-4">Price: ${necklace.price/100}</div>
      <div class="col-lg-4">Carats: ${necklace.carats/100}</div>
      <div class="col-lg-4">Grams: ${necklace.grams/100}</div>
    </div>
    <!--     <form method="get" target="#"> -->
    <!--       <table class="table table-striped text-center table-sm"> -->

    <!--         <thead class="thead-dark"> -->
    <!--           <tr> -->
    <!--             <th scope="col">Include</th> -->
    <!--             <th scope="col">Id</th> -->
    <!--             <th scope="col">Clarity</th> -->
    <!--           </tr> -->
    <!--         </thead> -->
    <!--         <tbody> -->
    <%--           <c:forEach var="gem" items="${gems}"> --%>
    <!--             <tr> -->
    <!--               <td><input type="checkbox" name="loh" value="you"></td> -->
    <%--               <td>${gem.getId()}</td> --%>
    <%--               <td>${gem.getPrice()}</td> --%>
    <!--             </tr> -->
    <%--           </c:forEach> --%>
    <!--         </tbody> -->
    <!--       </table> -->

    <!--       <input type="submit" value="Submit" -->
    <!--         class="btn btn-primary btn-lg btn-block"> -->


    <!--     </form> -->
  </div>
  <script src="bootstrap/js/jquery-3.3.1.js"></script>
  <script src="bootstrap/js/bootstrap.js"></script>

</body>
</html>