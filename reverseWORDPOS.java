import java.util.Scanner;

public class reverseWORDPOS {

	public static void main(String[] args) {
		String arr;
		System.out.println("enter the string in the field\n");
		Scanner ptr = new Scanner(System.in);
		arr = ptr.nextLine();
		String result = reverse(arr);
		System.out.println("the string is \n" + result);
		ptr.close();
	}

	static String reverse(String arr) {
		String ptr[] = arr.split(" ");
		StringBuilder rev = new StringBuilder();
		for (int i = ptr.length - 1; i >= 0; i--) {
			rev.append(ptr[i]).append(" ");
		}
		return rev.toString().trim();

	}

}
