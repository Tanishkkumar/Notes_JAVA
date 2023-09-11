package Collection_Framework;

import java.util.Set;
import java.util.TreeSet;

public class set_using_TreeSet {
	public static void main(String[] args) {
		Set<Integer> c = new TreeSet<>();
		c.add(10);
		c.add(50);
		c.add(100);
		c.add(60);
		c.add(10);
		System.out.println(c);
	}
}
