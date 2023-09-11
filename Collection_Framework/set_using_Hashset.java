package Collection_Framework;

import java.util.HashSet;
import java.util.Set;

public class set_using_Hashset {
	public static void main(String[] args) {
		Set<Integer> c = new HashSet<>();
		c.add(10);
		c.add(50);
		c.add(100);
		c.add(60);
		System.out.println(c);
		c.remove(50);
		//c.clear();  //to delete all the elements form the set.
		System.out.println(c); 
		System.out.println(c.size());
		System.out.println(c.contains(100));
	}
	
}
