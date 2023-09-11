package Abstract_Class;
abstract class pa{
	public void make() {
		System.out.println("make item regulary parent class");
	}
	
	abstract public void bill();    //abstract method
}

class coke extends pa{
	public void serve() {
		System.out.println("child class serving");
	}
	public void bill() {   //abstract method overriden
		System.out.println("child class billing");
	}
	
	public void give() {
		System.out.println("give orders from child class");
	}
}

public class abstract2 {
	public static void main(String[] args) {
//		pa p=new coke();    //parent reference only print methods of parent class only.
//		p.bill();   //this will print overriden method of child class.
//		p.make();
//		p.serve();   //this wil throw error as it is not present in parent class.
		coke c=new coke();
		c.serve();
		c.bill();
		c.give();
	}

}
