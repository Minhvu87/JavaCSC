package t3h.Chapter1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SumMultiController {
    @RequestMapping("/Chapter1/summulti.html")
    public String index() {
    	return "Chapter1/multi";
    }
    @RequestMapping(value = "/Chapter1/summulti.html", method = RequestMethod.POST)
    public String index(Model model, @RequestParam("num") int[] list) {
    	int s = 0;
    	for(Integer num: list) {
    		s += num;
    	}
    	model.addAttribute("result", s);
    	return "Chapter1/multi";
    }
}
