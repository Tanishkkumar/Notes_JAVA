package Inheritance;
class rec{
	int l;
	int b;
	public rec(){
		l=b=1;	
	}
	public rec(int a,int b) {
		l=a;
		this.b=b;   //this.b -->avoid naming collision.
	}
}

class cuboid extends rec{
	int h;
	public cuboid() {
		h=1;
	}
	public cuboid(int a) {
		//super(2,2);
		h=a;
	}
	
	public cuboid(int l,int b,int a) {
		super(l,b);
		h=a;
		
	}
	public int volumn() {
		return l*b*h;
	}
	
	
}

public class paremeterise_constructor_2 {
	public static void main(String[] args) {
		cuboid c=new cuboid(1,2,52);
		System.out.println(c.volumn());
	}

}
