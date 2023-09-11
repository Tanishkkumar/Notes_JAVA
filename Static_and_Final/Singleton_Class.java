package Static_and_Final;

class coffee{
	private float cofeqty;
	private float milkqty;
	private float waterqty;
	private float sugarqty;
	
	static private coffee my = null;
	private coffee() {
		cofeqty=1;
		milkqty=1;
		waterqty=1;
		sugarqty=1;
	}
	
	public void fillwater(float qty) {
		waterqty=qty;
	}
	public void fillsugar(float qty) {
		sugarqty=qty;
	}
	public float getcofe() {
		return 0.15f;
	}
	
	static coffee getInstance() {
		if(my==null) {
			my=new coffee();
		}
		return my;
	}
	
}

public class Singleton_Class {
	public static void main(String[] args) {
		coffee m1=coffee.getInstance();
		coffee m2=coffee.getInstance();
		coffee m3=coffee.getInstance();
		
		System.out.println(m1+":::"+m2+":::"+m3);
		if(m1==m2 && m1==m3) {
			System.out.println("same");
		}

		
	}

}
