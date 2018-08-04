package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018年6月5日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 给你六种面额1、5、10、20、50、100元的纸币，假设每种币值的数量都足够多，编写程序求组成N员（N为0-10000的非负整数）的不同组合的个数。
 * 输入描述:
 * 输入为一个数字N，即需要拼凑的面额
 * 输出描述:
 * 输出也是一个数字，为组成N的组合个数。

 * 输入
 * 5
 * 输出
 * 2
 *https://www.nowcoder.com/questionTerminal/14cf13771cd840849a402b848b5c1c93
 */
public class MoneyAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int num = sc.nextInt();
			long[] arr = new long[num+1];  // 保存计算数据的数组
			int[] mon = {1,5,10,20,50,100};// 保存基本面额的数组
			for(int i=0;i<=num;i++)        // 边界条件A(n,1) = 1 (n>=0)
				arr[i] = 1;
			for(int i=1;i<6;i++)           // 基本面额从5开始，因为1元情况在数组初始化时已经写入了
				for(int j=1;j<arr.length;j++)// n从1开始，保证了边界条件A(0,m)=1 (m=1,5,10,20,50,100)
					if(j >= mon[i])
						arr[j] += arr[j-mon[i]];// 状态转移方程
			System.out.println(arr[num]);
		}
	}
}
