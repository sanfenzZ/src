package lab03;

/*
 * 题目描述
 * 请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 * 当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 * 输出描述:
 * 如果当前字符流没有存在出现一次的字符，返回#字符。
 */
public class FirstAppearingOnce1 {
	private int[] arr = new int[128];
	private int index ;
	public FirstAppearingOnce1() {
		for(int i=0;i<128;i++)
			arr[i] = -1;
	}
	//Insert one char from stringstream
    public void Insert(char ch) 
    {
        if(arr[ch] == -1){
        	arr[ch] = index;
        }else if(arr[ch] >= 0)
        	arr[ch] = -2;
        index++;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
    	char c = '\0';
    	int mixnum = Integer.MAX_VALUE;
    	for(int i=0;i<128;i++){
    		if(arr[i] >= 0&&mixnum > arr[i]){
    			c =(char) i;
    			mixnum = arr[i];
    		}
    	}
    	if(c == '\0')
    		return '#';
    	return c;
    }
}
