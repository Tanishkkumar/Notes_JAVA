package Multithreading;

class mine extends Thread {
	public mine(String name) {
		super(name);
	}

	public void run() {
		int count = 1;
		while (count < 15) {
			System.out.println(count++);
			try {
				Thread.sleep(1000);   //allow to sleep thread for 1000 milliseconds and then print one value
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

}

public class thread_sleepConstructor {
	public static void main(String[] args) {
		mine t = new mine("oraab");
		t.start();
		t.interrupt();
	}
}
