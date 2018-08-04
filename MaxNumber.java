package str;

import java.util.Scanner;

/**
 * @author me
 * @date 2018年5月28日
 * @version 1.0.0
 * 
 *          题目描述 给定一个十进制的正整数number，选择从里面去掉一部分数字，希望保留下来的数字组成的正整数最大。
 * 
 *          思路： 每次删除其中最小的数，
 */
public class MaxNumber {
	/*public class Main {
		public void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while (sc.hasNext()) {
				StringBuilder yy = new StringBuilder();
				yy.append(sc.next());
				int cnt = sc.nextInt();
				int count = 0;
				while (count < cnt) {
					int len = yy.length() -1;
					int s = 0;
					while (s < len && yy.codePointAt(s) >= yy.codePointAt(s+1))
						s++;
					yy.deleteCharAt(s);
					count++; //记录删除个数  
				}
			System.out.println(yy);
		    }
		    }
}*/
}
