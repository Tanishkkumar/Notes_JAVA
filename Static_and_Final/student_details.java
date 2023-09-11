package Static_and_Final;
 import java.util.Date;

class student{
	private String roll;
	private static int count=1;
	private String setrol() {
		Date d=new Date();
		String rno="Univ-"+(d.getYear()+1900)+"-"+count;
		count++;
		return rno;
	}
	
	student(){
		roll=setrol();
	}
	public String getroll() {
		return roll;
	}
}

public class student_details {
	
	public static void main(String[] args) {
		student s1=new student();
		student s2=new student();
		student s3=new student();
		
		System.out.println(s1.getroll());
		System.out.println(s2.getroll());
		System.out.println(s3.getroll());


	}

}
