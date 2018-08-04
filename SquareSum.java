package str;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @author me
 * @date 2018年5月21日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 数列的第一项为n，以后各项为前一项的平方根，求数列的前m项的和。
 * 输入描述:
 * 输入数据有多组，每组占一行，由两个整数n（n < 10000）和m(m < 1000)组成，n和m的含义如前所述。
 * 要求精度保留2位小数。
 * 
 * 思路：
 * 先输入一个数，用for循环m次，用sumnum记录数据之和，Math.sqrt(num)计算平方根
 */
public class SquareSum {

	public static void main(String[] args){
	
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int first = sc.nextInt();
			int count = sc.nextInt();
			float resultnum = 0;
			double nextnum = first;
			for(int i=0;i<count;i++){
				resultnum += nextnum;
				nextnum = Math.sqrt(nextnum);
			}
			String result = ""+resultnum;
			BigDecimal bd = new BigDecimal(resultnum);
			bd = bd.setScale(2, RoundingMode.HALF_UP);
			System.out.print(bd.toString());
		}

	}
}
}
