package pe.edu.upeu.d.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.sql.DataSource;

import com.google.gson.Gson;

import pe.edu.upeu.d.config.AppConfig;
import pe.edu.upeu.d.config.UserDetailsServiceImpl;
import pe.edu.upeu.d.dto.CustomUser;

public class ConfigTest {

	public static DataSource d = AppConfig.getDataSource();
	public static Gson gs = new Gson();

	public static void main(String[] args) {
		conect();
		checkSecurityDaoAuthentication();
		//Autorizar();
//		Procesar();
//		Procesar1();
		//Renuncia();
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
		UserDetailsServiceImpl userdetailsService=new UserDetailsServiceImpl();
		CustomUser user=userdetailsService.loadUserByUsername("abr");
		System.out.println("nombre: "+user.getUsername());
		System.out.println("password: "+user.getPassword());
		System.out.println("checked!");
		
	}
	
	
}
