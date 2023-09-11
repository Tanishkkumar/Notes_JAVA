package Exception_Handling;
class negativedimesionException extends Exception{
	public String toString() {
		return "dim can not be negative";
	}
}
public class ownExceptionClass_Throw_Throws {
	static int  area(int a,int b)throws negativedimesionException{
		if(a<0 || b<0) {
			throw new negativedimesionException();
 		}
		int c=a*b;
		return c;
	}
     static void fun1() {
    	 try {
    	 int a=area(-10,5);
    	 System.out.println("the area is-->"+a);
    	 }
    	 catch(negativedimesionException e) {
    		 System.out.println(e);
    	 }
      }
	public static void main(String[] args) {
       fun1();
	}

}
