package str;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author me
 * @date 2018年5月18日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 继MIUI8推出手机分身功能之后，MIUI9计划推出一个电话号码分身的功能：
 * 首先将电话号码中的每个数字加上8取个位，然后使用对应的大写字母代替 
 * （"ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"），
 *  然后随机打乱这些字母，所生成的字符串即为电话号码对应的分身。
 *  输入
 *  4
	EIGHT
	ZEROTWOONE
	OHWETENRTEO
	OHEWTIEGTHENRTEO          EERHTE  ONE two
	输出
	0
	234
	345
	0345
	
	思路：字符串中有 Z代表0；T代表2,3；H代表3,8；R代表0,3,4；F代表4,5；S代表6，7；I代表6,8,9；V代表7，5；N代表7,9；
		第一次：有  Z 就有  0  ；有  W 就有 2；有U就有4；有 X就有6；有G就有8；
		第二次：有  O 就有 1；有  T/H/R 就有3；有  F 就有 5；有  S 就有 7；有  I 就有 9；
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
