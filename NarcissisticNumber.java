package str;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author me
 * @date 2018��5��21��  
 * @version 1.0.0 
 * 
 * ��ˮ�ɻ�������ָһ����λ�������ĸ�λ���ֵ������͵����䱾�����磺153=1^3+5^3+3^3�� ����Ҫ�����������m��n��Χ�ڵ�ˮ�ɻ�����
 * ��������:
 * ���������ж��飬ÿ��ռһ�У�������������m��n��100 �� m �� n �� 999����
 * �����ˮ�ɻ���������ڵ���m,����С�ڵ���n������ж������Ҫ���С����������һ���������֮����һ���ո����;
 * 
 * ˼·��
 * ����һ��for����num1-num2,��ArrayList��¼��Ч����
 */
public class NarcissisticNumber {
	private static int num3(int num){
		int result = num*num*num;
		return result;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			for(int i=num1;i<=num2;i++){
				String numstr = String.valueOf(i);
				String[] arrstr = numstr.split("");
				
				int sumstr = 0;
				for(int j=1;j<arrstr.length;j++)
					sumstr += num3(Integer.parseInt(arrstr[j]));
				if(i == sumstr)
					list.add(i);
			}
			if(list.size()!=0){
				for(int j=0;j<list.size();j++)
					System.out.print(list.get(j)+" ");
			}else{
				System.out.println("no");
			}
		}
		
		
	}
}
