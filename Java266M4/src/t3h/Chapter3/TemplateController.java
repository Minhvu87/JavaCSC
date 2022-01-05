package t3h.Chapter3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {
    @RequestMapping("/Chapter3/template.html")
    public String template() {
    	return "Chapter3.template";
    }
}
