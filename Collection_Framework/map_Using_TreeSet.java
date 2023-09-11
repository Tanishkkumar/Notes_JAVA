package Collection_Framework;

import java.util.Map;
import java.util.TreeMap;

public class map_Using_TreeSet {
	public static void main(String[] args) {
		Map<Integer, String> c = new TreeMap<>();
		c.put(1, "A");
		c.put(2, "B");
		c.put(5, "C");
		c.put(4, "tanishk");
		// c.putIfAbsent(3, "t");
		System.out.println(c);
		for (Integer d : c.keySet()) {
			System.out.print(d + " ");
		}
		System.out.println();
		for (String d : c.values()) {
			System.out.print(d + " ");
		}
	}
}
