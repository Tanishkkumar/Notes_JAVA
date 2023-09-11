package Methods;

public class max {
	/*here we have to include static in maxelement 
	 *method as it is called by static method.
	*/
	static int maxelement(int a,int b) {  
		 return (a>b)?a:b;
	}
	
	
     public static void main(String[] args) {
		int a=15;
		int b=85;
		int c=maxelement(a,b);
		System.out.println("the max element is->"+c);
	}
}
