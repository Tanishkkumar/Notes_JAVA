package ARRAYS;

public class Jagged_Array {

	public static void main(String[] args) {
      int arr[][]=new int [3][];
      arr[0]=new int[2];
      arr[1]=new int[4];
      arr[2]=new int[3];
      
      System.out.println("printing of jagged array is as follows");
      
      
      //using for each loop.
      for(int i[]:arr) {
      	for(int y : i) {
      		System.out.print(y+" ");
      	}
      	System.out.println();
      }
	}
	
}
