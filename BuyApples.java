package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018年6月20日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 小易去附近的商店买苹果，奸诈的商贩使用了捆绑交易，只提供6个每袋和8个每袋的包装(包装不可拆分)。
 *  可是小易现在只想购买恰好n个苹果，小易想购买尽量少的袋数方便携带。
 *  如果不能购买恰好n个苹果，小易将不会购买。
 * 输入描述:
 * 输入一个整数n，表示小易想购买n(1 ≤ n ≤ 100)个苹果
 * 输出描述:
 * 输出一个整数表示最少需要购买的袋数，如果不能买恰好n个苹果则输出-1

 * 示例1
 * 输入
 * 20
 * 输出
 * 3
 * 
 * 思路：
 * 使用递归，设置三个参数，第一个是要购买的苹果数目，第二个是6个袋的个数，第三个是8个袋的个数
 */
public class BuyApples {
	static int num = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		System.out.print(buyapple(count));
	}
	
	public static int buyapple(int count){
		if(count < 6 || count%2 == 1 || count == 10)
			return -1;
		if(count % 8 == 0)
			return count/8;
		return 1+count/8;
	}	
}
