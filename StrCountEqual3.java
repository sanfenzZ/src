package str;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author me
 * @date 2018��5��29��
 * @version 1.0.0
 * 
 *          ��Ŀ���� ����һ��Ӣ���ַ���,��дһ�δ����ҳ�����ַ��������ȳ������ε��Ǹ�Ӣ���ַ��� ��������:
 *          ��������һ���ַ�����������ĸ,���ֵȡ� �������: ������ȳ������ε��Ǹ�Ӣ���ַ�
 * 
 *          ˼·�� ���ַ�����26*2�������У�ÿ�α����Ϳ�ֵ�Ƿ�3���������
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
