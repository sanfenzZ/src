package str;

import org.omg.PortableInterceptor.INACTIVE;
import java.util.*;
import java.io.*;
import java.math.*;
/**
 * @author me
 * @date 2018年6月11日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 输入两个整数 n 和 m，从数列1，2，3.......n 中随意取几个数,使其和等于 m ,要求将其中所有的可能组合列出来
 * 输入描述:
 * 每个测试输入包含2个整数,n和m
 * 输出描述:
 * 按每个组合的字典序排列输出,每行输出一种组合

 * 输入
 * 5 5
 * 输出
 * 1 4
 * 2 3
 * 5
 */
public class OneToNAdd {
	 public static int n = 0;
	    public static int m = 0;
	    public static Vector<Integer> vector = new Vector<>();
	    public static void main(String[] args) throws Exception{
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        String[] data = bufferedReader.readLine().split(" ");
	        n = Integer.parseInt(data[0]);
	        m = Integer.parseInt(data[1]);
	        add(1, 0);
	}
	public static void add(int index, int sum) {
		if(sum>m)
			return ;
		if(sum == m){
			for(int i=0;i<vector.size();i++){
				if(i!=0)
					System.out.print(" ");
			System.out.print(vector.get(i));
			}
		}
		for(int i=index;i<n;i++){
			vector.add(i);
			add(index+1,sum+i);
			vector.remove(vector.size()-1);
		}
	}
	
}
