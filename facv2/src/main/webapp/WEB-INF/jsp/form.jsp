<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
<%@include file="../../jspf/general.jspf"%>
</head>

<body>
	<%@include file="../../jspf/header.jspf"%>
	<!-- 	<div id="loader-wrapper"> -->
	<!-- 		<div id="loader"></div> -->
	<!-- 		<div class="loader-section section-left"></div> -->
	<!-- 		<div class="loader-section section-right"></div> -->
	<!-- 	</div> -->
	<div id="main" class="container">
		<div class="wrapper">
			<section id="content">
				<a href="#" onclick="listar()">HOLA MUNDO</a>
			</section>
		</div>
		<%@include file="../../../jspf/info_puesto.jspf"%>

	</div>
	<%@include file="../../jspf/footer.jspf"%>

	<script type="text/javascript">
		$(document).ready(function() {
// 			alert();
		});
				
	
	</script>
</body>
</html>