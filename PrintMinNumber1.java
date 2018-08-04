package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * ��Ŀ����
 * ����һ�����������飬����������������ƴ�������ų�һ��������ӡ��ƴ�ӳ���������������С��һ����
 * ������������{3��32��321}�����ӡ���������������ųɵ���С����Ϊ321323��
 */
public class PrintMinNumber1 {
	public String PrintMinNumber(int[] numbers) {
		String result = "";
		ArrayList<Integer> list = new ArrayList<>();
		int len = numbers.length;
		for(int i=0;i<len;i++)
			list.add(numbers[i]);
		Collections.sort(list,new Comparator<Integer>(){
			public int compare(Integer str1,Integer str2){
				String s1 = str1+""+str2;
				String s2 = str2+""+str1;
				return s1.compareTo(s2);
			}
		});
		for(int j:list)
			result += j;
		
		return result;
	}

	public static void main(String[] args) {
		PrintMinNumber1 p = new PrintMinNumber1();
		int n[] = { 3,32,321 };
		String s = p.PrintMinNumber(n);
		System.out.println(s);
	}
}
