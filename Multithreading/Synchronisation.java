package Multithreading;

class MyData {
	public void display(String arr) {

		synchronized (this) { // this will allowe one thread at a time to execute. you can also put
								// synchronise word before public void display to make whole method synchroize
			for (int i = 0; i < arr.length(); i++) {
				System.out.println(arr.charAt(i));
			}
		}
	}
}

class MyTHread1 extends Thread {
	MyData d;

	public MyTHread1(MyData d) {
		this.d = d;
	}

	public void run() {
		d.display("hello world");
	}
}

class MyTHread2 extends Thread {
	MyData d;

	public MyTHread2(MyData d) {
		this.d = d;
	}

	public void run() {
		d.display("Welcome All");
	}
}

public class Synchronisation {
	public static void main(String[] args) {
		MyData data = new MyData();
		MyTHread1 t1 = new MyTHread1(data);
		MyTHread2 t2 = new MyTHread2(data);
		t1.start();
		t2.start();
	}
}
