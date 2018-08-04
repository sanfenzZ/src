package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��4��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * �����һ���㷨�ܹ�����������ַ����洢������������Ӳ������ԷǷ��������򷵻�error
 * ��������:
 * ����Ϊһ�У����������ַ������ַ����ĳ�����[1,100]��
 * �������:
 * ���Ϊһ�С��Ϸ���������ӽ�����Ƿ�������error
 * 
 * ����                                    ���
 * 123 123          246
 * abd 123          Error
 * 
 * ˼·��
 * ��д����ַ���װ���ַ��������У��Ƚ���ֵ�Ƿ���0-9֮�䣬
 */
public class DoubleStringAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			String s = sc.nextLine();
			String[] ss = s.split(" ");
			String result = add(ss[0],ss[1]);
			System.out.println(result);
		}
	}

	private static String add(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		if(!check(c1) || !check(c2)){
			return "Error";
		}
		if(c1.length < c2.length){
			char[] temp = c2;
			c2 = c1;
			c1 = temp;
		}
	int cf = 0;
	int i = c1.length-1;int j = c2.length-1;
	while(j >= 0){
		int tmp = c1[j] - '0'+c2[j]-'0'+cf;
		cf = tmp / 10;
		c1[i] = (char)(tmp%10+'0');
		i--;j--;
	}
	while(i >= 0 && cf>0){
		int tmp = c1[i]+'0'+cf;
		cf = tmp/10;
		c1[i] = (char)(tmp%10+'0');
		i--;
	}
	StringBuilder sb = new StringBuilder();
	if(cf>0)
		sb.append('1');
	for(int k=0;k<c1.length;k++)
		sb.append(c1[k]);
	return sb.toString();
	
	}

	/**
	 * @param c2
	 * @return
	 */
	private static boolean check(char[] c) {
		for(int i=0;i<c.length;i++){
			if(c[i]<'0' || c[i] > '9')
				return false;
		} 
		return true;
	}
}
