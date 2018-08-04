package src;

import java.util.ArrayList;
import java.util.List;

/*
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 
 * 思路：循环，得到数字，遍历计算数字的出现数，时间复杂度是N*N，先消除相同的查找
 */
public class MoreThanHalfNum_Solution {
	public static int MoreThanHalfNum(int[] array){
		if(array.length == 0)
			return 0;
		List<Integer> list = new ArrayList<>();
		int halfLen = (array.length)/2;
		int num = 0;
		for(int i=0;i<array.length;i++){
			int count = 0;
			
			for(int j=0;j<array.length;j++){
				if(array[i] == array[j]){
					count++;System.out.println(array[i]+": count:"+count);
				}
			}
			if(count > halfLen)
				num = array[i];
		}
	return num;
	}
	public static void main(String[] args){
		int[] a = {1,2,3,2,2,2,5,4,2};//{4,2,1,4,2,4};
		System.out.println(MoreThanHalfNum(a)+"fff");
	}
}
