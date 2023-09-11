package Inheritance;
class ova{
	public int l;
	public int b;
	public int x=10;
	ova(int l,int b){
		this.l=l;
		this.b=b;
	}
}
class ptr extends ova{
	public int ht;
	public int x=20;
	ptr(int a,int b,int h){
		super(a,b);
		ht=h;
	}
	
	public void dis() {
		System.out.println(this.x);
		System.out.println(x);
	}
}

public class super_keyword {
  public static void main(String[] args) {
	ptr p=new ptr(1,2,3);
	p.dis();
}
}
