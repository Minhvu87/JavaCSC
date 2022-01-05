package t3h.Chapter9;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Chapter9_HomeController {

	@RequestMapping("/Chapter9/index.html")
	public String index() {
		return "Chapter9.index";
	}
}
