package str;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author me
 * @date 2018年7月1日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 一个袋子里面有n个球，每个球上面都有一个号码(拥有相同号码的球是无区别的)。如果一个袋子是幸运的当且仅当所有球的号码的和大于所有球的号码的积。
 * 例如：如果袋子里面的球的号码是{1, 1, 2, 3}，这个袋子就是幸运的，因为1 + 1 + 2 + 3 > 1 * 1 * 2 * 3
 * 你可以适当从袋子里移除一些球(可以移除0个,但是别移除完)，要使移除后的袋子是幸运的。现在让你编程计算一下你可以获得的多少种不同的幸运的袋子。
 * 输入描述:
 * 第一行输入一个正整数n(n ≤ 1000)
 * 第二行为n个数正整数xi(xi ≤ 1000)
 * 输出描述:
 * 输出可以产生的幸运的袋子数

 * 示例1
 * 输入
 * 3
 * 1 1 1
 * 输出
 * 2
 */
public class LuckyPackage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int result = 0;
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		System.out.println(Lucky(arr,0,0,1));
	}
	public static int Lucky(int[] arr,int index,int sum,int pro){
		int count = 0;
		for(int i=index;i<arr.length;i++){
			sum += arr[i];
			pro *= arr[i];
		if(sum > pro){
			count = count+1+Lucky(arr,i+1,sum,pro);
		}else if(arr[i] == 1){
			//处理待判断的序列第一个数为1的时候，
            //那个1虽然不满足和大于积，但是要保留，继续往下考虑
			count = count + Lucky(arr,i+1,sum,pro);
		}else
			break;
		
		sum -= arr[i];
		pro /= arr[i];
		for(;i<arr.length-1 && arr[i]==arr[i+1];i++){
		//    i++;            //拥有相同号码的球是无区别的，因此跳过
		}
	}
	return count;
	}
}
