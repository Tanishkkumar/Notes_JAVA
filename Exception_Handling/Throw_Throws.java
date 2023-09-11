package Exception_Handling;

public class Throw_Throws {
	static int  area(int a,int b)throws Exception{
		if(a<0 || b<0) {
			throw new Exception("dim can not be negative");
 		}
		int c=a*b;
		return c;
	}
     static void fun1() {
    	 try {
    	 int a=area(10,5);
    	 System.out.println("the area is-->"+a);
    	 }
    	 catch(Exception e) {
    		 System.out.println(e);
    	 }
      }
	public static void main(String[] args) {
      fun1();
	}

}
