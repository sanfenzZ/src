package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018年6月24日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 给定整数n和m, 将1到n的这n个整数按字典序排列之后, 求其中的第m个数。
 * 输入描述:
 * 输入仅包含两个整数n和m。
 * 数据范围: 
 * 对于20%的数据, 1 <= m <= n <= 5 ; 
 * 对于80%的数据, 1 <= m <= n <= 10^7 ; 
 * 对于100%的数据, 1 <= m <= n <= 10^18.
 * 输出描述:
 * 输出仅包括一行, 即所求排列中的第m个数字.

 * 示例1
 * 输入
 * 11 4
 * 输出
 * 2
	
 */
public class DictionarySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
	
		long i = 1;
		m--;
		while(m != 0){
			
			long num = 0;
			long start = i,end = i+1;
			while(start <= n){
				num += Math.min(n+1,end)-start;
				start *= 10;
				end *= 10;
				//System.out.println(start);
			}
			if(num>m){
				i *= 10;
				m--;
			}else{
				m -= num;
				i++;
			}
		}
	
	
	System.out.println(i);
	
	}
}