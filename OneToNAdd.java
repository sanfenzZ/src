package str;

import org.omg.PortableInterceptor.INACTIVE;
import java.util.*;
import java.io.*;
import java.math.*;
/**
 * @author me
 * @date 2018��6��11��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * ������������ n �� m��������1��2��3.......n ������ȡ������,ʹ��͵��� m ,Ҫ���������еĿ�������г���
 * ��������:
 * ÿ�������������2������,n��m
 * �������:
 * ��ÿ����ϵ��ֵ����������,ÿ�����һ�����

 * ����
 * 5 5
 * ���
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
