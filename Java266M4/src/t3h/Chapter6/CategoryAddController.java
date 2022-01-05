package t3h.Chapter6;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import t3h.dao.CategoryRepository;
import t3h.domain.Category;

@Controller
public class CategoryAddController {
	CategoryRepository repository = new CategoryRepository();
	
	@RequestMapping("/admin/category/add.html")
	public String add(Model model) {
		List<Category> list = repository.getParents();
//		model.addAttribute("list", list);
		Map<Integer, String> map = new HashMap<>();
		for(Category item:list) {
			map.put(item.getId(), item.getName());
		}
		model.addAttribute("map", map);
		model.addAttribute("obj", new Category());
		return "Chapter6.category.add";
	}
	@RequestMapping("/admin/category/edit.html/{id}")
	public String edit(Model model, @PathVariable("id")int id) {
		List<Category> list = repository.getParents();
		Map<Integer, String> map = new HashMap<>();
		for(Category item : list) {
			map.put(item.getId(), item.getName());
		}
		model.addAttribute("map", map);
		model.addAttribute("obj", repository.getCategory(id));
		return "Chapter6.category.edit";
		
	}
	@RequestMapping(value = "/admin/category/add.html", method = RequestMethod.POST)
	public String add(Model model, Category obj) {
		repository.add(obj);
		return "redirect:/admin/category/list.html";
	}

}
