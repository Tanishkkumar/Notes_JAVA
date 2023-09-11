package Collection_Framework;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_LinkedList {
	public static void main(String[] args) {
		Queue<Integer> c = new LinkedList<>();
		c.offer(12); // to enqueue the data.
		c.offer(13);
		c.offer(14);
		c.offer(15);
		c.offer(16);
		System.out.println(c);
		System.out.println(c.peek()); // to see the front element.
		c.poll(); // to dequeue
		System.out.println(c);
	}
}
