package src;

/**
 * @author me
 * @date 2018��6��14��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * ��ʵ��һ���㷨��ȷ��һ���ַ����������ַ��Ƿ�ȫ����ͬ����������Ҫ������ʹ�ö���Ĵ洢�ṹ��
 * ����һ��string iniString���뷵��һ��boolֵ,True���������ַ�ȫ����ͬ��False���������ͬ���ַ���
 * ��֤�ַ����е��ַ�ΪASCII�ַ����ַ����ĳ���С�ڵ���3000��

 * ����������
 * "aeiou"
 * ���أ�True
 * "BarackObama"
 * ���أ�False
 */
public class StringDifferent {
	public static void main(String[] args) {
		String s = "BarackObama";
		System.out.println(checkDifferent(s));
	}
	public static boolean checkDifferent(String str) {
		boolean bool = true;
		//String[] str1 = str.split("");
		char[] str1 = str.toCharArray();
		for(int i=0;i<str1.length;i++){
			//System.out.println(str1[i]);
			if(str.lastIndexOf(str1[i]) != i){
				bool = false;
				break;
			}
		}
		return bool;
	}
}
