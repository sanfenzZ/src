	package str;
	
	import java.util.Scanner;
	
	/**
	 * @author me
	 * @date 2018��6��16��  
	 * @version 1.0.0 
	 * 
	 * ��Ŀ����
	 * ����һ��������n,��n!(���׳�)ĩβ�ж��ٸ�0�� ����: n = 10; n! = 3628800,���Դ�Ϊ2
	 * ��������:
	 * ����Ϊһ�У�n(1 �� n �� 1000)
	 * �������:
	 * ���һ������,����Ŀ����
	
	 * ����
	 * 10
	 * ���
	 * 2
	 */
	public class ZeroNumber {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			System.out.println(Number(num));
		}
	
		/**
		 * @param num
		 */
		private static int Number(int num) {
			int count = 0;
			while(num/5 != 0){
				num = num/ 5;
				count += num;
			}
			return count;
		}
	}
