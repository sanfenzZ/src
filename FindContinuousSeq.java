package src;

import java.util.ArrayList;
import java.util.Stack;

/*
 * ��Ŀ����
	С����ϲ����ѧ,��һ����������ѧ��ҵʱ,Ҫ������9~16�ĺ�,�����Ͼ�д������ȷ����100��
	���������������ڴ�,�����뾿���ж������������������еĺ�Ϊ100(���ٰ���������)��
	û���,���͵õ���һ������������Ϊ100������:18,19,20,21,22��
	���ڰ����⽻����,���ܲ���Ҳ�ܿ���ҳ����к�ΪS��������������? Good Luck!
�������:
	������к�ΪS�������������С������ڰ��մ�С�����˳�����м䰴�տ�ʼ���ִ�С�����˳��
 */
public class FindContinuousSeq {
	 public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
	       ArrayList<ArrayList<Integer>> listAll = new ArrayList<>();
			
      if(sum <= 1)
				return listAll;
		   int small = 1;
		   int big = 2;
		   while(small != (1+sum)/2){
			   int numsum = numstob(small,big);
			   if(numsum < sum){
				   big++;
				}else if(numsum == sum){
                 ArrayList<Integer> list = new ArrayList<>();
					for(int i=small;i<=big;i++)
						list.add(i);
					small++;
					big++;
					listAll.add(list);
				}else{
					small++;
				}
		   }
      return listAll;
	}
	public int numstob(int a,int b){
		int result = a;
		for(int i=a+1;i<=b;i++)
			result += i;
		return result;
	}
}
