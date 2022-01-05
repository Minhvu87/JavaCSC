package t3h.Chapter6;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import t3h.dao.InvoiceRepository;
import t3h.domain.Invoice;

@Controller
@RequestMapping("order")
public class OrderDetailController {
    InvoiceRepository repository = new InvoiceRepository(); 
    
    @RequestMapping("list.html")
    public String index(Model model) {
		List<Invoice> listOfInvoice = repository.getInvoices();
    	model.addAttribute("invoices", listOfInvoice);
    	return "Chapter6.order.list";
    	
    }
    @RequestMapping("detail.html/{id}")
    public String detail(Model model, @PathVariable("id") String id) {
		Invoice obj = repository.getInvoice(id);
		model.addAttribute("o", obj);
		model.addAttribute("title", "Order Detail");
    	return "Chapter6.order.detail";
    	
    }
}
