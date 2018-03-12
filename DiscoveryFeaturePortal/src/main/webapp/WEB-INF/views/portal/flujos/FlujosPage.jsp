<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Discovery WebApp</title>
    <!-- Bootstrap Core CSS -->
    <link href="<c:url value="/static/resources/assets//bootstrap/css/bootstrap.min.css"/>" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="<c:url value="/static/resources/assets/metisMenu/metisMenu.min.css"/>" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<c:url value="/static/resources/dist/css/sb-admin-2.css"/>" rel="stylesheet">
    
     <!-- Morris Charts CSS -->
    <link href="<c:url value="/static/resources/assets/morrisjs/morris.css"/>" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<c:url value="/static/resources/assets/font-awesome/css/font-awesome.min.css"/>" rel="stylesheet" type="text/css">
</head>
<script type="text/javascript" src="<c:url value="/static/resources/js/index.js"/>"></script>
<body>

	<div id="wrapper">
      <!-- 	menu de navegaci�n 	 -->
      <%@ include file="../template/header.html" %>
      <!-- 	menu de navegaci�n 	end -->
      
      
	</div>
   <!-- jQuery -->
    <script src="<c:url value="/static/resources/assets/jquery/jquery.min.js"/>" ></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<c:url value="/static/resources/assets/bootstrap/js/bootstrap.min.js"/>"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script  src="<c:url value="/static/resources/assets/metisMenu/metisMenu.min.js"/>"></script>
    
    <!-- Custom Theme JavaScript -->
    <script src="<c:url value="/static/resources/dist/js/sb-admin-2.js"/>"></script>

	<script type="text/javascript" src="<c:url value="/static/resources/js/app.js"/>"></script>

</body>
</html>