class fun{
	private int a;
	public int add(int val) {
		a=45;
		return val+a;
	}
	
}
public class classVSobjects {
     public static void main(String[] args) {
		fun arr=new fun();
		int a=arr.add(99);
		System.out.println("the final value is-->"+a);
	}
}
