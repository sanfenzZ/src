package src;

/*
 * ��Ŀ����
 *ţ���������һ����Ա��Fish��ÿ���糿���ǻ�����һ��Ӣ����־��дЩ�����ڱ����ϡ�
 *ͬ��Cat��Fishд�������ĸ���Ȥ����һ������Fish������������ȴ������������˼��
 *���磬��student. a am I������������ʶ������һ�ԭ���Ѿ��ӵ��ʵ�˳��ת�ˣ�
 *��ȷ�ľ���Ӧ���ǡ�I am a student.����Cat��һһ�ķ�ת��Щ����˳��ɲ����У����ܰ�����ô��
 */
public class ReverseSentence1 {
	public String ReverseSentence(String str) {
		String result = "";
		if(str == null || str.length()<=0)
        	return null;
		if(str.length() == 1)
            return str;
        String[] strsplit = str.split(" ");
        String[] stradd = new String[strsplit.length];
        
        int strlen = strsplit.length-1;
        int strlen2 = strsplit.length/2;
        for(int i=0;i<=strlen2;i++){
        	if((strlen%2) == 0){
        		//����
        		stradd[i] = strsplit[strlen-i];
        		stradd[strlen2+i] = strsplit[strlen2-i];
        	}else{
        		//ż��
        		stradd[i] = strsplit[strlen-i];
        		stradd[strlen2+i-1] = strsplit[strlen2-i];
        		}
        }
        result = stradd[0];
        for(int i=1;i<stradd.length;i++)
        	result = result+" "+stradd[i];
        return result;
	}
	
	public String ReverseSentence2(String str){//��������
		if(str == null || str.length() == 0)
			return null;
		if(str.trim().equals(""))
			return str;
		String[]  string = str.split(" ");
		StringBuffer sf = new StringBuffer();
		
		int len = string.length;
		for(int i=len-1;i>=0;i--){
			if(i == 0){
				sf.append(string[i]);
			}else{
				sf.append(string[i]);
				sf.append(" ");
			}
		}
	
		return sf.toString();
	}
	public static void main(String[] args){
		ReverseSentence1 r = new ReverseSentence1();
		String string = "a b d c";
		String s = r.ReverseSentence2(string);
		System.out.println(s);
	}
}
