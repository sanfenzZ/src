package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��5��31��  
 * @version 1.0.0 
 * ��Ŀ����
 * �Ƶ귿��ļ۸�¼����ͨ��ʱ�����¼��ģ�����10��1����10��7��800Ԫ��10��8����10��20��500Ԫ��
 * ��ʵ�����º���int[][] merge(int[][] dateRangePrices)��
 * ������ĳ���Ƶ������ڶεļ۸�ÿ�����ڶΣ���ֹ���ڴ��ڵ�����ʼ���ڣ��Ͷ�Ӧ�ļ۸�ʹ�ó���Ϊ3����������ʾ��
 * ����[0, 19, 300], [10, 40, 250]�ֱ��ʾ��ĳ�쿪ʼ��1�쵽��20��۸���300����11�쵽��41��۸���250��
 * ��Щ���ڶ��п����ظ����ظ������ڵļ۸��Ժ����Ϊ׼�� �������¹���ϲ�������ϲ������
 * 1.��������ļ۸������ͬ����ô���������ڶ�Ӧ�úϲ�
 * 2.�ϲ��Ľ��Ӧ������ʼ���ڴ�С��������
 * ��������:
 * �������ݰ������У�������������ʾ��
 * �������:
 * �������Ϊһ�У������������ʾ
 * ʾ��1
 * ����
 * 1 1 100
 * 2 3 100
 * 4 5 110
 * ���
 * [1, 3, 100],[4, 5, 110]
 */
public class Hotel {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int[] price = new int[10001];
			int min = Integer.MAX_VALUE;int max = Integer.MIN_VALUE;
			while(sc.hasNextInt()){
				int b = sc.nextInt();int e = sc.nextInt();int p =sc.nextInt();
				for(int i=b;i<=e;++i){
					price[i] = p; 
				}
				if(b<min)
					min = b;
				if(e>max)
					max = e;
			}
			
			System.out.print("["+min+", ");
			for(int i=min+1,pre = price[min];i<max;++i){//�Ƚ�ǰһ�����ǰ��ļ۸������һ����˵������һ�����ֵ�
				int cur = price[i];
				if(cur != pre){
					if(pre != 0)                        //ǰһ���㲻Ϊ0��˵��ǰһ������һ���ұ�����
						System.out.print(i-1+", "+pre+"],");
					if(cur != 0)                        //��ǰ�㲻Ϊ0��˵����ǰ����һ���������
						System.out.print("["+i+", ");
				}
				pre = cur;
				
			}
			System.out.println(max+", "+price[max]+"]");
		}
	}


}
