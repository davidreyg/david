package com.pe.ventas.facv2.MantenimientoC;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.pe.ventas.facv2.config.AppConfig;
import com.pe.ventas.facv2.dao.EmpleadoDAO;

@Controller
@Scope("request")
@RequestMapping("/mantenimiento/")
public class EmpleadoController {

	EmpleadoDAO rd = new EmpleadoDAO(AppConfig.getDataSource());
	private Gson gson = new Gson();

	@RequestMapping(value = "/empleado", method = RequestMethod.GET)
	protected void metodosPedidos2(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int op = Integer.parseInt(request.getParameter("opc"));
		switch (op) {
		case 1:
			out.println(gson.toJson(rd.listar()));
			break;
		}

	}

}
