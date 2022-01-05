package t3h.Chapter6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

import t3h.dao.CartRepository;

@Controller
@RequestMapping("cart")
public class CartListController {
    CartRepository repository = new CartRepository();
    
    @RequestMapping("list.html")
    public String index(Model model, @CookieValue("cart") String id) {
		model.addAttribute("title", "Your Cart");
		model.addAttribute("list", repository.getCarts(id));
		return "Chapter6.cart.list";
    	
    }
}
