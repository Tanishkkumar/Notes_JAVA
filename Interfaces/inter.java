package Interfaces;
interface parent{   //in inteface all methods are bydefault abstract.
	public int a=10;
	public void dis();
	public int get();
	public static void gor() {
		System.out.println("ds");
	}
}

class child implements parent{
	
	public void dis() {
		System.out.println("child display");
	}
	
	public int  get() {
		return a+1;
	}
	public void gor() {
		System.out.println("default");
	}
}

public class inter {
 public static void main(String[] args) {
	 parent p=new child();
	 p.dis();
	 child c=new child();
	 //parent.gor();
	 c.gor();
	 
	
}
}
