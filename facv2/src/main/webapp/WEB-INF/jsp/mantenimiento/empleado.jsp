<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="es">
<head>
<%@include file="../../../jspf/general.jspf"%>
</head>

<body>
	<%@include file="../../../jspf/header.jspf"%>
	<div id="loader-wrapper">
		<div id="loader"></div>
		<div class="loader-section section-left"></div>
		<div class="loader-section section-right"></div>
	</div>
	<div id="main">
		<div class="wrapper">
			<%@include file="../../../jspf/aside_left.jspf"%>
			<section id="contenido">
				<div id="table-datatables" class="card-panel">
					<div class="col s12 m8 l9 contT"></div>
				</div>
			</section>
		</div>
		<%@include file="../../../jspf/info_puesto.jspf"%>

	</div>
	<%@include file="../../../jspf/footer.jspf"%>
	<script src="<c:url value='/resources/js/jsEmpleado.js'></c:url>"
		type="text/javascript"></script>
</body>
</html>