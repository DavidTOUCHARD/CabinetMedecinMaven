package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.CabinetMedecin.domaine.Patient;
import org.CabinetMedecin.service.MedecinService;

/**
 * Servlet implementation class PatientServlet
 */
@WebServlet("/PatientServlet")
public class PatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MedecinService service = new MedecinService();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PatientServlet() {
		super();
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
		List<Patient> result = service.listePatients();
		forwardListPatients(request, response, result);

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

	private void forwardListPatients(HttpServletRequest req, HttpServletResponse resp, List patientList)
			throws ServletException, IOException {
		// String nextJSP = "/jsp/list-employees.jsp";
		// RequestDispatcher dispatcher =
		// getServletContext().getRequestDispatcher(nextJSP);
		// req.setAttribute("employeeList", patientList);
		// dispatcher.forward(req, resp);
	}

}
