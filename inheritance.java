class circle{
	private int area;
	
	circle(){
		System.out.println("parent class");
	}
}

class rec extends circle{
   private int ht;
   rec(){
		System.out.println("child class");
	}
   
}
public class inheritance {
  public static void main(String[] args) {
	  //rec a=new rec();
	  circle a=new circle();
	
}
}
