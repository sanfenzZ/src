		package str;
		
		import java.util.Arrays;
		import java.util.Scanner;
		
		/**
		 * @author me
		 * @date 2018年6月19日  
		 * @version 1.0.0 
		 * 
		 * 题目描述
		 * 小易邀请你玩一个数字游戏，小易给你一系列的整数。
		 * 你们俩使用这些整数玩游戏。每次小易会任意说一个数字出来，然后你需要从这一系列数字中选取一部分出来让它们的和等于小易所说的数字。
		 * 例如： 如果{2,1,2,7}是你有的一系列数，小易说的数字是11.你可以得到方案2+2+7 = 11.
		 * 如果顽皮的小易想坑你，他说的数字是6，那么你没有办法拼凑出和为6 
		 * 现在小易给你n个数，让你找出无法从n个数中选取部分求和的数字中的最小数。
		 * 输入描述:
		 * 输入第一行为数字个数n (n ≤ 20)
		 * 第二行为n个数xi (1 ≤ xi ≤ 100000)
		 * 输出描述:
		 * 输出最小不能由n个数选取求和组成的数
		
		 * 输入
		 * 3
		 * 5 1 2
		 * 输出
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
