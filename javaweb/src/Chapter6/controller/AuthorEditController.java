package Chapter6.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Chapter6.model.Author;
import Chapter6.model.AuthorRepository;

/**
 * Servlet implementation class AuthorEditController
 */
@WebServlet("/admin/author/edit.html")
public class AuthorEditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    AuthorRepository repository = new AuthorRepository();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthorEditController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		request.setAttribute("o", repository.findById(id));
		request.getRequestDispatcher("/Chapter6/edit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id = Integer.parseInt(request.getParameter("id"));
		Author obj = new Author(id, request.getParameter("name"));
		repository.update(obj);
		response.sendRedirect(request.getContextPath()+"/admin/author.html");
	}

}
