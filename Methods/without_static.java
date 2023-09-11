package Methods;

public class without_static {

	 int maxelement(int a, int b) {   //here static is not required 
		return (a > b) ? a : b;       //as it is called through object of class.
	}

	public static void main(String[] args) {
		int a = 15;
		int b = 85;
		without_static mp=new without_static();  //object of class without_static
		int c = mp.maxelement(a, b);  //calling method through object.
		System.out.println("the max element is->" + c);

	}
}
