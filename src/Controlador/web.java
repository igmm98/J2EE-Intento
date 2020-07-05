package Controlador;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Modelo.Asesoria;

public class web extends HttpServlet {
	private Asesoria A_sesoria;
	@Override
	public void init() throws ServletException {
		A_sesoria = new Asesoria();
	}
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rut_ClienteAsesoria = request.getParameter("rutClienteAsesoria");
		String detalle_Asesoria = request.getParameter("detalleAsesoria");
		
		A_sesoria.setRutClienteAsesoria(rut_ClienteAsesoria);
		A_sesoria.setDetalleAsesoria(detalle_Asesoria);
		
		request.setAttribute("Modelo", A_sesoria);
		request.getRequestDispatcher("AgregarAsesoria.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
