package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��7��15��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * Fibonacci��������������ģ�
 * F[0] = 0
 * F[1] = 1
 * for each i �� 2: F[i] = F[i-1] + F[i-2]
 * ��ˣ�Fibonacci���о����磺0, 1, 1, 2, 3, 5, 8, 13, ...����Fibonacci�����е������ǳ�ΪFibonacci����
 * ����һ��N�����������Ϊһ��Fibonacci����ÿһ������԰ѵ�ǰ����X��ΪX-1����X+1�����ڸ���һ����N��������Ҫ���ٲ����Ա�ΪFibonacci����
 * ��������:
 * ����Ϊһ��������N(1 �� N �� 1,000,000)
 * �������:
 * ���һ����С�Ĳ�����ΪFibonacci��"

 * ʾ��1
 * ����
 * 15
 * ���
 * 2
 */
public class FibonacciArr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0,b=1;
		
		while(b <= n){
			int sum = a+b;
			a = b;
			b = sum;
		}
		
		//System.out.println("a:"+a+"b:"+b);
		System.out.println((b-n)>(n-a)?n-a:b-n);
	}
}
