package Inheritance;

class Cir{
	public double radius;
	public double area() {
		return Math.PI*radius*radius;
	}
	
    public double perimeter() {
    	return 2*Math.PI*radius;
    }
    
    public double circumference() {
    	return perimeter();
    }
}

class Cylinder extends Cir{
	public double height;
	public double volumn() {
		return area()*height;
	}
}

public class inheritance_2 {
	public static void main(String[] args) {
		Cylinder c=new Cylinder();
		c.radius=7;
		c.height=10;
		System.out.println("volumn of Cylinder is::"+c.volumn());
		System.out.println("Area of Cylinder is::"+c.area());

		
		
	}

}
