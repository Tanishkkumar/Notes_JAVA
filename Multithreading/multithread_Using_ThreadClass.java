 package Multithreading; //having two seperate class. 

class mythread extends Thread {
	public void run() { // we have to override run method
		int i = 1;
		while (i<10) {
			System.out.println(i + "hello");
			i++;
		}
	}
}
 
public class multithread_Using_ThreadClass {
	public static void main(String[] args) {
		mythread t = new mythread();
		t.start(); // this will start the thread by calling run method ..calling run method using,
					// this way is compulsory.
		int i = 1;
		while (i<10) {
			System.out.println(i + "world");
			i++;
		}
	}
}





/*
package Multithreading;    //having one class only. 


public class multithread_Using_ThreadClass extends Thread {
	public void run() { // we have to override run method
		int i = 1;
		while (true) {
			System.out.println(i + "hello");
			i++;
		}
	}
	public static void main(String[] args) {
		multithread_Using_ThreadClass t = new multithread_Using_ThreadClass();
		t.start(); // this will start the thread by calling run method ..calling run method using,
					// this way is compulsory.
		int i = 1;
		while (true) {
			System.out.println(i + "world");
			i++;
		}
	}
}
*/
