package t3h.Chapter6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import t3h.dao.CartRepository;
import t3h.dao.InvoiceRepository;
import t3h.domain.Invoice;

@Controller
public class CartCheckoutController {
	private CartRepository repository = new CartRepository();
	private InvoiceRepository invoiceRepository = new InvoiceRepository();
    @RequestMapping("cart/checkout.html")
    public String checkout(Model model, @CookieValue("cart") String id) {
		model.addAttribute("title","Check Out");
		model.addAttribute("list", repository.getCarts(id));
    	return "Chapter6.cart.checkout";
    	
    }
    @RequestMapping(value="cart/checkout.html", method = RequestMethod.POST)
    public String checkout(Model model, Invoice obj, @CookieValue("cart") String id) {
		obj.setId(id);
		invoiceRepository.add(obj);
    	return "redirect:/order/detail.html/"+obj.getId();
    	
    }
}
