package src;

import java.util.Scanner;

/**
 * @author me
 * @date 2018年6月7日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 小明同学学习了不同的进制之后，拿起了一些数字做起了游戏。小明同学知道，在日常生活中我们最常用的是十进制数，而在计算机中，二进制数也很常用。
 * 现在对于一个数字x，小明同学定义出了两个函数f(x)和g(x)。
 *  f(x)表示把x这个数用十进制写出后各个数位上的数字之和。如f(123)=1+2+3=6。 
 *  g(x)表示把x这个数用二进制写出后各个数位上的数字之和。如123的二进制表示为1111011，那么，g(123)=1+1+1+1+0+1+1=6。 
 *  小明同学发现对于一些正整数x满足f(x)=g(x)，他把这种数称为幸运数，现在他想知道，小于等于n的幸运数有多少个？
 * 输入描述:
 * 每组数据输入一个数n(n<=100000)
 * 输出描述:
 * 每组数据输出一行，小于等于n的幸运数个数。
 */
public class DeimalAddBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <=n; i++) {
			if(f(i)== g(i))
				count++;
		}
		System.out.println(count);
	}
	 public static int f(int n){
	        int number =0;
	        while(n!=0){
	            number += n%10;
	            n /= 10;
	        }
	        return number;
	    }
	     
	  
	    public static int g(int n){
	        int number =0;
	        while(n!=0){
	            number += n%2;
	            n /= 2;
	        }
	        return number;
	   }
	/*private static int f(int x){
		String str = ""+x;
		String[] str1 = str.split("");
		int result = 0;
		for (int j = 1; j < str1.length; j++) {
			int num = Integer.parseInt(str1[j]);
			result += num;
		}
		return result;
	}
	private static int g(int x){
		String str = Integer.toBinaryString(x);
		//System.out.println(str);
		String[] str1 = str.split("");
		int result = 0;
		for (int j = 1; j < str1.length; j++) {
			int num = Integer.parseInt(str1[j]);
			result += num;
		}
		return result;
	}*/
}
