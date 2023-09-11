package Java.lang_Package;

class MyObject {
	public String toString() {
		return "hello world";
	}
}

public class Object_class {
	public static void main(String[] args) {
		MyObject o1 = new MyObject();
		// Object o2 = o1;

		// System.out.println(o1.hashCode());
		System.out.println(o1);
	}
}
