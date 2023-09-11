package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class ListIterator {
	public static void main(String[] args) {
		List<Integer> c = new ArrayList<>();
		c.add(12);
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(128);

		java.util.ListIterator<Integer> d = c.listIterator();
		while(d.hasNext()) {
			System.out.print(d.next()+" ");
		}
		System.out.println();
		while(d.hasPrevious()) {
			System.out.print(d.previous()+" ");
		}
	}
}
