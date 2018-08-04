package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��26��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * n ֻ��ţ����һ�ţ�ÿ����ţӵ�� ai ��ƻ����������Ҫ������֮��ת��ƻ����ʹ�����������ţӵ�е�ƻ��������ͬ��
 * ÿһ�Σ���ֻ�ܴ�һֻ��ţ��������ǡ������ƻ������һ����ţ�ϣ�
 * ��������Ҫ�ƶ����ٴο���ƽ��ƻ�������������������� -1��
 * ��������:
 * ÿ���������һ������������ÿ�����������ĵ�һ�а���һ������ n��1 <= n <= 100������������һ�а��� n ������ ai��1 <= ai <= 100����
 * �������:
 * ���һ�б�ʾ������Ҫ�ƶ����ٴο���ƽ��ƻ���������������������� -1��

 * ʾ��1
 * ����
 * 4
 * 7 15 9 5
 * ���
 * 3
 */
public class CowShareApples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] apples = new int[n];
		for(int i=0;i<n;i++)
			apples[i] = sc.nextInt();
		System.out.println(share(apples));
		
	}

	private static int share(int[] arr) {
		int len = arr.length;
		int sum = 0;
		int result = 0;
		
		for(int i=0;i<len;i++)
			sum += arr[i];
		if(sum%len != 0 || len < 1)
			return -1;
		int average = sum / len;
		for(int i=0;i<len;i++){
			if(Math.abs(arr[i]-average) %2 != 0)
				return -1;
			result += (Math.abs(arr[i]-average) /2);
		}
		
		return result/2;
	}
}
