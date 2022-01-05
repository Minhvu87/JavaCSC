package t3h.Chapter5;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import t3h.dao.CategoryRepository;
import t3h.domain.Category;

@Controller
@RequestMapping("admin/category")
public class CategoryController {
    CategoryRepository repository = new CategoryRepository();
    
    @RequestMapping("list.html")
    public String list(Model model) {
    	List<Category> list = repository.getCategories();
    	model.addAttribute("list", list);
    	
    	return "Chapter5.category.list";
    }
	/*
	 * @RequestMapping("parentid.html") public String parents(Model model) {
	 * List<Category> parentid = repository.getParents(); model.addAttribute("list",
	 * parentid);
	 * 
	 * return "Chapter5.category.parentid"; }
	 */
}
