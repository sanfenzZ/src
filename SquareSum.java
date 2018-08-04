package str;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @author me
 * @date 2018��5��21��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * ���еĵ�һ��Ϊn���Ժ����Ϊǰһ���ƽ�����������е�ǰm��ĺ͡�
 * ��������:
 * ���������ж��飬ÿ��ռһ�У�����������n��n < 10000����m(m < 1000)��ɣ�n��m�ĺ�����ǰ������
 * Ҫ�󾫶ȱ���2λС����
 * 
 * ˼·��
 * ������һ��������forѭ��m�Σ���sumnum��¼����֮�ͣ�Math.sqrt(num)����ƽ����
 */
public class SquareSum {

	public static void main(String[] args){
	
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int first = sc.nextInt();
			int count = sc.nextInt();
			float resultnum = 0;
			double nextnum = first;
			for(int i=0;i<count;i++){
				resultnum += nextnum;
				nextnum = Math.sqrt(nextnum);
			}
			String result = ""+resultnum;
			BigDecimal bd = new BigDecimal(resultnum);
			bd = bd.setScale(2, RoundingMode.HALF_UP);
			System.out.print(bd.toString());
		}

	}
}
}
