package lab03;

/*
 * ��Ŀ����
 * 	��ʵ��һ�����������ж��ַ����Ƿ��ʾ��ֵ������������С������
 * 	���磬�ַ���"+100","5e2","-123","3.1416"��"-1E-16"����ʾ��ֵ��
 * 	 ����"12e","1a3.14","1.2.3","+-5"��"12e+4.3"�����ǡ�
 */
public class IsNumeric1 {
	public boolean isNumeric(char[] str) {
        boolean sign=false,ecount=false,point=false;
        for(int i=0;i<str.length;i++){
        	if(str[i]=='e'||str[i]=='E'){
        		if(i==str.length-1)
        			return false;// e����һ��Ҫ������
        		if(ecount) 
        			return false;// ����ͬʱ��������e
        		ecount = true;
        	}else if(str[i]=='-'||str[i]=='+'){// �ڶ��γ���+-���ţ�����������e֮��
        		if(sign && str[i-1]!='e' && str[i-1]!='E')
        			return false;
        		if(!sign && i>0 && str[i-1]!='e' && str[i-1]!='E') // ��һ�γ���+-���ţ��Ҳ������ַ�����ͷ����Ҳ���������e֮��
        			return false;
        		sign = true;
        	}else if(str[i]=='.'){
        		if(ecount || point)// e���治�ܽ�С���㣬С���㲻�ܳ�������
        			return false;
        		point = true;
        	}else if(str[i]>'9'||str[i]<'0')// ���Ϸ��ַ�
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
