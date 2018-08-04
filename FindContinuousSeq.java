package src;

import java.util.ArrayList;
import java.util.Stack;

/*
 * 题目描述
	小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
	但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
	没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
	现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
输出描述:
	输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
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
