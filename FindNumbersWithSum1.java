package src;

/*
 * ��Ŀ����
 * ����һ����������������һ������S���������в������������ǵ����ǵĺ�������S������ж�����ֵĺ͵���S������������ĳ˻���С�ġ�
 * �������:
 * ��Ӧÿ�����԰����������������С���������
 * 
 */
import java.util.ArrayList;
public class FindNumbersWithSum1 {

	public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        ArrayList<Integer> list = new ArrayList<>();
		if(sum == 0)
        	return list;
		int small = 0;
		int big = array.length-1;
		while(small <= big){
			//int numsum = 0;
			if(array[small]+array[big] == sum){
				list.add(array[small]);
				list.add(array[big]);
				return list;
			}else if(array[small]+array[big] > sum){
				big--;
			}else{
				small++;
			}
				
		}
		return list;
    }
	public static void main(String[] args){
		FindNumbersWithSum1 f = new FindNumbersWithSum1();
		int a[] = {1,2,4,7,11,15};
		ArrayList<Integer> l = new ArrayList<>();
		l = f.FindNumbersWithSum(a,15);
		System.out.println("kkkk");
		for(int i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
	}
}
