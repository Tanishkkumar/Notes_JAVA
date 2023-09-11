package Methods;

public class variable_argument {
	static void show(int...a) {
		for(int x:a) {
			System.out.println(x);
		}
		
	}
	public static void main(String[] args) {
		show();
		show(10);
		show(15,46);
		show(14,2,3,6,5);
		int arr[]={1,2,3,4,5,6};
		show(arr);
		
	}

}
