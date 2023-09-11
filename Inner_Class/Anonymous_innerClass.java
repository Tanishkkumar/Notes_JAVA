package Inner_Class;

abstract class My{
	abstract public void show();
}

class out{
	public void dis() {
		My m = new My() {  //Anonymous class.
			public void show() {
				System.out.println("hello oraab");
			}
		};
		m.show();
		
		
		//In place of form line 9-14 we can also write.
		
//		new My() {  // anonymous class(having anonymous object) that is inheriting from class my.
//			public void show() {
//				System.out.println("hello oraab");
//			}
//		}.show();
		
		
	}
}
public class Anonymous_innerClass {
   public static void main(String[] args) {
	   out o=new out();
	   o.dis();
	
}
}
