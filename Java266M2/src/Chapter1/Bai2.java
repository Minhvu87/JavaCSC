package Chapter1;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class Bai2 {
	public static void main(String[] args) {
		List<Integer> soLuong = Arrays.asList(new Integer[] {2,3,5,7,});
		int donGia = 5200;
		soLuong.forEach(element -> {
			System.out.println("Thanh tien = "+ donGia * element + " vnd");
		});
	}
}
