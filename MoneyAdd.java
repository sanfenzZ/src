package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��5��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * �����������1��5��10��20��50��100Ԫ��ֽ�ң�����ÿ�ֱ�ֵ���������㹻�࣬��д���������NԱ��NΪ0-10000�ķǸ��������Ĳ�ͬ��ϵĸ�����
 * ��������:
 * ����Ϊһ������N������Ҫƴ�յ����
 * �������:
 * ���Ҳ��һ�����֣�Ϊ���N����ϸ�����

 * ����
 * 5
 * ���
 * 2
 *https://www.nowcoder.com/questionTerminal/14cf13771cd840849a402b848b5c1c93
 */
public class MoneyAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int num = sc.nextInt();
			long[] arr = new long[num+1];  // ����������ݵ�����
			int[] mon = {1,5,10,20,50,100};// ���������������
			for(int i=0;i<=num;i++)        // �߽�����A(n,1) = 1 (n>=0)
				arr[i] = 1;
			for(int i=1;i<6;i++)           // ��������5��ʼ����Ϊ1Ԫ����������ʼ��ʱ�Ѿ�д����
				for(int j=1;j<arr.length;j++)// n��1��ʼ����֤�˱߽�����A(0,m)=1 (m=1,5,10,20,50,100)
					if(j >= mon[i])
						arr[j] += arr[j-mon[i]];// ״̬ת�Ʒ���
			System.out.println(arr[num]);
		}
	}
}
