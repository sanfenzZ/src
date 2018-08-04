package src;

public class Circle implements Shape{
	
	public Circle(){
	}
	
	public double area(double n){
		if(n <= 0)
			return 0;
		return 3.14*n*n;
	}
	
	private double c;
	
	public double getC(){
		return c;
	}
	
	public void setC(double ba){
		c = ba;
	}
}
