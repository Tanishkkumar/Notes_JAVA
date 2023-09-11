import java.util.*;
class subject{
		private int stID;
		private String name;
		private int maxMarks;
		private int marksob;	
		
	subject(int id,String na,int max){
			stID=id;
			name=na;
			maxMarks=max;
		}
		public void setmax(int b) {
			maxMarks=b;
		}
		
		public int getmax() {
			return maxMarks;
		}
		
		public void setmarks(int b) {
			marksob=b;
		}
		public int getmarks() {
			return marksob;
		}
		
		public int getid() {
			return stID ;
		}
		public String getname() {
			return name;
		}
		
		boolean qualified() {
			if(marksob>=maxMarks/10*4) {
				return true;
			}
			else {
				return false;
			}
		}
		
		
		public String toString() {
			return "\nsubject id:"+stID+"\nname:"+name+"\nmarks obtain:"+maxMarks;
		}
		
		

		
}
public class ArrayofObjects {

	public static void main(String[] args) {
		subject arr[]=new subject[3];
		
		arr[0]=new subject(101,"DS",100);
		arr[1]=new subject(102,"Algorithm",100);
		arr[2]=new subject(106,"Operating System",100);
		
		
		
       
		for(subject a:arr) {
			System.out.println(a);
		}
	}

}
