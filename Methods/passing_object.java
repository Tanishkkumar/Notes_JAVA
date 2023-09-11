package Methods;

public class passing_object {
	
	static void update(int arr[]) {
		arr[0]=965;
	}
	
	static int[] get(int arr[]) {
		int ptr[]=new int[9];
		int i=0;
		for(int a:arr) {
			ptr[i]=a;
			i++;
		}
		return ptr;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println("before updation->"+arr[0]);
		update(arr);
		int ctr[]=new int[9];
		ctr=get(arr);
		System.out.println("after updation->"+arr[0]);
		
		for(int x:ctr) {
			System.out.print(x+" ");
		}
	}

}
