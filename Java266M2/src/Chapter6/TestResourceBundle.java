package Chapter6;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestResourceBundle {

	public static void main(String[] args) {
		// B1: Tao ra doi tuong Locale
		Locale locale = new Locale("en", "US");
		
		// B2: Load ResourceBundle
		ResourceBundle bundle = ResourceBundle.getBundle("chapter6.ApplicationResource", locale);
	
		// B3: Get thong tin  cac truong
		System.out.println(bundle.getString("username"));
		System.out.println(bundle.getString("password"));
	}
}
