package str;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author me
 * @date 2018年5月17日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 给定一个句子（只包含字母和空格）， 将句子中的单词位置反转，单词用空格分割, 单词之间只有一个空格，前后没有空格。
 *  比如： （1） “hello xiao mi”-> “mi xiao hello”
 *  
 *  思路：
 *  建立一个栈，输入字符串，最后再从栈中取出，
 */
public class ReversalStr {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.nextLine();
			String[] arr = str.split(" ");
			StringBuffer sb = new StringBuffer();
			for(int i=arr.length-1;i>0;i--)
				sb.append(arr[i]+" ");
			sb.append(arr[0]);
			System.out.println(sb.toString());	
			
			
		}
	}
}
