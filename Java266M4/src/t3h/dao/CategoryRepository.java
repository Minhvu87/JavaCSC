package t3h.dao;

import java.util.List;

import t3h.domain.Category;
import t3h.mapper.CategoryMapper;

public class CategoryRepository extends Repository{
    public int add(Category obj) {
		return jdbc.update("INSERT INTO Category(CategoryId, CategoryName, ParentId) VALUES (?, ?, ?)",obj.getId(),obj.getName(), obj.getParent());
    	
    }
    
    public List<Category> getParents() {
    	String sql = "SELECT * FROM Category WHERE parentid is null";
    	return jdbc.query(sql, new CategoryMapper());
    }
    
    public List<Category> getCategories() {
    	String sql = "SELECT * FROM Category";
    	return jdbc.query(sql, new CategoryMapper());
    }
    public Category getCategory(int id) {
    	return jdbc.queryForObject("SELECT * FROM Category WHERE CategoryId=?",new CategoryMapper());
    }
    public int edit(Category obj) {
    	return jdbc.update("UPDATE Category SET CategoryName=?, ParentId=? WHERE CategoryId=?",
    			obj.getName(),obj.getParent(),obj.getId());
    }
}
