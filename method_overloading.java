
public class method_overloading{
	static int fun(int a,int b) {   //yha static nhi likhenge to error dega.
    	return a+2;
    }
	
	static int fun(int a) {   //yha static nhi likhenge to error dega.
    	return a;
    }
	public static void main(String[] args) {
		//Twodimensional_Array mp=new Twodimensional_Array();
		int a= fun(45,47);
		System.out.println(a);
	}
}
