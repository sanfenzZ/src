package lab03;

/*
 * 题目描述
在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。
输入一个数组,求出这个数组中的逆序对的总数P。并将P对1000000007取模的结果输出。 即输出P%1000000007
输入描述:
题目保证输入的数组中没有的相同的数字

数据范围：                                                                                                     示例1
对于%50的数据,size<=10^4							输入
对于%75的数据,size<=10^5								1,2,3,4,5,6,7,0
对于%100的数据,size<=2*10^5						输出
													7
 */
public class InversePair {
	public int InversePairs(int [] array) {
		if(array.length == 0 || array == null)
			return 0;
		int len = array.length;
		int [] copy = new int[len];
		for(int i=0;i<len;i++)
			copy[i] = array[i];
		int count = InversePairscount(array,copy,0,len-1);
		return count;
	}
	private int InversePairscount(int[] array, int[] copy, int start, int last) {
		if(start == last)
			return 0;
		int mid = (start+last)/2;
		int leftcount = InversePairscount(array,copy,start,mid)%1000000007;
		int rightcount = InversePairscount(array,copy,mid+1,last)%1000000007;
		
		int count = 0;
		int i = mid;
		int j = last;
		int copynum = last;
		while(i>=start && j>mid){
			if(array[i] > array[j]){
				count += j-mid;
				copy[copynum--] = array[i--];
				if(count >= 1000000007){
					count %= 1000000007;
				}
			}else{
				copy[copynum--] = array[j--];
			}
		}
		
		for(;i>=start;i--)
			copy[copynum--] = array[i];
		for(;j>=last;j--)
			copy[copynum--] = array[j];
		for(int s=start;s<=last;s++)
			array[s] = copy[s];
		return (count+leftcount+rightcount)%1000000007;
	}
	
	
	public static void  main(String[] args){
		InversePair i = new InversePair();
		int[] a = {1,2,3,4,5,6,7,0};
		System.out.println(i.InversePairs(a));
		System.out.println("是错的");
	}
}
