package Collection_Framework;

import java.util.HashMap;
import java.util.Map;

public class map_Using_HashMap {
	public static void main(String[] args) {
		Map<Integer, String> c = new HashMap<>();
		c.put(1, "A");
		c.put(3, "B");
		c.put(5, "C");
		c.put(4, "tanishk");
		//c.putIfAbsent(3, "t");
		System.out.println(c);
		for(Integer d:c.keySet()) {
			System.out.print(d+" ");
		}
		System.out.println();
		for(String d:c.values()) {
			System.out.print(d+" ");
		}

	}
}
