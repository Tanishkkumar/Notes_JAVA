
public class String_Objects {

	public static void main(String[] args) {
		
		//	  1st method of creating string using string constructor of string class-->  String(char [])  
		char a[]= {'a','b','c'};
		System.out.println(a);
		System.out.printf("%c\n",a[0]);
		//System.out.printf("%s\n",a);       //this will print any random value sice its a character array not a string..
		
		
		String arr=new String(a);
		System.out.println(arr);
		//System.out.printf("%c\n",arr[0]);      //this will show error
		System.out.printf("%s\n\n\n",arr);
		
		
		
		//	  2nd method of creating string using string constructor of string class-->  String(byte [])  
		
		byte b[]= {65,66,67};
		//System.out.println(b);    //ye random value print karega
		System.out.printf("%d\n",b[0]);
		//System.out.printf("%s\n",a);       //this will print any random value sice its a character array not a string..
		
		
		String ptr=new String(b);
		System.out.println(ptr);
		//System.out.printf("%c\n",arr[0]);      //this will show error
		System.out.printf("%s\n\n\n",ptr);
		
		
		
		//	  3rd method of creating string using string constructor of string class-->  String(String);
		
		String ctr=new String("oraab singh");
		System.out.println(ctr);
		System.out.printf("%s\n",ctr);

	}

}
