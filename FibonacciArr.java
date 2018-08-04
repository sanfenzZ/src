package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018年7月15日  
 * @version 1.0.0 
 * 
 * 题目描述
 * Fibonacci数列是这样定义的：
 * F[0] = 0
 * F[1] = 1
 * for each i ≥ 2: F[i] = F[i-1] + F[i-2]
 * 因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，在Fibonacci数列中的数我们称为Fibonacci数。
 * 给你一个N，你想让其变为一个Fibonacci数，每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少需要多少步可以变为Fibonacci数。
 * 输入描述:
 * 输入为一个正整数N(1 ≤ N ≤ 1,000,000)
 * 输出描述:
 * 输出一个最小的步数变为Fibonacci数"

 * 示例1
 * 输入
 * 15
 * 输出
 * 2
 */
public class FibonacciArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0,b=1;
		
		while(b <= n){
			int sum = a+b;
			a = b;
			b = sum;
		}
		
		//System.out.println("a:"+a+"b:"+b);
		System.out.println((b-n)>(n-a)?n-a:b-n);
	}
}
