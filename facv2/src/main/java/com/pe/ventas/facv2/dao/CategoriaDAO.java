package com.pe.ventas.facv2.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.pe.ventas.facv2.config.AppConfig;
import com.pe.ventas.facv2.dto.Categoria;
import com.pe.ventas.facv2.interfaz.CRUDOperations;

public class CategoriaDAO implements CRUDOperations<Categoria> {

	String sql;
	DataSource d = AppConfig.getDataSource();

	private final JdbcTemplate jt;

	public CategoriaDAO(DataSource dataSource) {
		jt = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Map<String, Object>> listar() {

		sql = "select * from categoria";
		return (ArrayList<Map<String, Object>>) jt.queryForList(sql);

		// TODO Auto-generated method stub
	}

	@Override
	public int crear(Categoria ent) {

		int x = 0;
		String sql = "INSERT INTO categoria(nom_cat) VALUES (?);";
		try {
			jt.update(sql, new Object[] { ent.getNom_cat() });
			x = 1;
		} catch (Exception e) {
			System.out.println("Error al crear JDBCTEMPLATE: " + e);
		}
		return x;

	}

	@Override
	public int modificar(Categoria ent) {
		int x = 0;
		String sql = "UPDATE categoria SET `nom_cat`=?;";
		try {
			jt.update(sql, new Object[] { ent.getNom_cat() });
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
	}

	@Override
	public int eliminar(Categoria id) {
		int x = 0;
		String sql = "DELETE FROM categoria WHERE id_categoria=?";
		try {
			jt.update(sql, new Object[] { id.getId_categoria() });
			x = 1;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		return x;
	}

	@Override
	public List<Map<String, Object>> buscar(Categoria id) {
		List<Map<String, Object>> emp = jt.queryForList("select * from empleado where id_categoria=?",
				new Object[] { id.getId_categoria() });
		return emp;
	}

}
