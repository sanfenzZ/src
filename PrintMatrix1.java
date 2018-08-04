package src;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 题目描述
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class PrintMatrix1 {
	public ArrayList<Integer> printMatrix(int[][] array) {
		ArrayList<Integer> list = new ArrayList<>();
		if (array.length < 1)
			return list;
		int n = array.length;
		int m = array[0].length;
		if(m == 0)return list;
		int layers = (Math.min(n, m)-1) / 2 + 1;
		for (int i = 0; i < layers; i++) {
			for (int k = i; k < m - i; k++)
				list.add(array[i][k]);
			for (int j = i + 1; j < n - i; j++)
				list.add(array[j][m - 1 - i]);
			for (int k = m - i - 2; (k >= i) && (n - i - 1 != i); k--)
				list.add(array[n - i - 1][k]);
			for (int j = n - i - 2; (j > i) && (m - i - 1 != i); j--)
				list.add(array[j][i]);
		}

		return list;
	}
	public static void main(String[] args){
		PrintMatrix1 p = new PrintMatrix1();
		int a[][]={{1,2},{3,4},{5,6},{7,8},{9,10}};
		ArrayList l = p.printMatrix(a);
		Iterator<Integer> it = l.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}
