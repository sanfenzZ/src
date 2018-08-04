package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018年6月23日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 现在有一个数组，其值为从1到10000的连续增长的数字。出于某次偶然操作，导致这个数组中丢失了某三个元素，同时顺序被打乱，
 * 现在需要你用最快的方法找出丢失的这三个元素，并且将这三个元素根据从小到大重新拼接为一个新数字，计算其除以7的余数。
 *  例：丢失的元素为336，10，8435，得到的新数字为103368435，除以七的余数为2。
 * 输入描述:
 * 输入数据为一行，包含9997个数字，空格隔开。
 * 输出描述:
 * 输出为一行，包含一个数字。

 */
public class LastThreeNum {

	static int[] num = new int[10001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<9997;i++){
			int j = sc.nextInt();
			num[j] = 1;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<10001;i++){
			if(num[i] == 0)
				sb.append(i);
		}
		long bi = Long.parseLong(sb.toString());
		System.out.print(bi%7);
	}

}
