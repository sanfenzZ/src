package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��18��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * С��ϲ���ĵ��ʾ����������ԣ�
 * 1.����ÿ����ĸ���Ǵ�д��ĸ
 * 2.����û��������ȵ���ĸ
 * 3.����û�����硰xyxy��(�����x��yָ�Ķ�����ĸ�����ҿ�����ͬ)�����������У������п��ܲ�������
 * ���磺
 * С�ײ�ϲ��"ABBA"����Ϊ����������������'B'
 * С�ײ�ϲ��"THETXH"����Ϊ�������������"THTH"
 * С�ײ�ϲ��"ABACADA"����Ϊ�������������"AAAA"
 * С��ϲ��"A","ABA"��"ABCBA"��Щ����
 * ����һ�����ʣ���Ҫ�ش�С���Ƿ��ϲ��������ʡ�
 * ��������:
 * ����Ϊһ���ַ��������ɴ�д��ĸ��ɣ�����С��100
 * �������:
 * ���С��ϲ�����"Likes",��ϲ�����"Dislikes"

 * ����
 * AAA
 * ���
 * Dislikes
 */
public class StringNotContinuous {
	public static void main(String[] args) {//ֻ�����ǰ����
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		boolean bool = true;
		
		if(str.matches("[A-Z]+")){
			for(int i=1;i<str.length();i++){
				if(str.charAt(i-1) == str.charAt(i)){
					bool = false;
					break;
				}
			}
			
		if(bool == true){
			System.out.print("Likes");
		}else
			System.out.print("Dislikes");
		
	}else
		System.out.print("Dislikes");
		
	}
}
