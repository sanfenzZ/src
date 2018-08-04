		package str;
		
		import java.util.Arrays;
		import java.util.Scanner;
		
		/**
		 * @author me
		 * @date 2018��6��19��  
		 * @version 1.0.0 
		 * 
		 * ��Ŀ����
		 * С����������һ��������Ϸ��С�׸���һϵ�е�������
		 * ������ʹ����Щ��������Ϸ��ÿ��С�׻�����˵һ�����ֳ�����Ȼ������Ҫ����һϵ��������ѡȡһ���ֳ��������ǵĺ͵���С����˵�����֡�
		 * ���磺 ���{2,1,2,7}�����е�һϵ������С��˵��������11.����Եõ�����2+2+7 = 11.
		 * �����Ƥ��С������㣬��˵��������6����ô��û�а취ƴ�ճ���Ϊ6 
		 * ����С�׸���n�����������ҳ��޷���n������ѡȡ������͵������е���С����
		 * ��������:
		 * �����һ��Ϊ���ָ���n (n �� 20)
		 * �ڶ���Ϊn����xi (1 �� xi �� 100000)
		 * �������:
		 * �����С������n����ѡȡ�����ɵ���
		
		 * ����
		 * 3
		 * 5 1 2
		 * ���
		 * 4
		 */
		public class MinOfNumber {
		
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				int num = sc.nextInt();
				int[] numarr = new int[num];
				for(int i=0;i<num;i++)
					numarr[i] = sc.nextInt();
				Arrays.sort(numarr);
				
				System.out.print(check(numarr));
			}
			private static int check(int[] arr){
				if(arr[0] > 1){
					return 1;
				}if(arr.length == 1){
					return arr[0]+1;
				}else{
					int sum = arr[0];
					for(int i=1;i<arr.length;i++){
						if(arr[i] - sum > 1)
							break;
						else
							sum += arr[i];
					}
					return sum+1;
					}
			}
		}
