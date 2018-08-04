package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��25��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * ����С����һ��W*H��������ӣ�������б��Ϊ0~H-1��������б��Ϊ0~W-1��ÿ������������Է�һ�鵰�⣬�������鵰���ŷ����þ��벻�ܵ���2��
 * ����������������(x1,y1),(x2,y2)��ŷ����þ���Ϊ:
 * ( (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2) ) ������ƽ����
 * С����֪�������ԷŶ��ٿ鵰������������
 * ��������:
 * ÿ������������񳤿�W,H���ÿո�ָ�.(1 �� W��H �� 1000)
 * �������:
 * ���һ�������Էŵĵ�����

 * ʾ��1
 * ����
 * 3 2
 * ���
 * 4
 */
public class CutCake {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int col = sc.nextInt();
		int row = sc.nextInt();
		int count = 0;

		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			if (i % 4 == 0 || i % 4 == 1) {
				for (int j = 0; j < col; j++) {
					if (j % 4 == 0 || j % 4 == 1)
						count++;
				}
			} else {
				for (int j = 0; j < col; j++) {
					if (j % 4 == 2 || j % 4 == 3)
						count++;
				}
			}

		}
		System.out.println(count);
	}
}
