package src;

import java.util.ArrayList;

/*
 * ��Ŀ����
 �����������һ����λָ�����ѭ�����ƣ�ROL���������и��򵥵����񣬾������ַ���ģ�����ָ�����������
 ����һ���������ַ�����S���������ѭ������Kλ������������
 ���磬�ַ�����S=��abcXYZdef��,Ҫ�����ѭ������3λ��Ľ��������XYZdefabc����
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
