package src;

import java.util.*;

/*
 * 题目描述
 * 如何得到一个数据流中的中位数？
 * 如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
 * 如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。
 */
public class InsertAndGetMedian {


private int count = 0;

private PriorityQueue<Integer> min = new PriorityQueue<>();
private PriorityQueue<Integer> max = new PriorityQueue<Integer>(15, new Comparator<Integer>() {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o2 - o1;
	}
});	

	    public void Insert(Integer num) {
	    	if(count % 2 == 0){
	    		max.offer(num);						//当数据总数为偶数时，新加入的元素，应当进入小根堆
	    		int maxout = max.poll();		//（注意不是直接进入小根堆，而是经大根堆筛选后取大根堆中最大元素进入小根堆）
	    		//1.新加入的元素先入到大根堆，由大根堆筛选出堆中最大的元素2.筛选后的【大根堆中的最大元素】进入小根堆
	    		min.offer(maxout);					
	    	}else{
	    		min.offer(num);
	    		int minout = min.poll();
	    		max.offer(minout);
	    	}
	    	count++;
	    }

	    public Double GetMedian() {
	        if(count % 2 == 0){
	        	return new Double((max.peek()+min.peek()))/2;
	        }else{
	        	return new Double(min.peek());
	        }
	    }
}
