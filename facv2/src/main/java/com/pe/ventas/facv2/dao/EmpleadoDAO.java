package com.pe.ventas.facv2.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.pe.ventas.facv2.config.AppConfig;
import com.pe.ventas.facv2.dto.Empleado;
import com.pe.ventas.facv2.interfaz.CRUDOperations;

public class EmpleadoDAO implements CRUDOperations<Empleado> {
	String sql;
	DataSource d = AppConfig.getDataSource();

	private final JdbcTemplate jt;

	public EmpleadoDAO(DataSource dataSource) {
		jt = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Map<String, Object>> listar() {
		sql = "select * from empleado";
		return (ArrayList<Map<String, Object>>) jt.queryForList(sql);
	}

	@Override
	public int crear(Empleado ent) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modificar(Empleado ent) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(Empleado id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> buscar(Empleado id) {
		// TODO Auto-generated method stub
		return null;
	}

}
