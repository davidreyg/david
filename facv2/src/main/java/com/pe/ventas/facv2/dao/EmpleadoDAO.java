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
	public List<Map<String, Object>> listar() {
		sql = "select * from empleado";
		return (ArrayList<Map<String, Object>>) jt.queryForList(sql);
	}

	@Override
	public int crear(Empleado ent) {
		int x = 0;
		String sql = "INSERT INTO empleado(`nom_emp`, `apel_emp`, `tel_emp`, `dir_emp`, `sex_emp`, `fnac_emp`, `dni_emp`, `ema_emp`) VALUES (?,?,?,?,?,?,?,?);";
		try {
			jt.update(sql, new Object[] { ent.getNom_emp(), ent.getApel_emp(), ent.getTel_emp(), ent.getDir_emp(),
					ent.getSex_emp(), ent.getFnac_emp(), ent.getDni_emp(), ent.getEma_emp() });
			x = 1;
		} catch (Exception e) {
			System.out.println("Error al crear JDBCTEMPLATE: " + e);
		}
		return x;
	}

	@Override
	public int modificar(Empleado ent) {
		int x = 0;
		String sql = "UPDATE empleado SET `nom_emp`=?, `apel_emp`=?, `tel_emp`=?, `dir_emp`=?, `sex_emp`=?, `fnac_emp`=?, `dni_emp`=?, `ema_emp`=? WHERE `id_empleado`=?;";
		try {
			jt.update(sql, new Object[] { ent.getNom_emp(), ent.getApel_emp(), ent.getTel_emp(), ent.getDir_emp(),
					ent.getSex_emp(), ent.getFnac_emp(), ent.getDni_emp(), ent.getEma_emp(), ent.getId_empleado() });
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
	}

	@Override
	public int eliminar(Empleado id) {
		int x = 0;
		String sql = "DELETE FROM empleado WHERE id_empleado=?";
		try {
			jt.update(sql, new Object[] { id.getId_empleado() });
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
	}

	@Override
	public List<Map<String, Object>> buscar(Empleado id) {
		List<Map<String, Object>> emp = jt.queryForList(
				"select * from empleado where id_empleado=?",
				new Object[] { id.getId_empleado() });
		return emp;
	}
}
