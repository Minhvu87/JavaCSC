package t3h.Chapter1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
   @RequestMapping("/Chapter1/contact.html")
   public String contact() {
	   return "Chapter1/contact";
   }
   @RequestMapping(value ="/Chapter1/contact.html", method = RequestMethod.POST)
   public String contact(Model model, Contact obj) {
	   model.addAttribute("o", obj);
	   return "Chapter1/contact";
   }
}
