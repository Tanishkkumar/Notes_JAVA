package Exception_Handling;

public class multicatch {
	public static void main(String[] args) {
		try {
			int arr	[]= {10,0,8,3,5};
			int r;	
			r=arr[0]/arr[1];	
			System.out.println(r);
			System.out.println(arr[10]);
		}	
		catch(ArithmeticException e) {
			System.out.println(e);	
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
