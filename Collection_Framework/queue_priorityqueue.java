package Collection_Framework;

  
import java.util.PriorityQueue;
import java.util.Queue;

public class queue_priorityqueue {
	public static void main(String[] args) {
		Queue<Integer> c = new PriorityQueue<>();  //ye by default min heap mai execute hogi.
//		Queue<Integer> c = new PriorityQueue<>(Comparator.reverseOrder());  //ye ise max heap mai execute karegi.	
		c.offer(40); // to enqueue the data.
		c.offer(89);
		c.offer(30);
		c.offer(200);
		c.offer(400);
		System.out.println(c);
		c.poll();
		System.out.println(c);
	}
}
