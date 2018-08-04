package str;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author me
 * @date 2018年5月29日
 * @version 1.0.0
 * 
 *          题目描述 给定一个英文字符串,请写一段代码找出这个字符串中首先出现三次的那个英文字符。 输入描述:
 *          输入数据一个字符串，包括字母,数字等。 输出描述: 输出首先出现三次的那个英文字符
 * 
 *          思路： 将字符放入26*2的数组中，每次遍历就看值是否到3，到就输出
 */
public class StrCountEqual3 {
	// a:97 z:122 A:65 Z:90
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		str.append(sc.nextLine());
		char[] c = str.toString().trim().toCharArray();
		int[] a = new int[127];

		for (char s : c) {
			a[s]++;
			if ((s >= 'a' && s <= 'z' || s >= 'A' && s <= 'Z') && a[s] == 3) {
				System.out.print(s);
				break;
			}
		}
	}
}
