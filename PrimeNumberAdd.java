package str;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��22��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * ����һ������������д��������ж��ٶ������ĺ͵���������������������������������ֵС��1000��
 * �磬����Ϊ10, ����Ӧ��������Ϊ2�����������������ĺ�Ϊ10,�ֱ�Ϊ(5,5),(3,7)��
 * ��������:
 * �������һ������n,(3 �� n < 1000)
 * �������:
 * �������

 * ʾ��1
 * ����
 * 10
 * ���
 * 2
 */
public class PrimeNumberAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList arr = Primearr(n);
		System.out.println(arr);
		System.out.print(Add(arr,n));
	}
	private static ArrayList Primearr(int num){//��num�ڵ���������
		//StringBuffer sf = new StringBuffer();
		ArrayList<Integer> list = new ArrayList<>();
		int arrcount = 0;
		for(int i=2;i<=num;i++){
			int j=2;
			
			while(i % j != 0)
				j++;
			
			if(i == j)
				list.add(i);
		}
		return list;//sf.toString();
	}
	
	private static int Add(ArrayList<Integer> list,int n){
		int count = 0;
		for(int i=0;i<list.size();i++){
			for(int j=0;j<list.size();j++)
				if(list.get(i)+list.get(j) == n){
					//System.out.println("lsit:"+list.get(i)+"..."+list.get(j));
					count++;
					list.remove(list.get(j));
				}
			}
		return count;
	}
}
