package str;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author me
 * @date 2018年5月15日
 * @version 1.0.0 题目描述 设有n个正整数，将他们连接成一排，组成一个最大的多位整数。
 *          如:n=3时，3个整数13,312,343,连成的最大整数为34331213。
 *          如:n=4时,4个整数7,13,4,246连接成的最大整数为7424613。
 */
public class MinStrCombination {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int count = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i < count; i++)
				list.add(sc.nextInt());
			Collections.sort(list, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					String str1 = String.valueOf(o1);
					String str2 = String.valueOf(o2);
					return (str2 + str1).compareTo(str1 + str2);
				}
			});
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j));
			}
		}
	}
}
