package Access_modifirs;
import MY_PACK1.demo1;
public class aces_mod {  
	public static void main(String[] args){
		demo1 d1=new demo1(); //as it using object to call therefor its a non sub class 
		//d1.dis();	          //so it will allow only public member of another package
		System.out.println(d1.a+d1.b+d1.c+d1.d);//class to print which is d in this case.
		
		//System.out.println(d1.d);  this will print as d is public in demo1 class.
		
		//demo2 d3=new demo2();
		
	}
}	
	