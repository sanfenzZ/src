package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��23��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * ������һ�����飬��ֵΪ��1��10000���������������֡�����ĳ��żȻ������������������ж�ʧ��ĳ����Ԫ�أ�ͬʱ˳�򱻴��ң�
 * ������Ҫ�������ķ����ҳ���ʧ��������Ԫ�أ����ҽ�������Ԫ�ظ��ݴ�С��������ƴ��Ϊһ�������֣����������7��������
 *  ������ʧ��Ԫ��Ϊ336��10��8435���õ���������Ϊ103368435�������ߵ�����Ϊ2��
 * ��������:
 * ��������Ϊһ�У�����9997�����֣��ո������
 * �������:
 * ���Ϊһ�У�����һ�����֡�

 */
public class LastThreeNum {

	static int[] num = new int[10001];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<9997;i++){
			int j = sc.nextInt();
			num[j] = 1;
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<10001;i++){
			if(num[i] == 0)
				sb.append(i);
		}
		long bi = Long.parseLong(sb.toString());
		System.out.print(bi%7);
	}

}
