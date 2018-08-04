package str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author me
 * @date 2018年7月13日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 有 n 个学生站成一排，每个学生有一个能力值，牛牛想从这 n 个学生中按照顺序选取 k 名学生
 * 要求相邻两个学生的位置编号的差不超过 d，使得这 k 个学生的能力值的乘积最大，
 * 你能返回最大的乘积吗？
 * 输入描述:
 * 每个输入包含 1 个测试用例。每个测试数据的第一行包含一个整数 n (1 <= n <= 50)，表示学生的个数，
 * 接下来的一行，包含 n 个整数，按顺序表示每个学生的能力值 ai（-50 <= ai <= 50）。
 * 接下来的一行包含两个整数，k 和 d (1 <= k <= 10, 1 <= d <= 50)。
 * 输出描述:
 * 输出一行表示最大的乘积。

 * 示例1
 * 输入
 * 3
 * 7 4 7
 * 2 50
 * 输出
 * 49
 * https://www.nowcoder.com/questionTerminal/661c49118ca241909add3a11c96408c8
 */
public class SingTeam {
	public static void main(String[] args) throws IOException {
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			int[] arr = new int[n+1];
			for(int i=1;i<=n;i++)
				arr[i] = sc.nextInt();
			int kk = sc.nextInt();
			int dd = sc.nextInt();
			
			long[][] f = new long[n+1][kk+1];
			long[][] g = new long[n+1][kk+1];
			for(int one = 1;one<=n;one++){
				f[one][1] = arr[one];
				g[one][1] = arr[one];
			}
		
			
			for(int k=2;k<=kk;k++){
				for(int one = k;one<=n;one++){
					long tempmax = Long.MIN_VALUE;
					long tempmin = Long.MAX_VALUE;
					
					for(int left = Math.max(k-1,one-dd);left<=one-1;left++){
						if(tempmin > Math.min(f[left][k-1]*arr[one], g[left][k-1]*arr[one]))
							tempmin = Math.min(f[left][k-1]*arr[one], g[left][k-1]*arr[one]);
						
						if(tempmax < Math.max(f[left][k-1]*arr[one], g[left][k-1]*arr[one]))
							tempmax  = Math.max(f[left][k-1]*arr[one], g[left][k-1]*arr[one]);
					
					}
					f[one][k] = tempmax;
					g[one][k] = tempmin;
				}
			}
			
			long result = Long.MIN_VALUE;
			for(int one = kk;one<=n;one++){
				if(result < f[one][kk])
					result = f[one][kk];
			}
			
			System.out.println(result);
		}
	
	
	}
	
}
