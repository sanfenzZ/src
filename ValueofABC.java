package str;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��21��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * A,B,C�������Ǻ�����,ÿ�������ﶼ��һЩ�ǹ�,���ǲ�֪������ÿ�������Ͼ����ж��ٸ��ǹ�,��������֪�����µ���Ϣ��
 * A - B, B - C, A + B, B + C. ���ĸ���ֵ.ÿ����ĸ����ÿ������ӵ�е��ǹ���.
 * ������Ҫͨ�����ĸ���ֵ�����ÿ���������ж��ٸ��ǹ�,��A,B,C�����ﱣ֤���ֻ��һ������A,B,C������������������
 * ��������:
 *  * ����Ϊһ�У�һ��4���������ֱ�ΪA - B ��B - C��A + B��B + C���ÿո������ ��Χ����-30��30֮��(������)��
 * �������:
 * ���Ϊһ�У�����������������A��B��C��˳�����A��B��C���ÿո��������ĩ�޿ո� �������������������A��B��C�������No

 * ʾ��1
 * ����
 * 1 -2 3 4
 * ���
 * 2 1 3
 */
public class ValueofABC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<4;i++)
			list.add(sc.nextInt());
		
		ABCValue(list);
	}
	private static void ABCValue(ArrayList<Integer> list){
		int A = (list.get(0)+list.get(2))/2;
		int B = (list.get(1)+list.get(3))/2;
		int C = list.get(3)-B;
		if((A - B == list.get(0)) &&(B - C == list.get(1)) &&(A + B == list.get(2)))
			System.out.print(A+" "+B+" "+C);
		else
			System.out.print("No");
		
		
	}
}
