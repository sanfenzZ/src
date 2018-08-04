	package str;
	
	import java.util.Scanner;
	
	/**
	 * @author me
	 * @date 2018年6月16日  
	 * @version 1.0.0 
	 * 
	 * 题目描述
	 * 输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2
	 * 输入描述:
	 * 输入为一行，n(1 ≤ n ≤ 1000)
	 * 输出描述:
	 * 输出一个整数,即题目所求
	
	 * 输入
	 * 10
	 * 输出
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
