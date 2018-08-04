package str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author me
 * @date 2018年5月24日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 有一条彩色宝石项链，是由很多种不同的宝石组成的，包括红宝石，蓝宝石，钻石，翡翠，珍珠等。
 * 有一天国王把项链赏赐给了一个学者，并跟他说，你可以带走这条项链，但是王后很喜欢红宝石，蓝宝石，紫水晶，翡翠和钻石这五种，
 * 我要你从项链中截取连续的一小段还给我，这一段中必须包含所有的这五种宝石，剩下的部分你可以带走。如果无法找到则一个也无法带走。
 * 请帮助学者找出如何切分项链才能够拿到最多的宝石。
 * 输入描述:
 * 我们用每种字符代表一种宝石，A表示红宝石，B表示蓝宝石，C代表紫水晶，D代表翡翠，E代表钻石，F代表玉石，G代表玻璃等等，
 * 我们用一个全部为大写字母的字符序列表示项链的宝石序列，注意项链是首尾相接的。
 * 每行代表一种情况。
 * 
 * 思路：
 * 尺取法
 * 先用contains()查找是否存在ABCDE的存在，用stringbuffer存储， 
 * 以A为基点，找BCDE的最短值，比较从中间和从两边的值取较小的
 */
public class PreciousStoneSecklace {

	public static void  main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		while((str = br.readLine()) != null){
			int len = str.length();
			char[] charArr = new char[2*len];
			
			for(int i=0;i<charArr.length;i++)//用两个一样的数组组成循坏的现象
				charArr[i] = str.charAt(i%len);
			int[] indexArr = {-1,-1,-1,-1,-1};
			int MaxValue = 0;
			for(int i=0;i<charArr.length;i++){
				if(charArr[i] >= 'A' && charArr[i] <= 'E'){
					indexArr[charArr[i]-'A'] = i;
				
				if(arrNum(indexArr))
					MaxValue = Math.max(MaxValue, len - MaxABCDE(indexArr));
					
			}
			}
			System.out.println(MaxValue);
		}
	
	}
	private static int MaxABCDE(int[] arr){
		int max = -1;int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		return max-min+1;
	}
	private static  boolean arrNum(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr[i] < 0)
				return false;
		}
		return true;
	}
}
