package str;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;




/**
 * @author me
 * @date 2018��6��27��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * ţţ�볢��һЩ�µ�����ÿ��������ҪһЩ��ͬ�Ĳ��ϣ���������е�������Ҫ׼�������ֲ�ͬ�Ĳ��ϡ�
 * ��������:
 * ÿ��������� 1 ������������ÿ�����������ĵ� i �У���ʾ��ɵ� i ��������Ҫ��Щ���ϣ����������ÿո������
 * ����ֻ������дӢ����ĸ�Ϳո������ļ������� 50 �У�ÿһ�в����� 50 ���ַ���
 * �������:
 * ���һ��һ�����ֱ�ʾ�������������Ҫ�����ֲ�ͬ�Ĳ��ϡ�

 * ʾ��1
 * ����
 * BUTTER FLOUR HONEY
 * FLOUR EGG
 * ���
 * 4
 */
public class KitchenMaterials {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> list = new ArrayList<>();
		while(sc.hasNext()){
			String[] str = (sc.nextLine()).split(" ");
			for(int i=0;i<str.length;i++)
				if(!list.contains(str[i]))
					list.add(str[i]);
		}
		System.out.println(list.size());
	}
}
