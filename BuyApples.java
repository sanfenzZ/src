package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��20��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * С��ȥ�������̵���ƻ������թ���̷�ʹ���������ף�ֻ�ṩ6��ÿ����8��ÿ���İ�װ(��װ���ɲ��)��
 *  ����С������ֻ�빺��ǡ��n��ƻ����С���빺�����ٵĴ�������Я����
 *  ������ܹ���ǡ��n��ƻ����С�׽����Ṻ��
 * ��������:
 * ����һ������n����ʾС���빺��n(1 �� n �� 100)��ƻ��
 * �������:
 * ���һ��������ʾ������Ҫ����Ĵ��������������ǡ��n��ƻ�������-1

 * ʾ��1
 * ����
 * 20
 * ���
 * 3
 * 
 * ˼·��
 * ʹ�õݹ飬����������������һ����Ҫ�����ƻ����Ŀ���ڶ�����6�����ĸ�������������8�����ĸ���
 */
public class BuyApples {
	static int num = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		System.out.print(buyapple(count));
	}
	
	public static int buyapple(int count){
		if(count < 6 || count%2 == 1 || count == 10)
			return -1;
		if(count % 8 == 0)
			return count/8;
		return 1+count/8;
	}	
}
