package Chapter4.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Chapter4.model.ProductRepository;

/**
 * Servlet implementation class HomeSearchController
 */
@WebServlet("/home/search.html")
public class HomeSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    ProductRepository repository = new ProductRepository();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeSearchController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			request.setAttribute("list", repository.search(request.getParameter("q")));
			request.getRequestDispatcher("/Chapter4/search.jsp").forward(request, response);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
