package src;

/**
 * @author me
 * @date 2018��7��13��  
 * @version 1.0.0 
 * 
 * ���߳�
 */
public class NowcorderSixTest2 {
	public static void main(String[] args) {
		Demo d = new Demo();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		
		t1.start();
		t2.start();
	}
	
}
class Demo implements Runnable{

	public void run() {
		show();
	}
	public void show(){
		for(int i=0;i<20;i++){
			System.out.println(Thread.currentThread().getName()+"......"+i);
		}
	}
	
	
}