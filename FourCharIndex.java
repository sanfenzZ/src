package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��10��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * �ٶ�һ�ֱ���ı��뷶Χ��a ~ y��25����ĸ����1λ��4λ�ı��룬������ǰѸñ��밴�ֵ��������γ�һ���������£�
 *  a, aa, aaa, aaaa, aaab, aaac, �� ��, b, ba, baa, baaa, baab, baac �� ��, yyyw, yyyx, yyyy
 *  ����a��IndexΪ0��aa��IndexΪ1��aaa��IndexΪ2���Դ����ơ�
 *  ��дһ������������������һ�����룬�����������Ӧ��Index.
 * ��������:
 * ����һ����������ַ���,�ַ�������С�ڵ���100.
 * �������:
 * �����������index

 * ����
 * baca
 * ���
 * 16331
 */
public class FourCharIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(Index(s));
	}
	
	public static int Index(String str){
		int[]factor = {1+25+25*25+25*25*25,1+25+25*25,1+25,1};
		char[] arr = str.toCharArray();
		int result = 0;
		int len = 0;
		for(int i=0;i<arr.length;i++)
			result += factor[len++]*(arr[i]-'a');
		
		return result+(len-1);
	}
}
