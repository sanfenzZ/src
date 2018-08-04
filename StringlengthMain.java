package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018年5月14日
 * @version 1.0.0
 * 
 *          题目描述 计算字符串最后一个单词的长度，单词以空格隔开。
 * 
 *          思路： 先用string的spilt()方法切割，装在一个数组，返回最后一个元素的长度
 */
public class StringlengthMain {
	public static void main(String[] args) {
		StringlengthMain s = new StringlengthMain();
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String str = sc.nextLine();
			String[] arrStr = str.split(" +");// 也可用str.split("\\s+"),
			/*
			 * split("\\s+") 按空格,制表符，等进行拆分
			 * （也就是说它是按空白部分进行拆分，不管这个空白使用设么操作留下的,提如空格键 tab键） plit(" +")
			 * 按空格进行拆分（也就是说只有按空格键流出来的空白才会是拆分的一句）
			 */
			String lastStr = arrStr[arrStr.length - 1];
			System.out.println(lastStr.length());
		}
	}
}