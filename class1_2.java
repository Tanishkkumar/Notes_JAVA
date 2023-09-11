import java.util.*;
class student{
	private String name;
	private int roll;
	Scanner arr=new Scanner(System.in);
	public void getname() {
		
	    System.out.println("enter the name in the field::");
	    name=arr.nextLine();
	}
	
	public void getroll() {
		System.out.println("enter the roll number in the field::");
	    roll=arr.nextInt();
	}
	
	public void pri() {
		System.out.println(name);
		System.out.println(roll);
	}
}
public class class1_2 {
public static void main(String[] args) {
	student arr=new student();
	student ptr=new student();
	arr.getname();
	arr.getroll();
	arr.pri();
	
	ptr.getname();
	ptr.getroll();
	ptr.pri();

}
}
