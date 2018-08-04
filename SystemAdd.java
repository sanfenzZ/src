package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018年6月8日  
 * @version 1.0.0 
 * 
 * 一个数A如果按2到A-1进制表达时，各个位数之和的均值是多少？她希望你能帮她解决这个问题？ 
 * 所有的计算均基于十进制进行，结果也用十进制表示为不可约简的分数形式。
 * 输入描述:
 * 输入中有多组测试数据，每组测试数据为一个整数A(1 ≤ A ≤ 5000).
 * 输出描述:
 * 对每组测试数据，在单独的行中以X/Y的形式输出结果。

 * 输入
 * 5
 * 3
 * 输出
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
	private static int jzh(int n, int i) {//一个数字按不同进制的各个位加和
		int res = 0;
		while(n != 0){
			res += n%i;
			n = n/i;
		}
		return res;
	}
	private static int gys(int a,int b){//最大公约数
		while(a % b != 0){
			int c= a%b;
			a = b;
			b = c;
		}
		return b;
	}
}
