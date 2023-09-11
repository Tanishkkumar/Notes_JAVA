package Exception_Handling;

public class finallyBlock {
	public static void main(String[] args) {
		try {
		int a=5;
		int b=a/0;	
		System.out.println(b);
	}
		catch(ArithmeticException e) {
			System.out.println("divided by zero"+e);
		}
		finally { //ye hamesha run karega chahe exception ho try mai ya nhi.
			System.out.println("all the best");
		}
}
}
