package Chapter1;

import java.util.Arrays;
import java.util.List;

public class Bai1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7);
//		for(Integer n: list) {
//			System.out.println(n);
//		}
		list.forEach(n -> System.out.println(n));
	}
}
