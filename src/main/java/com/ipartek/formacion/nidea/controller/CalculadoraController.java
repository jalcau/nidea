package com.ipartek.formacion.nidea.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculadoraController
 */
public class CalculadoraController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private RequestDispatcher dispatch;
	public static final int OP_SUMAR = 1;
	public static final int OP_RESTAR = 2;
	public static final int OP_MULTIPLICAR = 3;
	public static final int OP_DIVIDIR = 4;

	int operacion = OP_SUMAR;
	float num1 = 0;
	float num2 = 0;
	float resultado = 0;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Nos llaman a traves de un enlace, peticion GET
		request.getRequestDispatcher("views/calculadora/index.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Nos llaman a traves de un FORM con method="post"

		// Recoger parametros
		try {
			getParameters(request);
			calcular();

			// enviar atributos a la vista

			request.setAttribute("resultado", resultado);

			dispatch = request.getRequestDispatcher("views/calculadora/resultado.jsp");
		} catch (NumberFormatException e) {

			request.setAttribute("msg", "Por favor escribe un numero correcto");
			dispatch = request.getRequestDispatcher("views/calculadora/index.jsp");
		} catch (Exception e) {
			e.printStackTrace();
			request.setAttribute("msg", "Disculpe las molestias, tenemos un fallo sin controlar");
			dispatch = request.getRequestDispatcher("views/calculadora/index.jsp");
		} finally {
			dispatch.forward(request, response);

		}
	}

	private void calcular() {
		switch (operacion) {
		case OP_SUMAR:
			resultado = num1 + num2;
			break;
		case OP_RESTAR:
			resultado = num1 - num2;
			break;
		case OP_MULTIPLICAR:
			resultado = num1 * num2;
			break;
		case OP_DIVIDIR:
			resultado = num1 / num2;
			break;
		}

	}

	private void getParameters(HttpServletRequest request) {
		String snum1 = request.getParameter("num1");
		String snum2 = request.getParameter("num2");
		String soperacion = request.getParameter("operacion");
		// Aplicar logica de negocio
		operacion = Integer.parseInt(soperacion);
		num1 = Float.parseFloat(snum1);
		num2 = Float.parseFloat(snum2);

	}

}
