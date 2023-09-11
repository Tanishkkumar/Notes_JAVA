package Static_and_Final;
class nest{
	static {
		System.out.println("Block 1");
	}
	
	static {
		System.out.println("Block 2");
	}
}
public class static_Block {
	
	public static void main(String[] args) {
		nest n=new nest();
		System.out.println("Main");
	}
	

}
