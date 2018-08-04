package src;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��7��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * С��ͬѧѧϰ�˲�ͬ�Ľ���֮��������һЩ������������Ϸ��С��ͬѧ֪�������ճ�������������õ���ʮ�����������ڼ�����У���������Ҳ�ܳ��á�
 * ���ڶ���һ������x��С��ͬѧ���������������f(x)��g(x)��
 *  f(x)��ʾ��x�������ʮ����д���������λ�ϵ�����֮�͡���f(123)=1+2+3=6�� 
 *  g(x)��ʾ��x������ö�����д���������λ�ϵ�����֮�͡���123�Ķ����Ʊ�ʾΪ1111011����ô��g(123)=1+1+1+1+0+1+1=6�� 
 *  С��ͬѧ���ֶ���һЩ������x����f(x)=g(x)��������������Ϊ����������������֪����С�ڵ���n���������ж��ٸ���
 * ��������:
 * ÿ����������һ����n(n<=100000)
 * �������:
 * ÿ���������һ�У�С�ڵ���n��������������
 */
public class DeimalAddBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		for (int i = 1; i <=n; i++) {
			if(f(i)== g(i))
				count++;
		}
		System.out.println(count);
	}
	 public static int f(int n){
	        int number =0;
	        while(n!=0){
	            number += n%10;
	            n /= 10;
	        }
	        return number;
	    }
	     
	  
	    public static int g(int n){
	        int number =0;
	        while(n!=0){
	            number += n%2;
	            n /= 2;
	        }
	        return number;
	   }
	/*private static int f(int x){
		String str = ""+x;
		String[] str1 = str.split("");
		int result = 0;
		for (int j = 1; j < str1.length; j++) {
			int num = Integer.parseInt(str1[j]);
			result += num;
		}
		return result;
	}
	private static int g(int x){
		String str = Integer.toBinaryString(x);
		//System.out.println(str);
		String[] str1 = str.split("");
		int result = 0;
		for (int j = 1; j < str1.length; j++) {
			int num = Integer.parseInt(str1[j]);
			result += num;
		}
		return result;
	}*/
}