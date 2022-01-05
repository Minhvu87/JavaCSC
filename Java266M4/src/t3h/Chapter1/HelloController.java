package t3h.Chapter1;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value = "/Chapter1/hello.html", method = RequestMethod.GET)
	public String hello(HttpServletRequest request) {
		request.setAttribute("name", "T3H");
		
		return "Chapter1/hello";
	}
}
