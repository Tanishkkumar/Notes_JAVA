//import Inheritance.sup;

class sup{
	public void dis() {
		System.out.println("hello parent class");
	}
}
class ch extends sup{
	public void dis() {
		System.out.println("hello child class");
	}
	public void pro() {
		System.out.println("hello method 2 of child class");
	}
}
public class Dynamic_Meethod_Dispatch {
  public static void main(String[] args) {
	  sup sp=new ch();
	  sp.dis();
//	  ch c=new sup();  //we can not do this...

	
}
}
