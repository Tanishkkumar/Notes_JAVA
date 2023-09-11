package Interfaces;
class phone {
   public void call() {
	   System.out.println("phone call");
   }
   public void sms() {
	   System.out.println("phone sending sms");
   }
}

interface Icamera{
	public void click();
	public void record();
}

interface Imusicplayer{
	public void play();
	public void stop();
}

class smartphone extends phone implements Icamera,Imusicplayer{
	public void vediocall(){
	 System.out.println("smartphone vediocall");
	}
	public void click() {
		System.out.println("smartphone clicking photos");
	}
	public void record() {
		System.out.println("smartphone recording vedios");
	}
	public void play() {
		System.out.println("smartphone playing music");
	}
	public void stop() {
		System.out.println("smartphone stop playing music");
	}
}

public class smartphone_Interface {

	public static void main(String[] args) {
		
		smartphone sp=new smartphone();
		sp.call();
		sp.click();
		sp.play();
		System.out.println();
		phone p=new smartphone();  //yha refernce phone ka hai pr object smartphone ka
		p.call();                  //yha only phone ke inside method hi run kar sakte hai.
		p.sms();
		//p.click();   //ye error dega kyoki ye phone mai hai hi nhi.
		System.out.println();
		 Icamera c=new smartphone();  
		 c.click();
		 c.record();
		 
		 System.out.println();
		 Imusicplayer m=new smartphone();
		 m.play();
		 m.stop();

	}

}
