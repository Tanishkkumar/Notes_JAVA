
public class variable_argument {
     static void fun(int val,int...x) {
    	  int i=0;
    	  System.out.println(x.length);
    	  System.out.println(x[++i]);
      }
	public static void main(String[] args) {
      fun(10,20,30,40,50,60);
	}

}
