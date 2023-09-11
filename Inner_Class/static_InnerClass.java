package Inner_Class;

class put{
	int a=10;
	static int b=50;
	
	static class my{  //static inner class can only access the static member of outer class
		public void show() {
			
			//System.out.println(a); //error- static inner class can not access non static member of outer class.
			System.out.println(b);
			
		}
	}
	
	public void Dis() {
		my m=new my();
		m.show();
    }

	
}

public class static_InnerClass {
	public static void main(String[] args) {
//		put o=new put();
//		o.Dis();
		
		
		put.my m=new put.my();  //object of static inner class 
		m.show();
	}

}
