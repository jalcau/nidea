package com.ipartek.formacion.nidea.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ipartek.formacion.nidea.pojo.Mesa;

/**
 * Servlet implementation class MesaController
 */
public class MesaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Mesa m = new Mesa();
		// Si parametros no son null recoger y crear mesa a medida
		// Recoger parametros Siempre String

		String sPatas = request.getParameter("patas");
		String sDimension = request.getParameter("dimension");
		if (sPatas != null) {
			int patas = Integer.parseInt(sPatas);
			int dimension = Integer.parseInt(sDimension);
			m.setNumeroPatas(patas);
			m.setDimension(dimension);
		}

		// enviar atributos a la JSP
		request.setAttribute("mesa", m);

		// ir a la JSP
		request.getRequestDispatcher("mesa.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}