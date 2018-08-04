package src;

/**
 * @author me
 * @date 2018Äê7ÔÂ13ÈÕ  
 * @version 1.0.0 
 */
public class NowcorderSixTest1 {
	public static void main(String[] args) {
		Cus b = new Cus();
		Cus c = new Cus();
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(b);
		Thread t3 = new Thread(c);
		
		t1.start();t3.start();
		t2.start();
	}
}
class Cus implements Runnable{
	Bank b = new Bank();
	public void run(){
		for(int i=0;i<3;i++)
			b.add(100);
	}
}
class Bank{
	private int sum;
	
	public synchronized void add(int num){
		sum += num;
		System.out.println(sum);
	}
}