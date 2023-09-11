class ret{
	private int length;
	private int b;
	
//	ret(int a,int c){   //constructor having argument .
//		length=a;
//		b=c;
//	}
	
//	ret(){      // constructor having no argument.
//		length=1;
//		b=1;
//	}
	public void pri() {
		System.out.println("the lenght is-->"+length);
		System.out.println("the breath is -->"+b);
	}
}	
public class constructor {
   public static void main(String[] args) {
	//ret p=new ret(10,5);    //passing argument to constructor.
	ret p=new ret();      //this also  invoke the constructor.
	p.pri();
}
}
