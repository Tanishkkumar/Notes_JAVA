package Inheritance;
class fun{
	public int a;
	public int b;
	public fun(int x,int y) {	
		this.a=x;
		this.b=y;
	}
	
	public void display() {
		System.out.println("a::"+this.a);
		System.out.println("b::"+this.b);

	}
}
public class this_keyword {
	public static void main(String[] args) {
		fun a=new fun(10,5);
		fun b=new fun(20,10);
		a.display();
		b.display();
		
	}
	

}
