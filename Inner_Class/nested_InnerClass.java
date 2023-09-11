package Inner_Class;
class outer{
    public int a=10;
   // inner i=new inner();  hum yha bhe define kar sakte hai inner ke object ko.
    class inner{
    	int b=20;
    	public void innerDisplay() {
    		System.out.println(a+"::"+b);
    	}
    }
    
    public void outerDisplay() {
    	inner i=new inner();
    	i.innerDisplay();
    	//System.out.println(i.b);
    }
}

public class nested_InnerClass {
	public static void main(String[] args) {
		outer o=new outer();
		o.outerDisplay();
		
		
		//for direct access of inner class inside main method we use
//		outer.inner oi=new outer().new inner();  //inner class object in main method
//		oi.innerDisplay();
	}

}
