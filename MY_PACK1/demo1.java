package MY_PACK1;

public class demo1{	
	int a=10;  //default access modifier
	private int b=20;	
	protected int c=30;
	public int d=40;	
	
	public void dis() {	
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}
}
	
class demo2{
	
	demo1 d2=new demo1();
	public void show() {
		System.out.println(d2.a);
		//	System.out.println(d2.b);
		System.out.println(d2.c);
		System.out.println(d2.d);
	}
	
	
}