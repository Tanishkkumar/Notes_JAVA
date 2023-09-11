package Inheritance;

class sup2{
	public void dis() {
		System.out.println("hello parent class");
	}
	public void di() {
		System.out.println("hello  method 2 parent class");
	}
}
class ch2 extends sup2{
	@Override
	public void di() {
		System.out.println("hello child class");
	}
	public void pro() {
		System.out.println("hello method 2 of child class");
	}
}
public class dynamicDispatch_2 {
public static void main(String[] args) {
	  sup2 sp=new ch2();
	  sp.dis();
	  sp.di();
//	  ch c=new sup();  //we can not do this...

	
}
}
