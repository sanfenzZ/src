package lab03;

/*
 * ��Ŀ����
�������е��������֣����ǰ��һ�����ִ��ں�������֣����������������һ������ԡ�
����һ������,�����������е�����Ե�����P������P��1000000007ȡģ�Ľ������� �����P%1000000007
��������:
��Ŀ��֤�����������û�е���ͬ������

���ݷ�Χ��                                                                                                     ʾ��1
����%50������,size<=10^4							����
����%75������,size<=10^5								1,2,3,4,5,6,7,0
����%100������,size<=2*10^5						���
													7
 */
public class InversePair {
	public int InversePairs(int [] array) {
		if(array.length == 0 || array == null)
			return 0;
		int len = array.length;
		int [] copy = new int[len];
		for(int i=0;i<len;i++)
			copy[i] = array[i];
		int count = InversePairscount(array,copy,0,len-1);
		return count;
	}
	private int InversePairscount(int[] array, int[] copy, int start, int last) {
		if(start == last)
			return 0;
		int mid = (start+last)/2;
		int leftcount = InversePairscount(array,copy,start,mid)%1000000007;
		int rightcount = InversePairscount(array,copy,mid+1,last)%1000000007;
		
		int count = 0;
		int i = mid;
		int j = last;
		int copynum = last;
		while(i>=start && j>mid){
			if(array[i] > array[j]){
				count += j-mid;
				copy[copynum--] = array[i--];
				if(count >= 1000000007){
					count %= 1000000007;
				}
			}else{
				copy[copynum--] = array[j--];
			}
		}
		
		for(;i>=start;i--)
			copy[copynum--] = array[i];
		for(;j>=last;j--)
			copy[copynum--] = array[j];
		for(int s=start;s<=last;s++)
			array[s] = copy[s];
		return (count+leftcount+rightcount)%1000000007;
	}
	
	
	public static void  main(String[] args){
		InversePair i = new InversePair();
		int[] a = {1,2,3,4,5,6,7,0};
		System.out.println(i.InversePairs(a));
		System.out.println("�Ǵ��");
	}
}
