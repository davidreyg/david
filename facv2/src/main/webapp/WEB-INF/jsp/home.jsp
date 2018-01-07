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
	<div id="main">
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
				
		function listar() {
		    $.get("mantenimiento/empleado",{opc:1},function (data, status){
		    	console.log("DATA DE PRUEBAS");
		    	
   				if (data==null) {
					
				} else {
					console.log(data);
		             $.confirm({
		                    title: 'A secure action',
		                    content: 'Its smooth to do multiple confirms at a time. <br> Click confirm or cancel for another modal',
		                    icon: 'fa fa-question-circle',
		                    animation: 'scale',
		                    closeAnimation: 'scale',
		                    opacity: 0.5,
		                    buttons: {
		                        'confirm': {
		                            text: 'Proceed',
		                            btnClass: 'btn-blue',
		                            action: function () {
		                                $.confirm({
		                                    title: 'This maybe critical',
		                                    content: 'Critical actions can have multiple confirmations like this one.',
		                                    icon: 'fa fa-warning',
		                                    animation: 'scale',
		                                    closeAnimation: 'zoom',
		                                    buttons: {
		                                        confirm: {
		                                            text: 'Yes, sure!',
		                                            btnClass: 'btn-orange',
		                                            action: function () {
		                                                $.alert('A very critical action <strong>triggered!</strong>');
		                                            }
		                                        },
		                                        cancel: function () {
		                                            $.alert('you clicked on <strong>cancel</strong>');
		                                        }
		                                    }
		                                });
		                            }
		                        },
		                        cancel: function () {
		                            $.alert('you clicked on <strong>cancel</strong>');
		                        },
		                        moreButtons: {
		                            text: 'something else',
		                            action: function () {
		                                $.alert('you clicked on <strong>something else</strong>');
		                            }
		                        },
		                    }
		                });
				}
		        
		    });
		}
		
		function buscar(id){
						
		}
	</script>
</body>
</html>