package t3h.mapper;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import t3h.domain.Product;
public class ProductMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		return new Product(rs.getInt("ProductId"), rs.getString("Title"),
				rs.getString("ISBN"), rs.getInt("Price"), rs.getString("Pages"), rs.getString("ImageUrl"));
	}

}
