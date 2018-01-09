<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@include file="../../jspf/general.jspf"%>
<link rel="stylesheet"
	href="<c:url value='resources/css/custom/menu.css'/>" />
</head>
<body>
	<%-- 	<%@include file="../../jspf/header.jspf"%> --%>
	<center>
		<div id="contMod" style="margin-top: 10%"></div>
	</center>
	<%@include file="../../jspf/footer.jspf"%>
	<script type="text/javascript">
		$(document).ready(function() {
			listarModulos();
		});

		function listarModulos() {
			var url = "componentes";
			var data = "opc=modulos";
			$.getJSON(url, data, function(objJson) {
				var list = objJson.lista;
				console.log(list);
				var s = "";
				if (list.length > 0) {
					for (var i = 0; i < list.length; i++) {
						console.log(i);
						var idmod = list[i].ID_MODULO;
						var nom = list[i].NOM_MOD;
						var ico = list[i].ICO_MOD;
						var color = list[i].COL_MOD;
						var link = list[i].DF_MOD;
						s += createModulo(idmod, nom, ico, color, link);
					}
					$("#contMod").empty();
					$("#contMod").append(s);
				}
			});
		}

		function createModulo(idmodulo, nombre, icon, color, link) {
			console.log(idmodulo + "*" + link+"*"+color);
			var s = '<div class="circulo waves-effect waves-light"  id="'
					+ idmodulo + "*" + link + '" onclick="show(this.id)">';

			s += '<div class="circulo2">';
			s += '<i class="contA '+icon+' medium icon-demo size-icon" style="color:'+color+';"></i>';
			s += '<h6 class="contB light italic">' + nombre + '</h6>';
			s += '</div>';

			s += '</div>';
			s += '</div>';
			return s;
		}

		function show(id) {

			try {
				var m = id.split("*");
				var n = m[0];
				var p = m[1];
				$.getJSON("componentes?opc=redMod", "idmod=" + n, function(
						objJson) {
					if (objJson.rpta) {
						location.href = p;
					}
				});
			} catch (e) {
				console.error(e);
			}
		}
	</script>

</body>
</html>