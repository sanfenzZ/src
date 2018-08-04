package src;

public class Square implements Shape{
	public double area(double n){
		if(n <= 0)
			return 0;
		return n*n;
	}
	public Square(){
	}
	private double b;
	
	public double getB(){
		return b;
	}
	
	public void setB(double ba){
		b = ba;
	}
}
