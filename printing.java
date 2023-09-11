
public class printing {

	public static void main(String[] args) {
		int a = 41;
		int b = 12;
		float f=125.52f;
		char c='t';
		System.out.println("sum is " + (a + b)); // 4112 solution-->use bracket (a+b) to get the priority to addition
													// rather than first concatination
		System.out.println(a + b + " sum"); // 53
		System.out.printf("helo\n");
		System.out.println(a+" "+f+" "+c);
		System.out.printf("%.2f\n",f);
		System.out.printf("%x %.1f %c",a,f,c);

	}

}
