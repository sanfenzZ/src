package str;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 * @author me
 * @date 2018��6��9��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * �����������ϣ�Ҫ��{A} + {B}�� ע��ͬһ�������в�����������ͬ��Ԫ�ء�
 * ��������:
 * ÿ���������ݷ�Ϊ����,��һ������������n,m(0 �� n,m �� 10000)���ֱ��ʾ����A�ͼ���B��Ԫ�ظ�����
 * �����зֱ��ʾ����A�ͼ���B��ÿ��Ԫ��Ϊ������int��Χ������,ÿ��Ԫ��֮���и��ո������
 * �������:
 * ���ÿ���������һ�����ݣ���ʾ�ϲ���ļ��ϣ�Ҫ���С���������ÿ��Ԫ��֮����һ���ո����,��ĩ�޿ո�

 * ����
 * 3 3
 * 1 3 5
 * 2 4 6
 * ���
 * 1 2 3 4 5 6
 * 
 * ˼·��
 * �����������¼���м��ϣ�����һ�������������������������������
 */
public class DoubleListAdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len1 = sc.nextInt();
		int len2 = sc.nextInt();
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		for(int i=0;i<len1+len2;i++)
			tree.add(sc.nextInt());
		Iterator<Integer> it = tree.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
			if(it.hasNext())
				System.out.print(" ");
		}
	}
}
