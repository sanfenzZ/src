package lab03;

/*
 * ��Ŀ����
 * ��ʵ��һ�����������ҳ��ַ����е�һ��ֻ����һ�ε��ַ������磬�����ַ�����ֻ����ǰ�����ַ�"go"ʱ����һ��ֻ����һ�ε��ַ���"g"��
 * ���Ӹ��ַ����ж���ǰ�����ַ���google"ʱ����һ��ֻ����һ�ε��ַ���"l"��
 * �������:
 * �����ǰ�ַ���û�д��ڳ���һ�ε��ַ�������#�ַ���
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
