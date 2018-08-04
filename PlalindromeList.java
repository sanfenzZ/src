package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��7��15��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * ���һ��������������֮���ԭ������һ���ľͳ���������������Ϊ�������С����磺
 * {1, 2, 1}, {15, 78, 78, 15} , {112} �ǻ�������, 
 * {1, 2, 2}, {15, 78, 87, 51} ,{112, 2, 11} ���ǻ������С�
 * ���ڸ���һ���������У�����ʹ��һ��ת��������
 * ѡ�������������ڵ�����Ȼ��������Ƴ������������������������ֵĺͲ��뵽��������֮ǰ��λ��(ֻ����һ����)��
 * ���ڶ�����������Ҫ���������Ҫ���ٴβ������Խ����ɻ������С�
 * ��������:
 * ����Ϊ���У���һ��Ϊ���г���n ( 1 �� n �� 50) �ڶ���Ϊ�����е�n������item[i] (1 �� iteam[i] �� 1000)���Կո�ָ���
 * �������:
 * ���һ��������ʾ������Ҫ��ת������

 * ʾ��1
 * ����
 * 4 1 1 1 3
 * ���
 * 2
 * 
 * ˼·��
 * ��ͷβ���жԱȣ���ͬ�����ڽ�һλ�Ƚϣ���ͬ�Ͱѽ�С������ǰһ��������ӣ��Ƚ�
 */
public class PlalindromeList {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			for(int i=0;i<n;i++)
				arr[i] = sc.nextInt();
			
			int result = 0;
			int end = n-1;
			int half = n/2;
			int start = 0;
			while(start < end){
				if(arr[start] > arr[end]){
					arr[end-1] += arr[end];
					end--;
					result++;
				}else if(arr[start] < arr[end]){
					arr[start+1] += arr[start];
					start++;
					result++;
				}else{
						start++;
						end--;
				}
			}
				
			System.out.println(result);
				
		}
	}
}
