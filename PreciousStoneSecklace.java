package str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author me
 * @date 2018��5��24��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * ��һ����ɫ��ʯ���������ɺܶ��ֲ�ͬ�ı�ʯ��ɵģ������챦ʯ������ʯ����ʯ����䣬����ȡ�
 * ��һ������������ʹ͸���һ��ѧ�ߣ�������˵������Դ����������������������ϲ���챦ʯ������ʯ����ˮ����������ʯ�����֣�
 * ��Ҫ��������н�ȡ������һС�λ����ң���һ���б���������е������ֱ�ʯ��ʣ�µĲ�������Դ��ߡ�����޷��ҵ���һ��Ҳ�޷����ߡ�
 * �����ѧ���ҳ�����з��������ܹ��õ����ı�ʯ��
 * ��������:
 * ������ÿ���ַ�����һ�ֱ�ʯ��A��ʾ�챦ʯ��B��ʾ����ʯ��C������ˮ����D������䣬E������ʯ��F������ʯ��G�������ȵȣ�
 * ������һ��ȫ��Ϊ��д��ĸ���ַ����б�ʾ�����ı�ʯ���У�ע����������β��ӵġ�
 * ÿ�д���һ�������
 * 
 * ˼·��
 * ��ȡ��
 * ����contains()�����Ƿ����ABCDE�Ĵ��ڣ���stringbuffer�洢�� 
 * ��AΪ���㣬��BCDE�����ֵ���Ƚϴ��м�ʹ����ߵ�ֵȡ��С��
 */
public class PreciousStoneSecklace {

	public static void  main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		while((str = br.readLine()) != null){
			int len = str.length();
			char[] charArr = new char[2*len];
			
			for(int i=0;i<charArr.length;i++)//������һ�����������ѭ��������
				charArr[i] = str.charAt(i%len);
			int[] indexArr = {-1,-1,-1,-1,-1};
			int MaxValue = 0;
			for(int i=0;i<charArr.length;i++){
				if(charArr[i] >= 'A' && charArr[i] <= 'E'){
					indexArr[charArr[i]-'A'] = i;
				
				if(arrNum(indexArr))
					MaxValue = Math.max(MaxValue, len - MaxABCDE(indexArr));
					
			}
			}
			System.out.println(MaxValue);
		}
	
	}
	private static int MaxABCDE(int[] arr){
		int max = -1;int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		return max-min+1;
	}
	private static  boolean arrNum(int[] arr){
		for(int i=0;i<arr.length;i++){
			if(arr[i] < 0)
				return false;
		}
		return true;
	}
}
