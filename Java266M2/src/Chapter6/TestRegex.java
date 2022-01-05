package Chapter6;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {

	public static void main(String[] args) {

		// B1: Tao ra pattern
		String regex = "[^a-zA-Z0-9]";
		Pattern pattern = Pattern.compile(regex);
		
		// B2: Tao doi tuong Matcher -> quan ly doi tuong so trung
		String username = "thinker@thinkingman.com";
		Matcher matcher = pattern.matcher(username);
		
		// B3: Kiem tra so trung -> find (rieng phan) va match (toan phan)
//		System.out.println(matcher.matches());
		System.out.println(matcher.find());
	}

}
