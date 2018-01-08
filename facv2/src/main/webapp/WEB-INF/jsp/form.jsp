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
	<div class="container">
		<div class="card-panel">
			<div class="row">
				<div class="col m12 s12  center-align">Buscar Empleado</div>
				<i class="fas fa-camera-retro fa-sm"></i>
				<div class="input-field col s12 m4	">
					<input id="txt_nombre" type="text" class="validate"> <label
						for="txt_nombre">DNI, nombre,telefono</label>
				</div>



				<div class="col m8 s12">
					<div class="right-align">
						<a
							class="btn-floating btn-medium waves-effect waves-light blue-grey"><i
							class="tiny material-icons">add</i></a> <a
							class="btn-floating btn-small waves-effect waves-light blue-grey"><i
							class=" tiny material-icons">local_printshop</i></a>
					</div>

				</div>
			</div>
		</div>

		<div id="table-datatables" class="card-panel">
			<div class="col s12 m8 l9 contT"></div>
		</div>

		<!-- 		<div class="row m12 s12 l12"> -->
		<!-- 			<div id="caja"> -->
		<!-- 				<div class="card-panel" id="contenido"> -->
		<!-- 					<div class="row"> -->
		<!-- 						<div class="col m12 s12 l12"> -->
		<!-- 							<div id="data-table-row-groupin" -->
		<!-- 								class="card-panel collapsible-body display #e3f2fd blue lighten-5" -->
		<!-- 								style="display: none;"> -->

		<!-- 								<div id="data-table-row-grouping col s12 m8 l9" -->
		<!-- 								class="card-panel display #e3f2fd blue lighten-5" -->
		<!-- 								style="position: absolute"> -->

		<!-- 								<div class="col s12 m8 l9 contT"></div> -->
		<!-- 								</div> -->

		<!-- 								<div class="col s12 m8 l9 contT"></div> -->


		<!-- 							</div> -->
		<!-- 						</div> -->
		<!-- 					</div> -->
		<!-- 				</div> -->
		<!-- 			</div> -->


		<!-- 		</div> -->



	</div>
<!-- 	<a class="waves-effect waves-light btn modal-trigger" href="#modal1">Modal</a> -->

	<!-- Modal Structure -->
	<div id="modal1" class="modal modal-fixed-footer">
		<div class="modal-content">
			<h4>Modal Header</h4>
			<p id="texto">A bunch of text</p>
		</div>
		<div class="modal-footer">
			<a href="#!"
				class="modal-action modal-close waves-effect waves-green btn-flat ">Agree</a>
		</div>
	</div>

	<!-- 	DATATABLES -->




	<%@include file="../../../jspf/info_puesto.jspf"%>


	<%@include file="../../jspf/footer.jspf"%>
	<script src="<c:url value='/resources/js/jsEmpleado.js'></c:url>"
		type="text/javascript"></script>
	<script type="text/javascript">
		// 			console.log("asdasdd");
		// 			console.log(div_ancho);
		// 			var div_ancho = $("#p").width();
		// 			var div_alto = $("#p").height();
		// 			var x = parseInt(div_ancho);
		// 			if (x > 1 && x < 500) {
		// 				alert(div_ancho);
		// 				$('#caja').css({
		// 					'width' : div_ancho,
		// 					'height' : div_alto,
		// 					'position' : 'relative',
		// 					'overflow' : 'auto'
		// 				});
		// 				$('#contenido').css({
		// 					'width' : '500px',
		// 					'height' : '200px'
		// 				});
		// 				//450 de ancho * 295 alto
		// 				var ps = new PerfectScrollbar('#caja');

		// 			} else {
		// 				// 				$("#caja").removeAttr('style');
		// 				// 				$("#contenido").removeAttr('style');
		// 			}
	</script>
</body>
</html>