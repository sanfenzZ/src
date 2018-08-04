	package str;
	
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	
	/**
	 * @author me
	 * @date 2018年7月15日  
	 * @version 1.0.0 
	 * 
	 * 题目描述
	 * 牛牛拿到了一个藏宝图，顺着藏宝图的指示，牛牛发现了一个藏宝盒，藏宝盒上有一个机关，
	 * 机关每次会显示两个字符串 s 和 t，根据古老的传说，牛牛需要每次都回答 t 是否是 s 的子序列。
	 * 注意，子序列不要求在原字符串中是连续的，例如串 abc，它的子序列就有 {空串, a, b, c, ab, ac, bc, abc} 8 种。
	 * 输入描述:
	 * 每个输入包含一个测试用例。每个测试用例包含两行长度不超过 10 的不包含空格的可见 ASCII 字符串。
	 * 输出描述:
	 * 输出一行 “Yes” 或者 “No” 表示结果。
	
	 * 示例1
	 * 输入
	 * x.nowcoder.com
	 * ooo
	 * 输出
	 * Yes
	 */
	public class Precious {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String strA = br.readLine();
			String strB = br.readLine();
			
			String temp = strA;
			String[] splB = strB.split("");
			String result = "Yes";
			//boolean bool = true;
			for(int i=0;i<splB.length;i++){
				/*if(temp.contains(splB[i])){
					
					System.out.print("B[]="+splB[i]+"  ");
					int index = temp.indexOf(splB[i]);
					temp = temp.substring(index+1,temp.length());
					System.out.println("index:"+index+"now :"+temp);
				}else
					bool = false;*/
				int m = temp.indexOf(splB[i]);
				if(m != -1){
					temp = temp.substring(m+1);
					continue;
				}else
					result = "No";
			}
			System.out.println(result);
			/*if(bool){
				System.out.println("Yes");
			}else
				System.out.println("No");*/
		}
	}
