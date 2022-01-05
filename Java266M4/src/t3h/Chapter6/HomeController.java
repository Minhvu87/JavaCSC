package t3h.Chapter6;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import t3h.dao.ProductRepository;
import t3h.domain.Product;

@Controller
@RequestMapping("home")
public class HomeController {
    ProductRepository repository = new ProductRepository();
    private static int size = 6;
    
    @RequestMapping(value= {"list.html","list.html/{p}"})
    public String index(Model model, @PathVariable(value = "p", required = false)Integer p) {
		if(p == null) {
			p = 1;
		}
    	model.addAttribute("title", "Mini Shop");
		model.addAttribute("n", (int)Math.ceil(repository.commit()/(double)size));
		model.addAttribute("list", repository.getProducts(p, size));
    	return "Chapter6.home.list";
    }
    @RequestMapping("detail.html/{id}")
    public String detail(Model model, @PathVariable("id")int id) {
    	Product o = repository.getProduct(id);
    	model.addAttribute("title", o.getTitle());
    	model.addAttribute("o", o);
    	return "Chapter6.home.detail";
    }
    @RequestMapping("search.html")
    public String search(Model model, @RequestParam("q")String q) {
    	model.addAttribute("title", "Result for" + q);
    	model.addAttribute("list", repository.search(q));
    	return "Chapter6.home.search";
    }
}
