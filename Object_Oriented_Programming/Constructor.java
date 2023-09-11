package Object_Oriented_Programming;


class constr{
	private int a;
	private int b;
	
	public constr(int c,int d){ //first constructor with arguments
		a=c;
		b=d;
	}
	
	public constr(){   //second constructor without arguments.
		a=1;
		b=4;
	}
	public int get() {
		return a+b;
	}
}

public class Constructor {
	public static void main(String[] args) {
		constr c=new constr(15,6);

		System.out.println(c.get());
      
		
		
	}
	
	
}
