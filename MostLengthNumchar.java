package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018年6月15日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 读入一个字符串str，输出字符串str中的连续最长的数字串
 * 输入描述:
 * 个测试输入包含1个测试用例，一个字符串str，长度不超过255。
 * 输出描述:
 * 在一行内输出str中里连续最长的数字串。

 * 输入
 * abcd12345ed125ss123456789
 * 输出
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
