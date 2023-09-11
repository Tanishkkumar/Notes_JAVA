package Inheritance;
class Paaren{
	Paaren(){
		System.out.println("non parent");
	}
	public Paaren(int a) {
		   System.out.println("Paremeterise construct of Paarent::"+a);
	}
}

class Chill extends Paaren{
	    public Chill() {
	    	//super(45);
		   System.out.println("Non Paremeterise construct of Chilld.");
		}
	    
	    public Chill(int b) {
	    	//super(45);
		   System.out.println(" Paremeterise construct of Chilld.");
		}
		
		
}
public class pros {
	
	public static void main(String[] args) {
		Chill a=new Chill(23);
		
		
		
	}

}
