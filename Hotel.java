package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018年5月31日  
 * @version 1.0.0 
 * 题目描述
 * 酒店房间的价格录入是通过时间段来录入的，比如10月1日至10月7日800元，10月8日至10月20日500元，
 * 请实现以下函数int[][] merge(int[][] dateRangePrices)，
 * 输入是某个酒店多个日期段的价格，每个日期段（终止日期大于等于起始日期）和对应的价格使用长度为3的数组来表示，
 * 比如[0, 19, 300], [10, 40, 250]分别表示从某天开始第1天到第20天价格都是300，第11天到第41天价格都是250，
 * 这些日期端有可能重复，重复的日期的价格以后面的为准， 请以以下规则合并并输出合并结果：
 * 1.相邻两天的价格如果相同，那么这两个日期段应该合并
 * 2.合并的结果应该以起始日期从小到大排序
 * 输入描述:
 * 输入数据包括多行，如样例输入所示。
 * 输出描述:
 * 输出数据为一行，如样例输出所示
 * 示例1
 * 输入
 * 1 1 100
 * 2 3 100
 * 4 5 110
 * 输出
 * [1, 3, 100],[4, 5, 110]
 */
public class Hotel {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int[] price = new int[10001];
			int min = Integer.MAX_VALUE;int max = Integer.MIN_VALUE;
			while(sc.hasNextInt()){
				int b = sc.nextInt();int e = sc.nextInt();int p =sc.nextInt();
				for(int i=b;i<=e;++i){
					price[i] = p; 
				}
				if(b<min)
					min = b;
				if(e>max)
					max = e;
			}
			
			System.out.print("["+min+", ");
			for(int i=min+1,pre = price[min];i<max;++i){//比较前一点个当前点的价格，如果不一样，说明这是一个划分点
				int cur = price[i];
				if(cur != pre){
					if(pre != 0)                        //前一个点不为0，说明前一个点是一个右闭区间
						System.out.print(i-1+", "+pre+"],");
					if(cur != 0)                        //当前点不为0，说明当前点是一个左闭区间
						System.out.print("["+i+", ");
				}
				pre = cur;
				
			}
			System.out.println(max+", "+price[max]+"]");
		}
	}


}
