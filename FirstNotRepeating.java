package lab03;

import java.util.ArrayList;

/*
 * 在一个字符串(1<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置
 * 
 */
public class FirstNotRepeating {
	public int FirstNotRepeatingChar(String str) {
	        if(str == null || str.length() < 1)
				return 0;
			ArrayList<String> list = new ArrayList<>();
			
			
			String[] nstr = str.split("");
			for(int i=0;i<str.length();i++)
				list.add(nstr[i]);
			int size = list.size();
			int num = size;
			for(int i=1;i<size;i++){
				String string = list.get(i);
					if(i == (list.lastIndexOf(string)) && i == (list.indexOf(string))){
						System.out.println("this char is "+list.get(list.indexOf(list.get(i))));
						return list.indexOf(list.get(i))-1;
					}
			}
		
		
		return 0;
	//return num+1;
	}
	public static void main(String[] args){
		FirstNotRepeating f = new FirstNotRepeating();
		String s = "google";
		System.out.println(f.FirstNotRepeatingChar(s));
	}
}
