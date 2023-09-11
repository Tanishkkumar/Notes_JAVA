package Object_Oriented_Programming;
class rec{
	private int len;
	private int br;
	
	public void set(int a){  //setters
		len=a;
	}
	
	public int get() {      //getters
		return len;
	}
	
	
}
public class Data_hiding {
	public static void main(String[] args) {
		rec r=new rec();
		r.set(45);
		System.out.println("the length is->"+r.get());
	}

}
