package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��7��15��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * �����������һ��Ӷ��־��ܵ��������������������Ҫ�����ڷ���ͽ���Ĺ��̣�
 * ��ѧ�Ҹ���ʵ�����ݹ��ƣ�����ڷ�������У������� x �̶ȵ���ģ���ô�ڽ���Ĺ����оͻ���� x2 �̶ȵ���ģ�
 * ����ɴ�������ĳ����������;öȣ��������ͻᱬը׹�١���һ���;ö�Ϊ h �ķ������������ڷ��й����в�������ģ�
 * ��ôΪ�˱�֤����԰�ȫ�ĵ���Ŀ�ĵأ�ֻ���������⣬���෢������п��Գ��ܶ��ٳ̶ȵ���ģ�
 * ��������:
 * ÿ���������һ������������ÿ��������������һ��һ������ h ��1 <= h <= 10^18����
 * �������:
 * ���һ��һ��������ʾ�����

 * ʾ��1
 * ����
 * 10
 * ���
 * 2
 */
public class SpaceFlight {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		
		long numsqrt = (long) Math.sqrt(num);
		if(numsqrt*(numsqrt+1) > num)
				System.out.println(numsqrt-1);
		else
			System.out.println(numsqrt);
	}
}
