	package src;
	
	import java.util.Scanner;
	
	/**
	 * @author me
	 * @date 2018��6��13��  
	 * @version 1.0.0 
	 * 
	 * ��Ŀ����
	 * ��һ�仰�ĵ��ʽ��е��ã���㲻���á����� I like beijing. �����������Ϊ��beijing. like I
	 * ��������:
	 * ÿ�������������1������������ I like beijing. �����������Ȳ�����100
	 * �������:
	 * �����������֮����ַ���,�Կո�ָ�
	
	 * ����
	 * I like beijing.
	 * ���
	 * beijing. like I
	 */
	public class ReversalString {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			String str = sc.nextLine();
			String[] arrstr = str.split(" ");
			String result = "";
			for(int i=arrstr.length-1;i>=0;i--){
				result += arrstr[i];
				if(i != 0)
					result += " ";
			}
			System.out.print(result);
		}
		
	
	}
