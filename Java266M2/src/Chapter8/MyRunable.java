package Chapter8;

public class MyRunable implements Runnable {
	
	private String name;
	
	public MyRunable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int idx = 1001; idx <= 2000; idx++) {
			System.out.println(name + ": " + idx);
		}
	}

}
