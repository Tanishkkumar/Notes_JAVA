package Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class array_list {
  public static void main(String[] args) {
	 List<Integer> c=new ArrayList<>();
	 c.add(12);
	 c.add(1);
	 c.add(2);
	 c.add(3);
	 c.add(128);
	 System.out.println("size is-->"+c.size());
	 c.remove(2);
	 System.out.println("size is-->"+c.size());

	 c.set(2, 5000);
	 System.out.println(c);
	 System.out.println(c.contains(5000));
	 for(int i=0;i<c.size();i++) {
		 
		 System.out.println(c.get(i));
	 }
	 
	 
}
}
