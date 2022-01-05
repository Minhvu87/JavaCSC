package Chapter4.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Chapter4.model.PublisherRepository;

/**
 * Servlet implementation class PublisherController
 */
@WebServlet("/admin/publisher.html")
public class PublisherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PublisherRepository repository = new PublisherRepository();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PublisherController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			request.setAttribute("list", repository.getPublishers());
			request.getRequestDispatcher("/Chapter4/index_publisher.jsp").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Integer> list = new LinkedList<>();
		for (String id : request.getParameterValues("ids")) {
			list.add(Integer.parseInt(id));
		}
		try {
			repository.delete(list);
			doGet(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
