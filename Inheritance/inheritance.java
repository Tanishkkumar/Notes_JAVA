package Inheritance;
class circle{
	private double radius;
	public circle() {
		radius=5.6;
	}
	public void get() {
		System.out.println("the radius is-->"+radius);
	}
}

public class inheritance extends circle{

	public static void main(String[] args) {
       inheritance r=new inheritance();
       r.get();  //it get access to circle class.
	}

}
