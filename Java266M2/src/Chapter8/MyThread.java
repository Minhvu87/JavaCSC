package Chapter8;

import java.util.Scanner;

public class MyThread extends Thread {

	private String name;
	
	public MyThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap n: ");
		int n = sc.nextInt();
		
		for (int idx = 1; idx <= n; idx++) {
			System.out.println(name + ": " + idx);
		}
	}

	public static void main(String[] args) {
		// Buoc 2
		MyThread myThread = new MyThread("Thread 1");
		// Buoc 3
		myThread.start();
		
		// main thread
		System.out.println("Done.");
	}
}
