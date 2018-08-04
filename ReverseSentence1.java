package src;

/*
 * 题目描述
 *牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 *同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 *例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，
 *正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
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
        		//奇数
        		stradd[i] = strsplit[strlen-i];
        		stradd[strlen2+i] = strsplit[strlen2-i];
        	}else{
        		//偶数
        		stradd[i] = strsplit[strlen-i];
        		stradd[strlen2+i-1] = strsplit[strlen2-i];
        		}
        }
        result = stradd[0];
        for(int i=1;i<stradd.length;i++)
        	result = result+" "+stradd[i];
        return result;
	}
	
	public String ReverseSentence2(String str){//其他做法
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
