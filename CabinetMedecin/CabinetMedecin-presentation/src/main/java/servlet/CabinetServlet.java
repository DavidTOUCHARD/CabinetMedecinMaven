package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.CabinetMedecin.service.MedecinService;

/**
 * Servlet implementation class CabinetServlet
 */

@WebServlet("/CabinetServlet")
public class CabinetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	MedecinService service = new MedecinService();

	/**
	 * Default constructor.
	 */
	public CabinetServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		RequestDispatcher dispatcher;
		String login = request.getParameter("userName");
		String password = request.getParameter("password");
		System.out.println(login);
		if (service.authentification(login, password) == true) {
			System.out.println("bienvenue");
			response.sendRedirect("accueil.jsp");
		} else {
			System.out.println("wrong password or user name");
			response.sendRedirect("error.jsp");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
