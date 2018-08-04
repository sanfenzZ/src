package str;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author me
 * @date 2018��5��18��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * ��MIUI8�Ƴ��ֻ�������֮��MIUI9�ƻ��Ƴ�һ���绰�������Ĺ��ܣ�
 * ���Ƚ��绰�����е�ÿ�����ּ���8ȡ��λ��Ȼ��ʹ�ö�Ӧ�Ĵ�д��ĸ���� 
 * ��"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"����
 *  Ȼ�����������Щ��ĸ�������ɵ��ַ�����Ϊ�绰�����Ӧ�ķ���
 *  ����
 *  4
	EIGHT
	ZEROTWOONE
	OHWETENRTEO
	OHEWTIEGTHENRTEO          EERHTE  ONE two
	���
	0
	234
	345
	0345
	
	˼·���ַ������� Z����0��T����2,3��H����3,8��R����0,3,4��F����4,5��S����6��7��I����6,8,9��V����7��5��N����7,9��
		��һ�Σ���  Z ����  0  ����  W ���� 2����U����4���� X����6����G����8��
		�ڶ��Σ���  O ���� 1����  T/H/R ����3����  F ���� 5����  S ���� 7����  I ���� 9��
 */
public class PhoneNumStr {
	public static void main(String[] args){
		PhoneNumStr p = new PhoneNumStr();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()){
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
				handle(sc.next());
	}
	}
	private static void handle(String str){
		str = str.toLowerCase();
		int[] hash = new int[10];
		StringBuffer sb = new StringBuffer(str);
		while(sb.toString().contains("z")){
			hash[2]++;
			sb.deleteCharAt(sb.indexOf("z"));
			sb.deleteCharAt(sb.indexOf("e"));
			sb.deleteCharAt(sb.indexOf("r"));
			sb.deleteCharAt(sb.indexOf("o"));
		}
		while(sb.toString().contains("x")){
			hash[8]++;
			sb.deleteCharAt(sb.indexOf("s"));
			sb.deleteCharAt(sb.indexOf("i"));
			sb.deleteCharAt(sb.indexOf("x"));
		}

		while(sb.toString().contains("s")){//seven
			hash[9]++;
			sb.deleteCharAt(sb.indexOf("s"));
			sb.deleteCharAt(sb.indexOf("e"));
			sb.deleteCharAt(sb.indexOf("v"));
			sb.deleteCharAt(sb.indexOf("e"));
			sb.deleteCharAt(sb.indexOf("n"));
		}
		while(sb.toString().contains("u")){//four
			hash[6]++;
			sb.deleteCharAt(sb.indexOf("f"));
			sb.deleteCharAt(sb.indexOf("o"));
			sb.deleteCharAt(sb.indexOf("u"));
			sb.deleteCharAt(sb.indexOf("r"));
		}
		while(sb.toString().contains("f")){//five
			hash[7]++;
			sb.deleteCharAt(sb.indexOf("f"));
			sb.deleteCharAt(sb.indexOf("i"));
			sb.deleteCharAt(sb.indexOf("v"));
			sb.deleteCharAt(sb.indexOf("e"));
		}
		while(sb.toString().contains("g")){//eight
			hash[0]++;
			sb.deleteCharAt(sb.indexOf("e"));
			sb.deleteCharAt(sb.indexOf("i"));
			sb.deleteCharAt(sb.indexOf("g"));
			sb.deleteCharAt(sb.indexOf("h"));
			sb.deleteCharAt(sb.indexOf("t"));
		}
		while(sb.toString().contains("w")){//two
			hash[4]++;
			sb.deleteCharAt(sb.indexOf("t"));
			sb.deleteCharAt(sb.indexOf("w"));
			sb.deleteCharAt(sb.indexOf("o"));
		}
		while(sb.toString().contains("h")&&!sb.toString().contains("g")){//three
			hash[5]++;
			sb.deleteCharAt(sb.indexOf("t"));
			sb.deleteCharAt(sb.indexOf("h"));
			sb.deleteCharAt(sb.indexOf("r"));
			sb.deleteCharAt(sb.indexOf("e"));
			sb.deleteCharAt(sb.indexOf("e"));
		}
		while(sb.toString().contains("o")&&!sb.toString().contains("z")){//one
			hash[3]++;
			sb.deleteCharAt(sb.indexOf("o"));
			sb.deleteCharAt(sb.indexOf("n"));
			sb.deleteCharAt(sb.indexOf("e"));
		}
		while(sb.toString().contains("n")) {//nine
			hash[1]++;
			sb.deleteCharAt(sb.indexOf("n"));
			sb.deleteCharAt(sb.indexOf("i"));
			sb.deleteCharAt(sb.indexOf("n"));
			sb.deleteCharAt(sb.indexOf("e"));
		}
		for(int i=0;i<10;i++){
				for(int j=1;j<=hash[i];j++){
					System.out.print(i);
				}
		}
		System.out.println();
	}
}
