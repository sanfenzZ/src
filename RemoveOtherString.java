package str;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author me
 * @date 2018年6月12日
 * @version 1.0.0
 * 
 *          题目描述 输入两个字符串，从第一字符串中删除第二个字符串中所有的字符。例如，输入”They are
 *          students.”和”aeiou”，则删除之后的第一个字符串变成”Thy r stdnts.” 输入描述: 每个测试输入包含2个字符串
 *          输出描述: 输出删除后的字符串
 * 
 *          输入 They are students. aeiou 输出 Thy r stdnts.
 */
public class RemoveOtherString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		ArrayList<String> result = new ArrayList<>();
		result = RemoveStr(s1, s2);
		Iterator<String> it = result.iterator();
		while(it.hasNext())
			System.out.print(it.next());
	}

	private static ArrayList<String> RemoveStr(String s1, String s2) {
		ArrayList<String> list = new ArrayList<String>();
		String[] str1 = s1.split("");
		for(int i=0;i<str1.length;i++)
			list.add(str1[i]);
		//char[] str2 = s2.toCharArray();
		String[] str2 = s2.split("");
		for (int i = 0; i < str2.length; i++) {
			while (list.contains(str2[i])) {
				int j = list.indexOf(str2[i]);
				//System.out.println(j);
				list.remove(j);
			}
		}

		return list;
	}
}
