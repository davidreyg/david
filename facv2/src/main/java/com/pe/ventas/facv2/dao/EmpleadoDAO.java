package com.pe.ventas.facv2.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.pe.ventas.facv2.config.AppConfig;
import com.pe.ventas.facv2.interfaz.CRUDOperations;

public class EmpleadoDAO implements CRUDOperations {

	String sql;
	PreparedStatement ps;
	CallableStatement cs;
	ResultSet rs;
	Connection cn;
	DataSource d = AppConfig.getDataSource();

	private final JdbcTemplate jt;

	public EmpleadoDAO(DataSource dataSource) {
	        jt = new JdbcTemplate(dataSource);
	    }

	@Override
	public ArrayList<Map<String, Object>> listar() {
		sql = "select * from empleado";
		return (ArrayList<Map<String, Object>>) jt.queryForList(sql);
	}

	@Override
	public boolean add(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean edit(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

}
