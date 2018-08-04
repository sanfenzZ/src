package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * 题目描述
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */
public class PrintMinNumber1 {
	public String PrintMinNumber(int[] numbers) {
		String result = "";
		ArrayList<Integer> list = new ArrayList<>();
		int len = numbers.length;
		for(int i=0;i<len;i++)
			list.add(numbers[i]);
		Collections.sort(list,new Comparator<Integer>(){
			public int compare(Integer str1,Integer str2){
				String s1 = str1+""+str2;
				String s2 = str2+""+str1;
				return s1.compareTo(s2);
			}
		});
		for(int j:list)
			result += j;
		
		return result;
	}

	public static void main(String[] args) {
		PrintMinNumber1 p = new PrintMinNumber1();
		int n[] = { 3,32,321 };
		String s = p.PrintMinNumber(n);
		System.out.println(s);
	}
}
