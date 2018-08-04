package src;

import java.util.Scanner;

/**
 * @author me
 * @date 2018年6月6日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 有一个X*Y的网格，小团要在此网格上从左上角到右下角，只能走格点且只能向右或向下走。
 * 请设计一个算法，计算小团有多少种走法。给定两个正整数int x,int y，请返回小团的走法数目。
 * 输入描述:
 * 输入包括一行，逗号隔开的两个正整数x和y，取值范围[1,10]。
 * 输出描述:
 * 输出包括一行，为走法的数目。
 * 示例1
 * 输入
 * 3 2
 * 输出
 * 10
 */
public class WalkNetTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println(dd(i,j));
		
		/*int[][] f = new int[11][11];
		for(int m = 0;m<=i;m++)
			f[m][0] = 1;
		for(int n = 0;n<=j;n++)
			f[0][n] = 1;
		for(int m =1;m<=i;m++)
			for(int n=1;n<=j;n++)
				f[m][n] = f[m-1][n]+f[m][n-1];
		System.out.println(f[i][j]);*/
	}
	private static int dd(int i,int j){
		if(i == 0|| j== 0)
			return 1;
		return dd(i-1,j)+dd(i,j-1);	
	}
}
