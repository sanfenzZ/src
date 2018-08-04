package str;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author me
 * @date 2018年5月21日  
 * @version 1.0.0 
 * 
 * “水仙花数”是指一个三位数，它的各位数字的立方和等于其本身，比如：153=1^3+5^3+3^3。 现在要求输出所有在m和n范围内的水仙花数。
 * 输入描述:
 * 输入数据有多组，每组占一行，包括两个整数m和n（100 ≤ m ≤ n ≤ 999）。
 * 输出的水仙花数必须大于等于m,并且小于等于n，如果有多个，则要求从小到大排列在一行内输出，之间用一个空格隔开;
 * 
 * 思路：
 * 建立一个for，从num1-num2,用ArrayList记录有效数据
 */
public class NarcissisticNumber {
	private static int num3(int num){
		int result = num*num*num;
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			for(int i=num1;i<=num2;i++){
				String numstr = String.valueOf(i);
				String[] arrstr = numstr.split("");
				
				int sumstr = 0;
				for(int j=1;j<arrstr.length;j++)
					sumstr += num3(Integer.parseInt(arrstr[j]));
				if(i == sumstr)
					list.add(i);
			}
			if(list.size()!=0){
				for(int j=0;j<list.size();j++)
					System.out.print(list.get(j)+" ");
			}else{
				System.out.println("no");
			}
		}
		
		
	}
}
