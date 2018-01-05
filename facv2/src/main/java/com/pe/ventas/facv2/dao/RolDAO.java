/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.ventas.facv2.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pe.ventas.facv2.config.AppConfig;
import com.pe.ventas.facv2.dto.Rol;
import com.pe.ventas.facv2.interfaz.CRUDOperations;;

public class RolDAO implements CRUDOperations<Rol> {

	String sql;
	PreparedStatement ps;
	CallableStatement cs;
	ResultSet rs;
	Connection cn;
	DataSource d = AppConfig.getDataSource();

	private final JdbcTemplate jt;

	public RolDAO(DataSource dataSource) {
		jt = new JdbcTemplate(dataSource);
	}

	public List<Map<String, Object>> listar() {
		sql = "select * from RHTR_ROL order by no_rol asc";
		return (ArrayList<Map<String, Object>>) jt.queryForList(sql);
	}

	public ArrayList<Map<String, Object>> List_rol(Object idrol) {
		sql = "select * from rol where trim(id_rol)=?";
		return (ArrayList<Map<String, Object>>) jt.queryForList(sql, idrol.toString().trim());
	}

	public ArrayList<Map<String, Object>> List_Modulos(Object idrol) {
		sql = "select DISTINCT(ID_MODULO) AS ID_MODULO from  VISTA_PRIVILEGIOS WHERE trim(id_rol)=?";
		return (ArrayList<Map<String, Object>>) jt.queryForList(sql, idrol.toString().trim());
	}

	public ArrayList<Map<String, Object>> Listar_Rol_Privilegio(String idrol) {
		sql = "SELECT P.NO_LINK, e.ES_DETALLE_PRIVILEGIO,e.ID_DETALLE_PRIVILEGIO FROM RHTD_DETALLE_PRIVILEGIO e , RHTR_ROL r, RHTV_PRIVILEGIO WHERE e.ID_ROL = r.ID_ROL AND e.ID_PRIVILEGIO=P.ID_PRIVILEGIO AND e.ID_ROL =?";
		return (ArrayList<Map<String, Object>>) jt.queryForList(sql, idrol.trim());
	}

	@Override
	public int crear(Rol ent) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modificar(Rol id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(Rol id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> buscar(Rol id) {
		// TODO Auto-generated method stub
		return null;
	}

}
