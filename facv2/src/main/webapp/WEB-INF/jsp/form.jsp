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

	<div class="container">
		<!-- Page Content goes here -->


		<div class="row">

			<div class="card-panel">
				<div class="row">
					<div class="col m12 s12  center-align">Buscar Empleado</div>
					<div class="input-field col s12 m4	">
						<i class="mdi-action-pageview"></i><input id="txt_nombre"
							type="text" class="validate"> <label for="txt_nombre">DNI, nombre,telefono</label>
					</div>



					<div class="col m8 s12">
						<div class="right-align">
							<a
								class="btn-floating btn-medium waves-effect waves-light blue-grey"><i
								class="material-icons">add</i></a> <a
								class="btn-floating btn-small waves-effect waves-light blue-grey"><i
								class="material-icons">local_printshop</i></a>
						</div>

					</div>
				</div>
			</div>

		</div>


		<div class="row">

			<div class="card-panel">
				<div class="row">
					<div class="col m12 s12 l12">
						<table class=" centered bordered">
							<thead>
								<tr>
									<th>Nombre</th>
									<th>DNI</th>
									<th>Telefono</th>
									<th>sd   </th>
								</tr>
							</thead>

							<tbody>
								<tr>
									<td>Alvin</td>
									<td>Eclair</td>
									<td>$0.87</td>
									<td><div class="s12 m12">
									<a
										class="btn-floating btn-medium waves-effect waves-light blue-grey"><i
											class="material-icons">remove_red_eye</i></a>
											<a
										class="btn-floating btn-medium waves-effect waves-light blue-grey"><i
											class="material-icons">edit</i></a>
											<a
										class="btn-floating btn-medium waves-effect waves-light blue-grey"><i
											class="material-icons">delete</i></a></div></td>
								</tr>
								<tr>
									<td>Alan</td>
									<td>Jellybean</td>
									<td>$3.76</td>
								</tr>
								<tr>
									<td>Jonathan</td>
									<td>Lollipop</td>
									<td>$7.00</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>

		</div>






	</div>



	<%@include file="../../../jspf/info_puesto.jspf"%>


	<%@include file="../../jspf/footer.jspf"%>

	<script type="text/javascript">
		$(document).ready(function() {
			// 			alert();
		});
	</script>
</body>
</html>