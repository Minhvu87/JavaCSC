package Chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai5 {
	public static void main(String[] args) {
		String[] months = {"January","February","March","April","May","June",
				"July","August","September","October","November","December"};
		System.out.println(Arrays.toString(months));
		Arrays.sort(months, (String a, String b)->a.length()- b.length());
		System.out.println("Sap xep tu ngan toi dai");
		System.out.println(Arrays.toString(months));
		Arrays.sort(months, (String a, String b)->b.length()- a.length());
		System.out.println("Sap xep tu dai toi ngan");
		System.out.println(Arrays.toString(months));
		System.out.println("Sap xep theo anphabet");
		Arrays.sort(months,(String a, String b)-> a.compareTo(b));
		System.out.println(Arrays.toString(months));
	}


}
