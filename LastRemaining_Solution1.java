package src;

import java.util.ArrayList;

/*
 * ��Ŀ����
 * ÿ����һ��ͯ��,ţ�Ͷ���׼��һЩС����ȥ�����¶�Ժ��С����,����������ˡ�HF��Ϊţ�͵�����Ԫ��,��ȻҲ׼����һЩС��Ϸ��
 * ����,�и���Ϸ��������:����,��С������Χ��һ����Ȧ��Ȼ��,�����ָ��һ����m,�ñ��Ϊ0��С���ѿ�ʼ������
 * ÿ�κ���m-1���Ǹ�С����Ҫ���г��׸�,Ȼ���������Ʒ�����������ѡ����,���Ҳ��ٻص�Ȧ��,
 * ��������һ��С���ѿ�ʼ,����0...m-1����....������ȥ....ֱ��ʣ�����һ��С����,���Բ��ñ���,�����õ�ţ������ġ�����̽���ϡ���ذ�(��������Ŷ!!^_^)��
 * ������������,�ĸ�С���ѻ�õ������Ʒ�أ�(ע��С���ѵı���Ǵ�0��n-1)
 */
public class LastRemaining_Solution1 {
	/*public int LastRemaining_Solution(int n, int m) {
		if(n == 0 || m==0 || m==1)
			return 0;
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = i;
		return num(n,m,arr,0,0);
	}*/
	public static void main(String[] args){
		LastRemaining_Solution1 l = new LastRemaining_Solution1();
		//System.out.println(l.LastRemaining_Solution(3, 2));
	}
}
/*ArrayList<Integer> list = new ArrayList<>();
		int outnum = 0;
		int listnum = 0;
		for(int i=0;i<n;i++)
			list.add(i);
		while(list.size() > 1){
			if(outnum == m-1){
				System.out.println(list.get(listnum));
				list.remove(listnum);
			}
			outnum++;//12
			listnum++;//12             size3
			if(listnum ==list.size())
				listnum = list.get(0);
		}
    return list.get(0);*/