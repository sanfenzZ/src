package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��8��  
 * @version 1.0.0 
 * 
 * һ����A�����2��A-1���Ʊ��ʱ������λ��֮�͵ľ�ֵ�Ƕ��٣���ϣ�����ܰ������������⣿ 
 * ���еļ��������ʮ���ƽ��У����Ҳ��ʮ���Ʊ�ʾΪ����Լ��ķ�����ʽ��
 * ��������:
 * �������ж���������ݣ�ÿ���������Ϊһ������A(1 �� A �� 5000).
 * �������:
 * ��ÿ��������ݣ��ڵ�����������X/Y����ʽ��������

 * ����
 * 5
 * 3
 * ���
 * 7/3
 * 2/1
 * https://www.nowcoder.com/questionTerminal/215881ffac304a52812eff45aea8330d
 */
public class SystemAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int num = sc.nextInt();
			NumSystem(num);
		}
		
	}
	public static void NumSystem(int n){
		int sum = 0;
		int kind = n-2;
		for (int i = 2; i < n; i++) {
			sum += jzh(n,i);
		}
		int con = gys(sum,kind);
		System.out.println(sum/con+"/"+kind/con);
	}
	private static int jzh(int n, int i) {//һ�����ְ���ͬ���Ƶĸ���λ�Ӻ�
		int res = 0;
		while(n != 0){
			res += n%i;
			n = n/i;
		}
		return res;
	}
	private static int gys(int a,int b){//���Լ��
		while(a % b != 0){
			int c= a%b;
			a = b;
			b = c;
		}
		return b;
	}
}
