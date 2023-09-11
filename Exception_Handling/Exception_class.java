package Exception_Handling;

public class Exception_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,0,5,6,9};
		try {
			int a=arr[0]/arr[1];
			System.out.println("answer is::"+a);
		}
	
		catch(Exception e) {
			System.out.println(e);	
		}
		catch(ArithmeticException e) {
				System.out.println(e);
			}

	}

}
