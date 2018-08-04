package tree;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��5��16��  
 * @version 1.0.0 
 * 
 * ��������:
* ����ĵ�һ�б�ʾ�ڵ�ĸ���n��1 �� n �� 1000���ڵ�ı��Ϊ0��n-1����ɣ�
* ������n-1�У�ÿ����������������һ������ʾ���ڵ�ı�ţ��ڶ�������ʾ�ӽڵ�ı��
 */
public class TreeDepth {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 3){
			System.out.println(n);
		}else{
			int[] height = new int[n];
			int[] binary = new int[n];//��¼���ڵ�ֻ�ܼ�¼�����ӽڵ�
			height[0] = 1;//Ĭ�ϴ��ڸ��ڵ�
			int max = 0;
			for(int i=0;i<n-1;i++){
				int parent = sc.nextInt();
				int child = sc.nextInt();
				binary[parent] += 1;
				if(binary[parent] < 3){
					height[child] = height[parent]+1;//����ӽڵ�ĸ߶ȵ��ڸ��ڵ�ĸ߶�+1
				}
				max = Math.max(max, height[child]);
			}
		System.out.println(max);
		
		}
	}
}
