package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��15��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * ����һ���ַ���str������ַ���str�е�����������ִ�
 * ��������:
 * �������������1������������һ���ַ���str�����Ȳ�����255��
 * �������:
 * ��һ�������str��������������ִ���

 * ����
 * abcd12345ed125ss123456789
 * ���
 * 123456789
 */
public class MostLengthNumchar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.print(LongestNum(str));
	}
	public static String LongestNum(String str){
		char[] str1 = str.toCharArray();
		boolean bool = false;
		String result = "";
		String finalresult = "";
		
		for(int i=0;i<str1.length;i++){
			//System.out.println("str["+i+"]:"+str1[i]);
			if(str1[i]>='0'&&str1[i]<='9'){
				bool = true;
				result += str1[i];
				if(result.length()>finalresult.length())
					finalresult = result;
			}else
				result = "";
			
			//System.out.println("result:"+result);
		}
		return finalresult;
	}
}
