package str;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author me
 * @date 2018��6��29��  
 * @version 1.0.0 
 * 
 * ��Ŀ����
 * ţţ����ҵ������һ������Ϊ n ������ A��������а����˴�1��n��n������������ΪһЩԭ��������һЩλ�ã������� 10 �����������ˣ�
 * ����ţţ�ǵ��������˳��Ե������� k��˳�����ָ���� i < j �� A[i] < A[j] �Ķ�����
 * �����ţţ��������������Ҫ��ĺϷ����е���Ŀ��
 * ��������:
 * ÿ���������һ������������
 * ÿ�����������ĵ�һ�а����������� n �� k��1 <= n <= 100, 0 <= k <= 1000000000����
 * �������� 1 �У����� n �����ֱ�ʾ���� A�����е���0�����ʾ�������λ�ã������� 10 ������
 * �������:
 * ���һ�б�ʾ�Ϸ���������Ŀ��

 * ʾ��1
 * ����
 * 5 5
 * 4 0 0 2 0
 * ���
 * 2
 * 
 * https://www.nowcoder.com/questionTerminal/b698e67a2f5b450a824527e82ed7495d
 */
public class ArraySortDouble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		boolean[] flag = new boolean[n+1];
		
		int res = 0;
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
			if(arr[i]!=0)
				flag[arr[i]] = true;
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=1;i<=n;i++){
			if(flag[i] == false)
				list.add(i);
		}
		
		List<ArrayList<Integer>> perm = new ArrayList<ArrayList<Integer>>();
		
		calperm(perm,list,0);
		
		int cv = 0;
		for(int i=0;i<n;i++)
			if(arr[i] != 0)
				for(int j=i+1;j<n;j++)
					if(arr[j] != 0 && arr[i] < arr[j])
						cv++;
			
		for(ArrayList<Integer> tmp:perm){
			int val = cv;
			int[] tmpA = Arrays.copyOf(arr,n);
			val += calvalue(tmp,tmpA);
			if(val == k)
				res++;
		}
		System.out.println(res);
		
	}

	private static int calvalue(ArrayList<Integer> list, int[] arr) {
		int val = 0;
		int j = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] == 0){
				arr[i] = list.get(j++);
				for(int k=0;k<i;k++)
					if(arr[k] !=0&&arr[k] < arr[i])
						val++;
				for(int k=i+1;k<arr.length;k++)
					if(arr[k] !=0&&arr[k] > arr[i])
						val++;
			
			}
		}	
		return val;
	}

	private static void calperm(List<ArrayList<Integer>> perm,ArrayList<Integer> list, int n) {
		if(n == list.size()){
			perm.add(new ArrayList<Integer>(list));
		}else{
			for(int i=n;i<list.size();i++){
				Collections.swap(list, i, n);
				calperm(perm, list, n+1);
				Collections.swap(list, i, n);
			}
		}
		
		
		
	}
}
