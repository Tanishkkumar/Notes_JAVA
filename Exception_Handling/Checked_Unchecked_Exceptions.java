package Exception_Handling;
//import java.io.*;

//OWN EXCEPTION CLASS
class LowbalanceException extends Exception{
	@Override
	public String toString() {
		return "balanced should not be less than 5000";
	}
}


public class Checked_Unchecked_Exceptions {
	static void fun1() {
		//UNCHECKED EXCEPTION
//		try {
//		 System.out.println(10/0);
//	}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		
		//CHECKED EXCEPTION
		try {
		 throw new LowbalanceException();
	}
		catch(LowbalanceException e) {
			System.out.println(e);
		}
	}
 
	static void fun2() {
        fun1();
	}

	static void fun3() {
         fun2();
	}

	public static void main(String[] args) {
        fun3();
	}
}
