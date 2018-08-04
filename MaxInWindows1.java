package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
 * ��Ŀ����
 * ����һ������ͻ������ڵĴ�С���ҳ����л�����������ֵ�����ֵ��
 * ���磬�����������{2,3,4,2,6,2,5,1}���������ڵĴ�С3����ôһ������6���������ڣ����ǵ����ֵ�ֱ�Ϊ{4,4,6,6,6,5}��
 *  �������{2,3,4,2,6,2,5,1}�Ļ�������������6����
 *   {[2,3,4],2,6,2,5,1}�� {2,[3,4,2],6,2,5,1}�� {2,3,[4,2,6],2,5,1}�� 
 *   {2,3,4,[2,6,2],5,1}�� {2,3,4,2,[6,2,5],1}�� {2,3,4,2,6,[2,5,1]}��
 */
public class MaxInWindows1 {
    public ArrayList<Integer> maxInWindows(int [] num, int size){
        ArrayList<Integer> list = new ArrayList<>();
        if(num.length < 1 || size < 1)
        	return list;
        int[] numsize = new int[size];
        for(int i=0;i<num.length;i++){
        	if(i+size <= num.length){
        	for(int j=0;j<size;j++){//System.out.print("  "+i);
        		
        		numsize[j] = num[i+j];
        		if(j == size-1){
        			Arrays.sort(numsize);
        			list.add(numsize[numsize.length-1]);
        		}
        	}
        	}
        }
        return list;
    }
    public static void main(String[] args){
    	MaxInWindows1 m = new MaxInWindows1();
    	ArrayList<Integer> l = new ArrayList<>();
    	int[] num = {2,3,4,2,6,2,5,1};
    	l = m.maxInWindows(num, 3);
    	Iterator<Integer> it = l.iterator();
    	while(it.hasNext())
    		System.out.println(it.next());
    }
}
