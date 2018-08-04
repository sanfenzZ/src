package src;

/**
 * @author me
 * @date 2018Äê7ÔÂ13ÈÕ  
 * @version 1.0.0 
 */
public class NowcorderSixTest3 {
	public static void main(String[] args) {
		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		
		t1.start();t2.start();t3.start();
	}
}
class Ticket implements Runnable{
	
	private Object obj = new Object();
	private int num = 100;
	
	public void run(){
		while(true){
			synchronized (obj) {
				if(num>0){
					try{
						Thread.sleep(10);
					}catch(InterruptedException e){}
					System.out.println(Thread.currentThread().getName()+"..."+num--);
				}
			}
		}
	}
}