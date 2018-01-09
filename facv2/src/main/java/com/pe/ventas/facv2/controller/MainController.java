/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pe.ventas.facv2.controller;

import com.google.gson.Gson;
import com.pe.ventas.facv2.config.AppConfig;
import com.pe.ventas.facv2.dao.PrivilegioDAO;
import com.pe.ventas.facv2.dao.RolDAO;
import com.pe.ventas.facv2.dto.CustomUser;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	DataSource d = AppConfig.getDataSource();
	PrivilegioDAO pD = new PrivilegioDAO(d);
	RolDAO rD = new RolDAO(d);
	Map<String, Object> mp = new HashMap<String, Object>();
	Map<String, Object> sr = new HashMap<String, Object>();

	@RequestMapping(value = "/componentes")
	public void Logueo(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException {
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		String opc = request.getParameter("opc");
		String idm;
		try {
			switch (opc) {
			case "privilegios":
				String Rol = ((CustomUser) authentication.getPrincipal()).getID_ROL();
				String Modulo = session.getAttribute("ModE").toString();
				sr.put("pr", pD.listarURLs(Rol, Modulo));
				sr.put("usuario", ((CustomUser) authentication.getPrincipal()));
				mp.put("datos", sr);
				System.out.println(sr);
				break;
			case "modulos":
				mp.put("lista", ((CustomUser) authentication.getPrincipal()).getLIST_MODULO());
				break;
			case "redMod":
				idm = request.getParameter("idmod");
				if (!idm.equals("")) {
					session.setAttribute("ModE", idm);
					mp.put("rpta", true);
				} else {
					mp.put("rpta", false);
				}
				break;
			// case "puesto":
			// Map<String, Object> sr = new HashMap<String, Object>();
			// sr.put("dep", ((CustomUser) authentication.getPrincipal()).getNO_DEP());
			// sr.put("area", ((CustomUser) authentication.getPrincipal()).getNO_AREA());
			// sr.put("seccion", ((CustomUser)
			// authentication.getPrincipal()).getNO_SECCION());
			// sr.put("puesto", ((CustomUser)
			// authentication.getPrincipal()).getNO_PUESTO());
			// mp.put("info_puesto", sr);
			// break;
			case "usuario":
				String x =  ((CustomUser) authentication.getPrincipal()).getNOMBRE_AP();
				String y =  ((CustomUser) authentication.getPrincipal()).getID_ROL();
				System.out.println(x);
				System.out.println(y);
				mp.put("datos_usuario", ((CustomUser) authentication.getPrincipal()).getNOMBRE_AP());
				break;
			}

		} catch (Exception e) {
			mp.put("rpta", false);
			System.out.println("Error controlador COMPONENTS : " + e);
		}
		Gson gson = new Gson();
		out.println(gson.toJson(mp));
		out.flush();
		out.close();
	}

	@RequestMapping("/administrador")
	public ModelAndView principal(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("home");
	}

}
