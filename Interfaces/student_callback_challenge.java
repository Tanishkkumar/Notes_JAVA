package Interfaces;

interface member{
	int A=10;
	public abstract  void callback();
}
class store{
	member arr[]=new member[10];   //array of objects
	int count=0;	
	void register(member m	) {
		arr[count++]=m;	
	}
	
	void invitesale() {
		for(int i=0;i<count;i++) {
			arr[i].callback();
		}
	}
}
class customer implements member{
	public String name;
	customer(String a){
		name=a;
	}
	public void callback() {
		System.out.println("ok, i will visit "+name);
	}
}

public class student_callback_challenge {
	public static void main(String[] args) {
		store s=new store();
		customer c1=new customer("tanishk");
		customer c2=new customer("oraab");
		s.register(c1);
		s.register(c2);
		s.invitesale();

	}

}
