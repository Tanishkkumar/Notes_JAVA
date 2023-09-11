package Interfaces;
interface fun{
	public void meth1();
	public void meth2();
	
}

class joy implements fun{
	public void meth1() {
		System.out.println("meth1 of class joy");
	}
	
	public void meth2() {
		System.out.println("meth2 of class joy");
	}
	
	public void meth3() {
		System.out.println("meth3 of class joy");
	}
}
public class interface2 {
	public static void main(String[] args) {
		fun f;
		f=new joy();
		f.meth1();
		f.meth2();
		//f.meth3();
	}

}
