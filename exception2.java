
public class exception2 {

	public static void main(String[] args) {
	int arr[]= {16,0,2,5,6};
	int r;
	try {
		r=arr[0]/arr[1];
		System.out.println(r);
		System.out.println(arr[10]);
	}
	catch(ArithmeticException e) {
		System.out.println("catch block "+e);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	

	}

}
