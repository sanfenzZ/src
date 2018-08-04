package src;

public class Undergradute extends Student{

	private String degree;
	public Undergradute(String n,int a,String d){
		super(n,a);
		this.degree = d;
	}
	
	public String getDegree(){
		return degree;
	}
	
	public void setDegree(String d){
		degree = d;
	}
	public String show(){
		String s = "ĞÕÃû "+getName() + "  Äêıg  " + getAge()+" ŒWÎ» "+getDegree();
		return s;
	}
}
