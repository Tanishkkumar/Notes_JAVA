package Abstract_Class;

 abstract class super1{
	public super1() {
		System.out.println("super constructor");
	}
	
	public void meth1() {
		System.out.println("method 1 of super class");
	}
	abstract public void meth2();
}
 
 class 	small extends super1{
	 public void meth2() {
		 System.out.println("hello override meth2 in child class");
	 }
	 
 }

public class Abstract {

	public static void main(String[] args) {
    super1 s=new small();  //reference of super and object of child class(small).
    s.meth2();
    
	}

}
