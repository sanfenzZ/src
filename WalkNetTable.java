package src;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��6��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * ��һ��X*Y������С��Ҫ�ڴ������ϴ����Ͻǵ����½ǣ�ֻ���߸����ֻ�����һ������ߡ�
 * �����һ���㷨������С���ж������߷�����������������int x,int y���뷵��С�ŵ��߷���Ŀ��
 * ��������:
 * �������һ�У����Ÿ���������������x��y��ȡֵ��Χ[1,10]��
 * �������:
 * �������һ�У�Ϊ�߷�����Ŀ��
 * ʾ��1
 * ����
 * 3 2
 * ���
 * 10
 */
public class WalkNetTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println(dd(i,j));
		
		/*int[][] f = new int[11][11];
		for(int m = 0;m<=i;m++)
			f[m][0] = 1;
		for(int n = 0;n<=j;n++)
			f[0][n] = 1;
		for(int m =1;m<=i;m++)
			for(int n=1;n<=j;n++)
				f[m][n] = f[m-1][n]+f[m][n-1];
		System.out.println(f[i][j]);*/
	}
	private static int dd(int i,int j){
		if(i == 0|| j== 0)
			return 1;
		return dd(i-1,j)+dd(i,j-1);	
	}
}
