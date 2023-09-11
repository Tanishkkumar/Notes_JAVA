package ARRAYS;

public class Twodim_array {

	public static void main(String[] args) {
        int arr[][]=new int [3][3];
        arr[0][0]=0;
        for(int i[]:arr) {
        	for(int y : i) {
        		System.out.print(y+" ");
        	}
        	System.out.println();
        }
	}

}
