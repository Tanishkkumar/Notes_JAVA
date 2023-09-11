package Exception_Handling;

public class handle1 {
	public static void main(String[] args) {
		try {
		int a=5;
		int b=a/0;
		System.out.println(b);
	}
		catch(ArithmeticException e) {
			System.out.println("divided by zero"+e);
		}
}
}
