package Methods;

public class method_overloading {
	
	static int  max(int a,int b) {
		return (a>b)?a:b;
	}
	
	static float max(float a,float b) {
		return (a>b)?a:b;
	}
	
	static int  max(int a,int b,int c) {
		return (a>c && b>c)?a:(b>c?b:c);
	}
	public static void main(String[] args) {
		
		System.out.println(max(45,6));
		System.out.println(max(21f,52f));
		System.out.println(max(1,4,0));
		
	}

}
