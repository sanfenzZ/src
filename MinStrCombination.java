package str;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author me
 * @date 2018��5��15��
 * @version 1.0.0 ��Ŀ���� ����n�������������������ӳ�һ�ţ����һ�����Ķ�λ������
 *          ��:n=3ʱ��3������13,312,343,���ɵ��������Ϊ34331213��
 *          ��:n=4ʱ,4������7,13,4,246���ӳɵ��������Ϊ7424613��
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
