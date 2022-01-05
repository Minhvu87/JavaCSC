package Chapter1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bai3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Nhập bán kính: ");
		Double r = Double.parseDouble(input.readLine());
		Area circle = (double x1, double x2) -> x1 * Math.pow(x2, 2);
		System.out.println("S = PI * (r*r) = " + circle.calArea(Math.PI, r));
		System.out.println("Nhap chieu dai: ");
		Double H = Double.parseDouble(input.readLine());
		System.out.println("Nhap chieu rong: ");
		Double W = Double.parseDouble(input.readLine());
		Area Rectangle = (double x1, double x2) -> x1 * x2;
		System.out.println("S = W x H = " + Rectangle.calArea(W,H));
		

	}

}
