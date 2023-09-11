
public class literals {

	public static void main(String[] args) {
		//System.out.println("hllo");
		int a=999_999_995;   // underscore is use to increase the readability..
		float b=123_456.56f;   //   123_456_.56f   or  123_456._56f  both are not allowed it will throw exception.
		
		int k=5;
		int q=-5;    
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("the binary form of k is---> "+Integer.toBinaryString(k));     //this will show binary form and toBinaryString Method comes under Integer class.
		System.out.println("the binary form of q is---> "+Integer.toBinaryString(q));    //negative number shows in 2 s compliment form
	}

}
