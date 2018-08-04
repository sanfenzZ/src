package src;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author me
 * @date 2018年7月13日
 * @version 1.0.0
 * 
 *          链接：https://www.nowcoder.com/discuss/74859 来源：牛客网
 *          需求描述：
 * 
 *          在一个系统中，存在生产者和消费者两种角色，他们通过内存缓冲区进行通信，生产者生产消费者需要的资料，消费者把资料做成产品，
 *          先要求模拟实现一个生产者消费者模型，具体要求如下： 
 * 
 *          生产者与消费者线程独立，通过不同线程实现 内存缓冲区为空的时候消费者必须等待，而内存缓冲区满的时候，生产者必须等待
 *          多线程对临界区资源的操作时候必须保证在读写中只能存在一个线程
 */
public class NowcoderSixTest {
	public static void main(String[] args) {

	}
}

class PCData {
	private final int intData;

	public PCData(int d) {
		intData = d;
	}

	public PCData(String d) {
		intData = Integer.parseInt(d);
	}

	public int getData() {
		return intData;
	}

	public String toString() {
		return "data:" + intData;
	}
}

// 生产者
class Product implements Runnable {
	private volatile boolean isRunning = true;
	private BlockingQueue<PCData> queue;
	private static AtomicInteger count = new AtomicInteger();// 原子操作，不用使用synchronized进行同步
	private static final int SLEEPTIME = 1000;

	public Product(BlockingQueue queue) {
		this.queue = queue;
	}

	public void run() {
		PCData data = null;
		Random r = new Random();
		System.out.println("start producting is :"
				+ Thread.currentThread().getId());
		try {
			while (isRunning) {

				Thread.sleep(r.nextInt(SLEEPTIME));
				data = new PCData(count.incrementAndGet());
				System.out.println(data+"加入队列");
				if(!queue.offer(data, 2, TimeUnit.SECONDS))
					System.out.println("加入队列失败");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
			Thread.currentThread().interrupt();
		}

	}
}