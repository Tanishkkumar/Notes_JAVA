package Java.lang_Package;

public class Wrapper_Classes {

	public static void main(String[] args) {
		// Integer i = new Integer(10); // depricated method of creating an object for
		// wrapper class.

		// Integer
		System.out.println("Integer--");
		Integer i = Integer.valueOf(100);
		System.out.println(i);

		// Byte
		System.out.println("\nByte--");
		Byte v = 45;
		Byte b = Byte.valueOf("20");
		System.out.println(b);

		// Short
		System.out.println("\nShort--");
		Short s = Short.valueOf("123");
		System.out.println(s);

		// Float
		System.out.println("\nFloat--");
		Float f = 123.5f;
		Float h = Float.valueOf("145.7");
		System.out.println(f);
		System.out.println(h);

		// Double
		System.out.println("\nDouble--");
		Double j = Double.valueOf(123.89);
		System.out.println(j);

		// Character
		System.out.println("\nCharacter--");
		Character k = Character.valueOf('A');
		System.out.println(k);

		// Boolean
		System.out.println("\nBoolean--");
		Boolean l = Boolean.valueOf(true); // taking bolean value.
		Boolean z = Boolean.valueOf("true"); // taking string
		System.out.println(l);
		System.out.println(z);

	}

}
