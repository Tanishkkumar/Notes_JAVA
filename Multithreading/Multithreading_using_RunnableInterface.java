package Multithreading; //implements runnable interface

//multithreading using two class.
class mythreadrun implements Runnable {
	public void run() { // we have to override run method
		int i = 1;
		while (i < 20) { // yaha true hai pr infinite na chale isiliye i<10 likha hai
			System.out.println(i + "hello");
			i++;
		}
	}       
}

public class Multithreading_using_RunnableInterface {
	public static void main(String[] args) {
		mythreadrun m = new mythreadrun();
		Thread t = new Thread(m); // create object of thread class .
		t.start(); // this will start the thread by calling run method ..calling run method using,
					// this way is compulsory.
		int i = 1;
		while (i < 20) { // yaha true hai pr infinite na chale isiliye i<10 likha hai
			System.out.println(i + "world");
			i++;
		}
	}
}

/*
 * package Multithreading; //implements runnable interface //multithreading
 * using single class.
 * 
 * 
 * public class Multithreading_using_RunnableInterface implements Runnable {
 * public void run() { // we have to override run method int i = 1; while (true)
 * { System.out.println(i + "hello"); i++; } } public static void main(String[]
 * args) { Multithreading_using_RunnableInterface m = new
 * Multithreading_using_RunnableInterface(); Thread t = new Thread(m);
 * t.start(); // this will start the thread by calling run method ..calling run
 * method using, // this way is compulsory. int i = 1; while (true) {
 * System.out.println(i + "world"); i++; } } }
 */
