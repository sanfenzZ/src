package str;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author me
 * @date 2018��5��30��
 * @version 1.0.0
 * 
 *          ��Ŀ���� 18λ���֤�ı�������ǣ� ǰ1��2λ���ֱ�ʾ������ʡ��ֱϽ�С����������Ĵ��� ��3��4λ���ֱ�ʾ�����ڵؼ��У������ݣ��Ĵ���
 *          ��5��6λ���ֱ�ʾ�����������ء������ء��ؼ��У��Ĵ��룻 ��7��14λ���ֱ�ʾ�������ꡢ�¡��գ�
 *          ��15��16λ���ֱ�ʾ�����ڵص��ɳ����Ĵ��룻 ��17λ���ֱ�ʾ�Ա�������ʾ���ԣ�ż����ʾŮ�ԣ�
 *          ��18λ������У���룬�����������֤����ȷ�ԡ�
 *          �û����������֤�Ĺ����о������������Ϊ�˷����û���ȷ������Ҫ����������ж��û������밴�� 6+8+4 �ĸ�ʽ���з��飬
 *          ʵ��һ������������������е����֤�ţ����ط������ַ�
 * 
 *          ��������:���������ж��У�ÿһ����һ����������е����֤�� �������:�������ַ���
 * 
 *          ���� 5021, 502104, 198803, 5021041988033084, 502104198803308324
 * 
 *          ��� 5021, 502104, 198803, 502104 19880330 84, 502104 19880330 8324
 */
public class IdentityCard {
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		while ((str = br.readLine()) != null) {
			StringBuilder st = new StringBuilder();
			String str1[] = str.split("");
			
			for(int i=0;i<7 && i<str1.length;i++)//6
				st.append(str1[i]);
			st.append(" ");
			
			for(int i=7;i<15 && i<str1.length;i++)//+8
				st.append(str1[i]);
			st.append(" ");
			
			for(int i=15;i<19 && i<str1.length;i++)
				st.append(str1[i]);
			st.append(" ");
			
			System.out.print(st.toString());
		}
	}
	*/
	public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.replace(" ","");
        int len = str.length();
        for(int i=0; i<len; ){
            System.out.print(str.charAt(i));
            i++;
            if(i == 6 || i == 14){
                System.out.print(" ");
            }
        }
    }
}
