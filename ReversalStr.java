package str;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author me
 * @date 2018��5��17��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * ����һ�����ӣ�ֻ������ĸ�Ϳո񣩣� �������еĵ���λ�÷�ת�������ÿո�ָ�, ����֮��ֻ��һ���ո�ǰ��û�пո�
 *  ���磺 ��1�� ��hello xiao mi��-> ��mi xiao hello��
 *  
 *  ˼·��
 *  ����һ��ջ�������ַ���������ٴ�ջ��ȡ����
 */
public class ReversalStr {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String str = in.nextLine();
			String[] arr = str.split(" ");
			StringBuffer sb = new StringBuffer();
			for(int i=arr.length-1;i>0;i--)
				sb.append(arr[i]+" ");
			sb.append(arr[0]);
			System.out.println(sb.toString());	
			
			
		}
	}
}
