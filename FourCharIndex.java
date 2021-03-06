package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018年6月10日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 假定一种编码的编码范围是a ~ y的25个字母，从1位到4位的编码，如果我们把该编码按字典序排序，形成一个数组如下：
 *  a, aa, aaa, aaaa, aaab, aaac, … …, b, ba, baa, baaa, baab, baac … …, yyyw, yyyx, yyyy
 *  其中a的Index为0，aa的Index为1，aaa的Index为2，以此类推。
 *  编写一个函数，输入是任意一个编码，输出这个编码对应的Index.
 * 输入描述:
 * 输入一个待编码的字符串,字符串长度小于等于100.
 * 输出描述:
 * 输出这个编码的index

 * 输入
 * baca
 * 输出
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
