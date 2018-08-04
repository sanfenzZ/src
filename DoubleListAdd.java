package str;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author me
 * @date 2018年6月9日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 给你两个集合，要求{A} + {B}。 注：同一个集合中不会有两个相同的元素。
 * 输入描述:
 * 每组输入数据分为三行,第一行有两个数字n,m(0 ≤ n,m ≤ 10000)，分别表示集合A和集合B的元素个数。
 * 后两行分别表示集合A和集合B。每个元素为不超过int范围的整数,每个元素之间有个空格隔开。
 * 输出描述:
 * 针对每组数据输出一行数据，表示合并后的集合，要求从小到大输出，每个元素之间有一个空格隔开,行末无空格。

 * 输入
 * 3 3
 * 1 3 5
 * 2 4 6
 * 输出
 * 1 2 3 4 5 6
 * 
 * 思路：
 * 用两个数组记录两行集合，建立一个函数用来两个数组排序，再输出数组
 */
public class DoubleListAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len1 = sc.nextInt();
		int len2 = sc.nextInt();
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		for(int i=0;i<len1+len2;i++)
			tree.add(sc.nextInt());
		Iterator<Integer> it = tree.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
			if(it.hasNext())
				System.out.print(" ");
		}
	}
}
