$(document).ready(function() {
//	alert();
	listar();
});

function listar() {
	$.getJSON(
			facv2_context_path + "/mantenimiento/empleado",
			"opc=1",
			function(objJson) {
				var s = "";
				var lista = objJson;
				console.log(objJson);
				if (lista.length > 0) {
					 console.log("si hay datos causita c:");

					for (var i = 0; i < lista.length; i++) {
						var a = parseInt(i) + 1;
//						var MFL = parseInt(lista[i].ES_MFL);
//						var Motivo = parseInt(lista[i].LI_MOTIVO);
//						var plazo = parseInt(lista[i].VAL_PLAZO);
//						var fe_creacion = new Date(
//								lista[i].FECHA_RENUNCIA);
//						var mesInt = parseInt(fe_creacion
//								.getMonth()) + 1;
//						var mes = ParsearMes(mesInt);
//						var mfl="";
//						if(lista[i].VAL_PLAZO=='1'){
//							 mfl="Sí"
//						}else{
//							 mfl="No";
//						}
						var p = "";
						var f = "";
						var t = "";
						var ct = "";
//						(Motivo === 1) ? p = "Trabajador Nuevo"
//								: ((Motivo === 2) ? p = "Renovación"
//										: p = "No Registrado");
//						(MFL === 1) ? f = "Si"
//								: f = "No";
//						(plazo === 1) ? t = "Cumplió Plazo"
//								: t = "No Cumplió";
//						(plazo === 1) ? ct = "green accent-3"
//								: ct = "red darken-1";
						s += '<tr>';
						s += '<td>'
								+ a
								+ '<label  class="idc" hidden>'
								+ lista[i].id_empleado
								+ '</label></td>';
						s += '<td>'
								+ lista[i].apel_emp+" " +lista[i].nom_emp;
								+ '</td>';
						s += '<td>'
								+ lista[i].dni_emp
								+ '</td>';
						s += '<td>' + lista[i].dir_emp
								+ '</td>';
						s += '<td>' + lista[i].fnac_emp
								+ '</td>';
						s += '<td>'
								+ lista[i].sex_emp
								+ '</td>';
						s += '<td>'
								+ lista[i].tel_emp+
							'</td>';
			
						s += '<td>'
							+lista[i].ema_emp+
							 '</td>';
						s += '<td><a class="btn-floating btn-medium waves-effect waves-light blue-grey"><i class="material-icons">edit</i></a>';
						s += '</td>';
						s += '</tr>';
					}

				} else {
					console.log("no hay datos");
					s += "";
				}
				

				var r = createTable();
				$(".contT").empty();
				$(".contT").append(r);
				$("#dataReq").empty();
				$("#dataReq").append(s);
				$("#data-table-row-grouping")
						.DataTable();
				console.log("hasta aqui llega");

//				$(".notificar").click(
//						function() {
//
//							cantidad = $(this).parents(
//									"tr").find("td")
//									.eq(0)
//									.find(".idc")
//									.text();
//							console.log(cantidad);
//
//							DetalleRenuncia(cantidad);
//
//							$("#otros").val(cantidad);					
//						});
			});
}

function createTable() {
	var s = '<table id="data-table-row-grouping" class="display" cellspacing="0" width="100%" style="position:relative;font-size:14px"';
	s += 'cellspacing="0">';
	s += '<thead>';
	s += '<tr>';
	s += '<th>Nº</th>';
	s += '<th>Apellidos y Nombres</th>';
	s += '<th>DNI</th>';
	s += '<th>Direccion</th>';
	s += '<th>Fecha de Nacimiento</th>';
	s += '<th>Genero</th>';
	s += '<th>Telefono</th>';
	s += '<th>Correo</th>';
	s += '<th>xd</th>';	
	s += '</tr>';
	s += '</thead>';
	s += '<tbody id="dataReq">';
	s += '</tbody>';
	s += '</table>';
	return s;
}