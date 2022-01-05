package t3h.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import t3h.domain.Category;

public class CategoryMapper implements RowMapper<Category>{
    @Override
    public Category mapRow(ResultSet rs, int arg1) throws SQLException{
		Category category = new Category();
		category.setId(rs.getInt(1));
		category.setName(rs.getString(2));
		category.setParent(rs.getInt(3));
    	return category;
    	
    }
}
