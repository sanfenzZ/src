package str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author me
 * @date 2018��7��15��  
 * @version 1.0.0 .
 * 
 * ��Ŀ����
 * �����Ĵ�����һ�������ͷ�����һ�����ַ��������硰level�����ߡ�noon���ȵȾ��ǻ��Ĵ���
 * �����ǳ�ϲ������ӵ�жԳ����Ļ��Ĵ������յ�ʱ�����õ���������ֱ����ַ���A���ַ���B��
 * �������ǳ�������û�а취���ַ���B�����ַ���Aʹ�������ַ�����һ�����Ĵ���
 * ����ܻ��������󣬰�����Ѱ���ж����ֲ���취����ʹ�´���һ�����Ĵ�������ַ���B�����λ�ò�ͬ�Ϳ���Ϊ��һ���İ취��
 * ���磺
 * A = ��aba����B = ��b����������4�ְ�B����A�İ취��
* ��A�ĵ�һ����ĸ֮ǰ: "baba" ���ǻ��� 
* �ڵ�һ����ĸ��a��֮��: "abba" �ǻ��� 
* ����ĸ��b��֮��: "abba" �ǻ��� 
* �ڵڶ�����ĸ'a'֮�� "abab" ���ǻ��� 
 * �������������Ĵ�Ϊ2
 * ��������:
 * ÿ���������ݹ����С�
 * ��һ��Ϊ�ַ���A
 * �ڶ���Ϊ�ַ���B
 * �ַ������Ⱦ�С��100��ֻ����Сд��ĸ
 * �������:
 * ���һ�����֣���ʾ���ַ���B�����ַ���A֮�󹹳�һ�����Ĵ��ķ�����

 * ʾ��1
 * ����
 * aba
 * b
 * ���
 * 2
 */
public class Plalindrome {
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String strA = br.readLine();
		 String strB = br.readLine();
		 int result = 0;
		 
		 //String[] arrA = strA.split("");
		 for(int i=0;i<=strA.length();i++){
			 String split1 = strA.substring(0,i);
			 String split2 = strA.substring(i,strA.length());
			 String newstrA = split1+strB+split2;
			 System.out.println(newstrA);
			 result += isPlalindrome(newstrA);
		 }
		 System.out.println(result);
	}

	private static int isPlalindrome(String newstrA) {
		int result = 1;
		char[] arr = newstrA.toCharArray();
		int len = arr.length-1;
		int halflen = len/2;
		for(int i=0;i<=halflen;i++){
			if(arr[i] != arr[len-i])
				result = 0;
		}
		return result;
	}
}
