package t3h.Chapter9;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Bai3_AuthLogon {

	@RequestMapping("/auth/logon.html")
	public String register(HttpServletRequest request) {
		if (request.getParameter("error") != null) {
			request.setAttribute("msg", "Username or password incorrect.");
		}
		return "Chapter9.auth.logon";
	}
}
