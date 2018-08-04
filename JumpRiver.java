package str;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author me
 * @date 2018��5��22��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * һֻ����Ҫ�Ӻ���������Ӷ԰����Ӻܿ����Ǻ��м���˺ܶ�׮�ӣ�ÿ��һ�׾���һ����ÿ��׮���϶���һ�����ɣ��������������ϾͿ������ĸ�Զ��
 * ÿ������������ͬ����һ�����ִ������������������������Ϊ5���ʹ��������һ������ܹ���5�ף����Ϊ0���ͻ��ݽ�ȥ�޷�������Ծ��
 * ����һ��N�׿������ʼλ�þ��ڵ�һ���������棬Ҫ�������һ������֮���������ˣ�
 * ����ÿ�����ɵ������������������Ҫ�������ܹ�����԰�������޷��������-1
 * ��������:
 * ��������У���һ�������鳤��N (1 �� N �� 10000)���ڶ�����ÿһ���ֵ���ÿո�ָ���
 * �������:
 * ������ٵ��������޷��������-1
 * ʾ��1
 * ����
 * 5
 * 2 0 1 1 1
 * ���
 * 4
 * 
 * ˼·��
 * ���������������¼������ �Ƚϵ�ǰλ����ֵ�ڵ���ֵ�е����ֵ�������0���ͷ���-1
 */
public class JumpRiver {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		String[] strs;
		int n;
		while((str = br.readLine())!=null){
			n = Integer.parseInt(str);
			str = br.readLine();
			strs = str.trim().split(" ");
			int[] input = new int[n];
			for(int i=0;i<n;i++)
				input[i] = Integer.parseInt(strs[i]);
			
			int jumpcount = 0;
			
			for(int i=0;i<input.length;){
				jumpcount++;
				int index = i;
				int MaxValue = 0;
				for(int j=i+1;j<=i+input[i]&&j<n;j++){
					if(MaxValue < j+input[j]){
						MaxValue = j+input[j];
						index = j;
					}
				}
				if(MaxValue >= n)
					break;
				if(MaxValue == index){
					jumpcount = -2;
					break;
				}
				i = index;
			}
			
			System.out.println(++jumpcount);
			
			
		}
		br.close();
	}
}
