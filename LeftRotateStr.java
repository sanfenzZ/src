package src;

import java.util.ArrayList;

/*
 * 题目描述
 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
 */
public class LeftRotateStr {
	public String LeftRotateString(String str, int n) {
		if(n <= 0 || str.length() <= 0 || str ==null)
			return str;
		int len = str.length();
		char[] ch = str.toCharArray();
		char[] chcopy = new char[len];
		int count = n;
		for(int i=0;count<len;i++){
			chcopy[i] = ch[count];
			count++;
		}
		for(int i=0;i<n;i++)
			chcopy[len-n+i] = ch[i];
		
		String string = "";
		for(int i=0;i<len;i++)
			string += chcopy[i];
		return string;
	}
	public static void main(String[] args){
		LeftRotateStr l = new LeftRotateStr();
		String st = "";
		System.out.println(l.LeftRotateString(st, 3));
	}
}
