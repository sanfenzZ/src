package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018年6月2日  
 * @version 1.0.0 
 * 
 * 题目描述
 * 请创建一个函数，从给定路径中提取文件扩展名，返回提取的文件扩展名，如果没有，则返回null。
 * 输入描述:
 * 输入数据为一个文件路径
 * 输出描述:
 * 对于每个测试实例，要求输出对应的filename extension
 * 
 * 输入
 * Abc/file.txt
 * 输出
 * txt
 * 
 * 链接：https://www.nowcoder.com/questionTerminal/7eb53c86e50845f6a2eafe7ea0fe9ef9
	来源：牛客网

考虑三种情况就可以了：
    1，点号不存在，此时并无文件，全都是目录，比如：C://java
    2，点号存在，不过表示上级或者上上级之类的目录，此时也并无文件，全都是目录，比如：./tomcat/bin
    3，存在文件名，这时候为了方式也存在.表示上级目录，因此可以使用String.lastIndexOf()方法来获取点号的位置，从而获取文件名的后缀
 */
public class FileName {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String fileInput = sc.next();
		int pos = fileInput.lastIndexOf(".");
		if(pos == -1 || fileInput.charAt(pos+1)=='/'){
			System.out.println("null");
			return ;
		}
		System.out.println(fileInput.substring(pos+1));
	
	}
}
