package t3h.Chapter1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SumController {
    @RequestMapping("/Chapter1/sum.html")
    public String index() {
    	return "Chapter1/sum";
    }
    @RequestMapping(value = "/Chapter1/sum.html", method = RequestMethod.POST)
    public String index(Model model, int a, int b) {
    	model.addAttribute("a",a);
    	model.addAttribute("b",b);
    	model.addAttribute("result", a+b);
    	return "Chapter1/sum";
    	
    }
}
