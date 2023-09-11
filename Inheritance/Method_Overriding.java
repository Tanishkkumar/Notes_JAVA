package Inheritance;
class sup{
	public void dis() {
		System.out.println("hello parent class");
	}
}
class ch extends sup{
	@Override    //ye na likhne se bhe kaam chal jaayega.
	public void dis() {  //yha agar koi paramter diya to pehle parent ka method run hoga
		System.out.println("hello child class");
	}
}
public class Method_Overriding {
	public static void main(String[] args) {
		ch c=new ch();
		c.dis();
	}

}
