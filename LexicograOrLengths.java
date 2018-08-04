package str;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��17��  
 * @version 1.0.0 
 * 
 * ��������:
 * �����һ��Ϊ�ַ�������n(n �� 100)
 * ��������n��,ÿ��һ���ַ���,�ַ������Ⱦ�С��100������Сд��ĸ���
 * �������:
 * �����Щ�ַ����Ǹ����ֵ������ж����Ǹ��ݳ����������"lexicographically",
 * ������ݳ������ж������ֵ����������"lengths",
 * ������ַ�ʽ���������"both"���������"none"

 * ����
 * 3
 * a
 * aa
 * bbb
 * ���
 * both
 
 * ˼·��
 * ��ArrayList���գ���IsLexicographically��IsLengths�жϷ�����Щ��������boolean����
 */
public class LexicograOrLengths {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String[] str = new String[count];
		for(int i=0;i<count;i++)
			str[i] = sc.next();
		
		boolean boolABC = IsLexicographically(str);
		boolean boolLen = IsLengths(str);
		
		if(boolABC && boolLen){
			System.out.print("both");
		}else if(boolABC){
			System.out.print("lexicographically");
		}else if(boolLen){
			System.out.print("lengths");
		}else
			System.out.print("none");
	}
	private static boolean IsLexicographically(String[] str){
		int len = str.length;
		boolean bool = true;
		for(int i=1;i<len;i++)
			if(str[i].compareTo(str[i-1]) <= 0){
				bool = false;
				return bool;
			}
		return bool;
	}
	private static boolean IsLengths(String[] str){
		int len = str.length;
		boolean bool = true;
		for(int i=1;i<len;i++)
			if(str[i].length() <= str[i-1].length()){
				bool = false;
				return bool;
			}
		return bool;
	}
}
