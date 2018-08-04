package src;

import java.text.DecimalFormat;
import java.util.*;
import java.io.*;
import java.math.BigDecimal;
public class Changer {
		/*要求：
		 * 随机产生10个正整数列，求出所有递增递减子序列的数目
		 * 
		 * 思路：
		 * 建立一个数组，将正实数数列填入
		 * 选择两个挨着的数，比较大小，比较的结果有大和小两种
		 * 大的情况下，设计函数NumBig()将比较的数放入新建的【二维数组】中
		 * 在让后面的数比较，如果大于之前的数，就放入数组中，小的话跳出函数
		 * 小的情况类似大的；
		 * **两种情况使用的二维数组可以放在一起，
		 * 然后实现输出
		 */
	static int arrnum = 0;//标识数组num中走到哪个位置，使数据不重复计算
	static int childarr = 0;//标识子序列的个数
	static  int first = 0;//全局变量first标记数值添加到二维数组前一个[]的位置
	static int nine = 0;//数组到num[9]不好比较，用nine的值确定是否添加，没有的话，在主函数中添加
	static float[] num = new float[11];//数组num实现将十个随机正实数填入数组中
	static float[][] num1 = new float[11][20];//数组num1将比较后的数字放进数组中，实现输出
	
	public static void main(String[] args) throws Exception{
		for(int i = 0;i < 10;i++){
			double f = (1+(Math.random()*10));
			int d = (int)(100*f); 
			num[i] = (float) (0.01*d);
		}
		System.out.println("生成的随机正实数是：");
		for(int i = 0;i<10;i++){
			
			System.out.print(num[i]+",");
		}
		System.out.println();
		System.out.println("排序后的递增、递减如下：");
		
			for(;arrnum < 10;arrnum++){
			if(num[arrnum] > num[arrnum+1])//后一个数比前一个数小
				NumSmall(arrnum);
			if(num[arrnum] < num[arrnum+1])//后一个数比前一个数大
				NumBig(arrnum);
		}
			PrintNum1(num1);//输出子序列
			System.out.println();
		System.out.println("共有"+childarr+"个子序列。");
		
	}
	public static void NumBig(int n){//比较num[n]后面的数是否比它大，是填入前[]相同数组中，否跳出
		int i = 0;
		while(n < 9 && num[n] < num[n+1]){//n=9的时候，num[n]指向第十个数，不能再累加
			num1[first][i++] = num[n];//&&&&添加数值到数组的先后顺序  **全局变量》》》 
			n++;
			arrnum++;
	}
		num1[first][i++] = num[n];//////////////////////////////
		arrnum--;//实现数据计算完递减，再尝试递增
		first++;
}
	public static void NumSmall(int n){//和大的大体一致
		int i = 0;
		while(n < 9 && num[n] > num[n+1]){
			num1[first][i++] = num[n];
			n++;
			arrnum++;
	}
		num1[first][i++] = num[n];//////////////////////////////
		first++;
}
	public static void PrintNum1(float[][] num){//将二维数组有条件输出
		int i = 0;int j = 0;
		for(i = 0;i<10;i++){
			childarr++;
			System.out.print("(");
			for(j = 0;j<10;j++){
				if(num[i][0] == 0)//如果某个二维数组第一个就是0.0，就不进行子序列计数
					childarr--;
				if(num[i][j] == 0){
					break;
				}
			System.out.print(num[i][j]+",");
			}
			System.out.print("),");
			//System.out.println();
		}
	}
	
}