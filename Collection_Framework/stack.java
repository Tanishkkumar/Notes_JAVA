package Collection_Framework;

import java.util.Stack;

public class stack {
  public static void main(String[] args) {
	Stack<Integer> c=new Stack<>(); 
	c.push(100);
	c.push(12);
	c.push(15);
	c.push(16);
	c.push(19);
	int a=c.peek();  //gives top of stack 

	System.out.println(c);
	System.out.println("peek -->"+a);
	System.out.println("poped element is -->"+c.pop());
	System.out.println(c.search(1000));
	System.out.println(c.isEmpty());
}
}
