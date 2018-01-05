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
import com.pe.ventas.facv2.dto.Empleado;
import com.pe.ventas.facv2.interfaz.CRUDOperations;

public class EmpleadoDAO implements CRUDOperations<Empleado> {

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
	public int crear(Empleado ent) {
		int x = 0;
		String sql = "INSERT INTO empleado(`nom_emp`, `apel_emp`, `tel_emp`, `dir_emp`, `est_emp`, `sex_emp`, `fnac_emp`, `dni_emp`, `ema_emp`) VALUES (?,?,?,?,?,?,?,?,?);";
		try {
			jt.update(sql, new Object[] { ent.getNom_emp() });
			x = 1;
		} catch (Exception e) {
			System.out.println("Error al crear JDBCTEMPLATE: " + e);
		}
		return x;
	}

	@Override
	public int modificar(Empleado id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(Empleado id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Map<String, Object>> buscar(Empleado id) {
		// TODO Auto-generated method stub
		return null;
	}
}
