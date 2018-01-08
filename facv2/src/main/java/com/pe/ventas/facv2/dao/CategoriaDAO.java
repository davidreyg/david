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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modificar(Categoria ent) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminar(Categoria id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> buscar(Categoria id) {
		// TODO Auto-generated method stub
		return null;
	}

}
