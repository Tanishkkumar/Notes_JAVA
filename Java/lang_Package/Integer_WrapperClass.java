package Java.lang_Package;

public class Integer_WrapperClass {
	public static void main(String[] args) {
		int a = 14;
		Integer b = a;
		System.out.println(b.equals(a));
		Integer m = Integer.valueOf("101010", 2);
		System.out.println(m);
		int y = Integer.parseInt("1235268");
		System.out.println(y + 100);

		int z = 101;
		Integer w = Integer.reverse(z);
		System.out.println(w);
	}
}
