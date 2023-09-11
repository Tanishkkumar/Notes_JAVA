package Multithreading;

class myth extends Thread {
	public myth(String name) {
		super(name);
		setPriority(Thread.MAX_PRIORITY); // this will allow to set the priority of the thread to max which is 10
	}
}

public class Thread_Methods_constructor_Sleep_Interrupt {

	public static void main(String[] args) {
		myth t = new myth("my thread 1");
		System.out.println(t.getId()); // this was given by jvm.
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.start(); // this will start the thread
		System.out.println(t.getName());
		System.out.println(t.getState()); // this will tell is the thread is running or not.
		System.out.println(t.isAlive()); // tell alive or not .

	}

}
