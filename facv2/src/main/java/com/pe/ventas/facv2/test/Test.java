package com.pe.ventas.facv2.test;

import javax.sql.DataSource;

import com.google.gson.Gson;
import com.pe.ventas.facv2.config.AppConfig;
import com.pe.ventas.facv2.config.UserDetailsServiceImpl;
import com.pe.ventas.facv2.dao.EmpleadoDAO;
import com.pe.ventas.facv2.dto.CustomUser;


public class Test {

	public static DataSource d = AppConfig.getDataSource();
	public static Gson gs = new Gson();
	public static EmpleadoDAO au = new EmpleadoDAO(d);

	public static void main(String[] args) {
//		conect();
//		checkSecurityDaoAuthentication();
		// gilber cambio
		// Autorizar();
		 Emp_listar();
		// Procesar1();
		// Renuncia();
	}

	public static void conect() {

		DataSource d = AppConfig.getDataSource();

		if (d != null) {
			System.out.println("Conectado");
		} else {
			System.out.println("No se pudo conectar");
		}
	}

	public static void checkSecurityDaoAuthentication() {
		UserDetailsServiceImpl userdetailsService = new UserDetailsServiceImpl();
		CustomUser user = userdetailsService.loadUserByUsername("abr");
		System.out.println("nombre: " + user.getUsername());
		System.out.println("password: " + user.getPassword());
		System.out.println("checked!");

	}
	
	public static void Emp_listar() {
		System.out.println(gs.toJson(au.listar()));
	}

}
