package com.pe.ventas.facv1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;

//import pe.edu.upeu.D.dto.CustomUser;

//import pe.edu.upeu.prueba.entidad.Aula;
//import pe.edu.upeu.prueba.service.AulaService;
//import pe.edu.upeu.prueba.service.CursoService;
//import pe.edu.upeu.prueba.service.HorarioService;
//import pe.edu.upeu.prueba.entidad.Curso;
//import pe.edu.upeu.prueba.entidad.Horario;

@Controller
@RequestMapping("/")
public class HomeController {
	@GetMapping("/login")
	public ModelAndView hello(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout) {
		/*
		 * Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		 * if (auth.isAuthenticated()) { System.out.println("Está autenticado"); return
		 * "menu"; } else { System.out.println("No está autenticado"); return "login";
		 * }
		 */
		ModelAndView model = new ModelAndView();
		if (error != null) {
			model.addObject("error", "Usuario y/o contrase�a incorrecta!");
		}

		if (logout != null) {
			model.addObject("msg", "Has cerrado sesi�n.");
		}
		model.setViewName("login");

		return model;
	}

	@GetMapping(value = { "menu", "/" })
	public String menu(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {
//		String Rol = ((CustomUser) authentication.getPrincipal()).getID_ROL();
		String pagina = "";
		HttpSession session = request.getSession(true);
//		System.out.println(Rol);
//		if (Rol.equals("ROL-0013")) {
			System.out.println("redireccionar a home");
			session.setAttribute("ModE", "MOD-0001");
			pagina = "home";
//		} else {
//			pagina = "menu";
//		}
		return pagina;
	}

	@GetMapping("/logout")
	public void logout(HttpServletRequest request, HttpServletResponse response) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null) {
			new SecurityContextLogoutHandler().logout(request, response, auth);
			System.out.println("Logged Out Successfully!");
		}
		try {
			response.sendRedirect("login?logout");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@GetMapping("home")
	public String home() {
		String pagina = "home";
		return pagina;
	}

}
