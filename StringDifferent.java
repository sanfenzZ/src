package src;

/**
 * @author me
 * @date 2018年6月14日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 请实现一个算法，确定一个字符串的所有字符是否全都不同。这里我们要求不允许使用额外的存储结构。
 * 给定一个string iniString，请返回一个bool值,True代表所有字符全都不同，False代表存在相同的字符。
 * 保证字符串中的字符为ASCII字符。字符串的长度小于等于3000。

 * 测试样例：
 * "aeiou"
 * 返回：True
 * "BarackObama"
 * 返回：False
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
