
package Exception_Handling;

public class nested_tryandcatch {
	public static void main(String[] args) {
		try {
			int arr[]= {10,0,2,3,5};
			try {
				int r=arr[0]/arr[1];
				System.out.println(r);
			}
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			System.out.println(arr[10]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
