import java.util.*;
public class Array{
	public static void main(String args[]) {
		int a,b;
		Scanner arr=new Scanner(System.in);
		System.out.println("enter the size if the array in the field\n");
		a=arr.nextInt();
		int ptr[]=new int[a];
		System.out.println("enter the array element in the field\n");
		for(int i=0;i<a;i++) {
			b=arr.nextInt();
			ptr[i]=b;
			b=0;
		}
		System.out.println("the array is as follows\n");
		for(int i=0;i<ptr.length;i++) {
			System.out.print(ptr[i]+"  ");
		}
	   System.out.println("\nusing for each loop\n");
	   for(int i:ptr) {
		   System.out.print(i+"  ");
	   }
	}
}