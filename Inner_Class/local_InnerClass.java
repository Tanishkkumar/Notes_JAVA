package Inner_Class;

class outerClass{
	public void display() {  //display method of outer class
		
		class localInner{    //class inside method of outer class.
			public void show() {
				System.out.println("hello local from method of outer class");
			}
		}
		
		localInner i=new localInner();  //object of local inner class inside method of outer class.
		i.show();         //calling show method of local inner class.
		
		//new localInner().show();  //hum ese bhe object kar sakte hai local ke liye(Anonymous Object)

	} 
}
public class local_InnerClass {
	public static void main(String[] args) {
		
		outerClass o=new outerClass();
		o.display();
		
	}

}
