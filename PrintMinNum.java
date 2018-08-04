package lab03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

/*
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class PrintMinNum {
	public static int GetUglyNumber(int index) {
		if(index <= 0)
			return 0;
		int[] result = new int[index];
		int count = 0;
		int t2 = 0;
		int t3 = 0;
		int t5 = 0;
		
		result[0] = 1;
		int tmp = 0;
		while(count < index-1){
			tmp = min(result[t2]*2,min(result[t3]*3,result[t5]*5));
			if(tmp == result[t2]*2) t2++;
			if(tmp == result[t3]*3) t3++;
			if(tmp == result[t5]*5) t5++;
			result[++count] = tmp;
		}
		return result[index-1];
	}
	private static int min(int i, int j) {
		return i>j?j:i;
	}
	public static void main(String[] args){
		int a[]={1,2,23,3,2,2,6};
		System.out.println(GetUglyNumber(4));
	}
}
/*

list.add(1);
for(int i=2;i <= index;i++){
	int size = list.size()-1;
	int num = list.get(size);
	if(!list.contains(num*2)){
		list.add(num*2);
	}
	if(!list.contains(num*3)){
		list.add(num*3);
	}
	if(!list.contains(num*5)){
		list.add(num*5);
	}
	Collections.sort(list);
}

return list.get(index-1);
*/