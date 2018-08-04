	package src;
	
	import java.util.Scanner;
	
	/**
	 * @author me
	 * @date 2018年6月13日  
	 * @version 1.0.0 
	 * 
	 * 题目描述
	 * 将一句话的单词进行倒置，标点不倒置。比如 I like beijing. 经过函数后变为：beijing. like I
	 * 输入描述:
	 * 每个测试输入包含1个测试用例： I like beijing. 输入用例长度不超过100
	 * 输出描述:
	 * 依次输出倒置之后的字符串,以空格分割
	
	 * 输入
	 * I like beijing.
	 * 输出
	 * beijing. like I
	 */
	public class ReversalString {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			String[] arrstr = str.split(" ");
			String result = "";
			for(int i=arrstr.length-1;i>=0;i--){
				result += arrstr[i];
				if(i != 0)
					result += " ";
			}
			System.out.print(result);
		}
		
	
	}
