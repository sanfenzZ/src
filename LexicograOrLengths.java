package str;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author me
 * @date 2018年6月17日  
 * @version 1.0.0 
 * 
 * 输入描述:
 * 输入第一行为字符串个数n(n ≤ 100)
 * 接下来的n行,每行一个字符串,字符串长度均小于100，均由小写字母组成
 * 输出描述:
 * 如果这些字符串是根据字典序排列而不是根据长度排列输出"lexicographically",
 * 如果根据长度排列而不是字典序排列输出"lengths",
 * 如果两种方式都符合输出"both"，否则输出"none"

 * 输入
 * 3
 * a
 * aa
 * bbb
 * 输出
 * both
 
 * 思路：
 * 用ArrayList接收，用IsLexicographically，IsLengths判断符合哪些特征，用boolean返回
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
