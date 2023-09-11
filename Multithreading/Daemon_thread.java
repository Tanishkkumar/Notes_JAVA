package Multithreading;

class pri extends Thread {
	public void run() {
		int count = 1;
		while (count<15) {
			System.out.println(count++);
		}
	}
}

public class Daemon_thread {
	public static void main(String[] args) {
		pri p = new pri();
		p.setDaemon(true);
		p.start();
//		try {
//			Thread.sleep(10);   
//		} catch (InterruptedException e) {
//			System.out.println(e);
//		}
			Thread mainThread=Thread.currentThread() ;
			try {
				mainThread.join() ;
			} catch (InterruptedException e) {
				System.out.println(e);
			}
	}
}
