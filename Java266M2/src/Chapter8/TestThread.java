package Chapter8;

public class TestThread {

	public static void main(String[] args) throws InterruptedException {

		// B2: Tao luong moi
		MyThread myThread1 = new MyThread("Thread 1");
		
		MyRunable myRunable = new MyRunable("Thread 2");
		
		// B3: thuc thi luong (ke thua thread)
		myThread1.start();
		myThread1.join();
		
		Thread thread2 = new Thread(myRunable);
		
		// B4: Thuc thi luong (implement runable)
		thread2.start();
		
		// Hien thuc Runable dung anonumous inner class
		Runnable runnable2 = new Runnable() {
			
			@Override
			public void run() {
				for (int idx = 2001; idx <= 3000; idx++) {
					System.out.println("Thread 3: " + idx);
				}
			}
		};
		Thread thread3 = new Thread(runnable2);
		thread3.start();
		
		// Hien thuc Runnable dung Lambda Expression
		Runnable runnable4 = () -> {
			for (int idx = 3001; idx <= 4000; idx++) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Thread 4: " + idx);
			}
		};
		Thread thread4 = new Thread(runnable4);
		thread4.start();
		
		// Main Thread
//		myThread1.start(); --> IllegalThreadStateException
		System.out.println(myThread1.getId());
		System.out.println("Done.");
	}

}
