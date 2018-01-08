package com.pe.ventas.facv2.test;

import javax.sql.DataSource;

import com.google.gson.Gson;
import com.pe.ventas.facv2.config.AppConfig;
import com.pe.ventas.facv2.config.UserDetailsServiceImpl;
import com.pe.ventas.facv2.dao.CategoriaDAO;
import com.pe.ventas.facv2.dao.EmpleadoDAO;
import com.pe.ventas.facv2.dto.CustomUser;
import com.pe.ventas.facv2.dto.Empleado;

public class Test {

	public static DataSource d = AppConfig.getDataSource();
	public static Gson gs = new Gson();
	public static EmpleadoDAO au = new EmpleadoDAO(d);
	public static CategoriaDAO cat = new CategoriaDAO(d);
	public static void main(String[] args) {
		// conect();
		// checkSecurityDaoAuthentication();
		// gilber cambio
		// Autorizar();
		//
		// Emp_buscar();

		Cat_listar();
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

	public static void Cat_listar() {
		System.out.println(gs.toJson(cat.listar()));
	}

	public static void Emp_buscar() {
		Empleado e = new Empleado();
		e.setId_empleado("EMP-000003");
		System.out.println(gs.toJson(au.buscar(e)));
	}

	public static void Emp_crear() {
		Empleado e = new Empleado();
		e.setNom_emp("asd");
		e.setApel_emp("asd");
		e.setTel_emp("1321");
		e.setDir_emp("los alamos");
		e.setSex_emp("M");
		e.setFnac_emp("2006-12-12");
		e.setDni_emp("Asd");
		e.setEma_emp("asdasd@hotmail.com");
		if (au.crear(e) == 1) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}

	}

	public static void Emp_mod() {
		Empleado e = new Empleado();
		e.setNom_emp("asd");
		e.setApel_emp("asd");
		e.setTel_emp("1321");
		e.setDir_emp("los alamos");
		e.setSex_emp("M");
		e.setFnac_emp("2006-12-12");
		e.setDni_emp("Asd");
		e.setEma_emp("asdasd@hotmail.com");
		e.setId_empleado("EMP-000002");
		if (au.modificar(e) == 1) {
			System.out.println("si");
		} else {
			System.out.println("no");
		}

	}

	public static void Emp_elim() {
		Empleado e = new Empleado();
		e.setId_empleado("EMP-000004");
		System.out.println((au.eliminar(e)));
	}

}
