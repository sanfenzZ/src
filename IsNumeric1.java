package lab03;

/*
 * 题目描述
 * 	请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 	例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。
 * 	 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class IsNumeric1 {
	public boolean isNumeric(char[] str) {
        boolean sign=false,ecount=false,point=false;
        for(int i=0;i<str.length;i++){
        	if(str[i]=='e'||str[i]=='E'){
        		if(i==str.length-1)
        			return false;// e后面一定要接数字
        		if(ecount) 
        			return false;// 不能同时存在两个e
        		ecount = true;
        	}else if(str[i]=='-'||str[i]=='+'){// 第二次出现+-符号，则必须紧接在e之后
        		if(sign && str[i-1]!='e' && str[i-1]!='E')
        			return false;
        		if(!sign && i>0 && str[i-1]!='e' && str[i-1]!='E') // 第一次出现+-符号，且不是在字符串开头，则也必须紧接在e之后
        			return false;
        		sign = true;
        	}else if(str[i]=='.'){
        		if(ecount || point)// e后面不能接小数点，小数点不能出现两次
        			return false;
        		point = true;
        	}else if(str[i]>'9'||str[i]<'0')// 不合法字符
        		return false;
        	
        }
	return true;
	}
	public static void main(String[] args){
		IsNumeric1 m = new IsNumeric1();
		char[] s = {'1','+','2','3'};
		/*char aff = 'A';
		char ab = 'Z';
		int a1 =Integer.valueOf(aff);
		int a2 =Integer.valueOf(ab);*/
		System.out.println(m.isNumeric(s));
		
	}
}
