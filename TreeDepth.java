package tree;

import java.util.Scanner;

/**
 * @author me
 * @date 2018年5月16日  
 * @version 1.0.0 
 * 
 * 输入描述:
* 输入的第一行表示节点的个数n（1 ≤ n ≤ 1000，节点的编号为0到n-1）组成，
* 下面是n-1行，每行有两个整数，第一个数表示父节点的编号，第二个数表示子节点的编号
 */
public class TreeDepth {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 3){
			System.out.println(n);
		}else{
			int[] height = new int[n];
			int[] binary = new int[n];//记录父节点只能记录两个子节点
			height[0] = 1;//默认存在根节点
			int max = 0;
			for(int i=0;i<n-1;i++){
				int parent = sc.nextInt();
				int child = sc.nextInt();
				binary[parent] += 1;
				if(binary[parent] < 3){
					height[child] = height[parent]+1;//这个子节点的高度等于父节点的高度+1
				}
				max = Math.max(max, height[child]);
			}
		System.out.println(max);
		
		}
	}
}
