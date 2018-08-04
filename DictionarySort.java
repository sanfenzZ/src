package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��24��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * ��������n��m, ��1��n����n���������ֵ�������֮��, �����еĵ�m������
 * ��������:
 * �����������������n��m��
 * ���ݷ�Χ: 
 * ����20%������, 1 <= m <= n <= 5 ; 
 * ����80%������, 1 <= m <= n <= 10^7 ; 
 * ����100%������, 1 <= m <= n <= 10^18.
 * �������:
 * ���������һ��, �����������еĵ�m������.

 * ʾ��1
 * ����
 * 11 4
 * ���
 * 2
	
 */
public class DictionarySort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
	
		long i = 1;
		m--;
		while(m != 0){
			
			long num = 0;
			long start = i,end = i+1;
			while(start <= n){
				num += Math.min(n+1,end)-start;
				start *= 10;
				end *= 10;
				//System.out.println(start);
			}
			if(num>m){
				i *= 10;
				m--;
			}else{
				m -= num;
				i++;
			}
		}
	
	
	System.out.println(i);
	
	}
}