package str;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author me
 * @date 2018年6月22日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 给定一个正整数，编写程序计算有多少对质数的和等于输入的这个正整数，并输出结果。输入值小于1000。
 * 如，输入为10, 程序应该输出结果为2。（共有两对质数的和为10,分别为(5,5),(3,7)）
 * 输入描述:
 * 输入包括一个整数n,(3 ≤ n < 1000)
 * 输出描述:
 * 输出对数

 * 示例1
 * 输入
 * 10
 * 输出
 * 2
 */
public class PrimeNumberAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList arr = Primearr(n);
		System.out.println(arr);
		System.out.print(Add(arr,n));
	}
	private static ArrayList Primearr(int num){//求num内的质数集合
		//StringBuffer sf = new StringBuffer();
		ArrayList<Integer> list = new ArrayList<>();
		int arrcount = 0;
		for(int i=2;i<=num;i++){
			int j=2;
			
			while(i % j != 0)
				j++;
			
			if(i == j)
				list.add(i);
		}
		return list;//sf.toString();
	}
	
	private static int Add(ArrayList<Integer> list,int n){
		int count = 0;
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.size();j++)
				if(list.get(i)+list.get(j) == n){
					//System.out.println("lsit:"+list.get(i)+"..."+list.get(j));
					count++;
					list.remove(list.get(j));
				}
			}
		return count;
	}
}
