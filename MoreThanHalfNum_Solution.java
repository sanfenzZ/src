package src;

import java.util.ArrayList;
import java.util.List;

/*
 * ��������һ�����ֳ��ֵĴ����������鳤�ȵ�һ�룬���ҳ�������֡�
 * ��������һ������Ϊ9������{1,2,3,2,2,2,5,4,2}��
 * ��������2�������г�����5�Σ��������鳤�ȵ�һ�룬������2����������������0��
 * 
 * ˼·��ѭ�����õ����֣������������ֵĳ�������ʱ�临�Ӷ���N*N����������ͬ�Ĳ���
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
