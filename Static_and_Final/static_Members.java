package Static_and_Final;
class pest{
	static public int a=10;  //shared by all the objects
	int b=20;
	
	public void show() {
		System.out.println(a+"::"+b);
	}
	
	static void dis() {  //yha hum b ko call nhi kar sakte kyuki vo non static hai
		System.out.println(a);
	}
}
public class static_Members {

	public static void main(String[] args) {
    pest p1=new pest();
    p1.show();
    p1.a=30;
    p1.b=80;
    p1.show();
    
    
    pest p2=new pest();
    p2.show();
    
    
	}

}
