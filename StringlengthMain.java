package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018��5��14��
 * @version 1.0.0
 * 
 *          ��Ŀ���� �����ַ������һ�����ʵĳ��ȣ������Կո������
 * 
 *          ˼·�� ����string��spilt()�����иװ��һ�����飬�������һ��Ԫ�صĳ���
 */
public class StringlengthMain {
	public static void main(String[] args) {
		StringlengthMain s = new StringlengthMain();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			String[] arrStr = str.split(" +");// Ҳ����str.split("\\s+"),
			/*
			 * split("\\s+") ���ո�,�Ʊ�����Ƚ��в��
			 * ��Ҳ����˵���ǰ��հײ��ֽ��в�֣���������հ�ʹ����ô�������µ�,����ո�� tab���� plit(" +")
			 * ���ո���в�֣�Ҳ����˵ֻ�а��ո���������ĿհײŻ��ǲ�ֵ�һ�䣩
			 */
			String lastStr = arrStr[arrStr.length - 1];
			System.out.println(lastStr.length());
		}
	}
}