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
<!-- custom vue online -->
<script src="https://cdn.jsdelivr.net/npm/vue"></script>
<script src="https://cdn.jsdelivr.net/npm/vue-resource@1.5.0"></script>
<script type="text/javascript" src="<c:url value="/static/resources/js/index.js"/>"></script>
<script type="text/javascript" src="<c:url value="/static/resources/js/requestRouter.js"/>"></script>
<body>

	<div id="wrapper">
      <!-- 	menu de navegación 	 -->
      <%@ include file="../template/header.html" %>
      <!-- 	menu de navegación 	end -->
      
       <!-- Page Content -->
        <div id="page-wrapper">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">Feature discovery dashboard general</h1>
                    </div>
                    <!-- /.col-lg-12 -->
                    
                      <!--  importando resumen  -->
                    <%@ include file="resumen-row.html" %>
                      <!-- // importando resumen  end-->
                    
                </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
        </div>
        <!-- /#page-wrapper -->
      
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