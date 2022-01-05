package t3h.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import t3h.domain.Cart;
public class CartMapper implements RowMapper<Cart>{
	@Override
	public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		return new Cart(rs.getString("CartId"), rs.getInt("ProductId"),rs.getString("Title"),
				rs.getString("ImageUrl"), rs.getInt("Price"), rs.getShort("Quantity"));
	}
}


