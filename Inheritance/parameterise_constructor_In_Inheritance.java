package Inheritance;
class Paren{
	public Paren() {
	   System.out.println("Non Paremeterise construct of parent.");
	}
	public Paren(int x) {
		   System.out.println("Paremeterise construct of parent::"+x);
	}
}

class Chil extends Paren{
	    public Chil() {
		   System.out.println("Non Paremeterise construct of child.");
		}
		public Chil(int y) {
			super(y);
			   System.out.println("Paremeterise construct of child::"+y);
			   //super(y);  show error ->because parent const call start mai hi hoti hai.
		}
		
		public Chil(int a,int y) { 
			super(a);
			   System.out.println("2_Paremeters taking construct of child::"+y);

		}
}
public class parameterise_constructor_In_Inheritance {
	
	public static void main(String[] args) {
		Chil c=new Chil(14,15);	
		//Paren p=new Paren(45);
		
		
	}

}
