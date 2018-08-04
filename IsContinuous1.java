package src;

import java.util.Arrays;

/*
 * ��Ŀ����
 *LL���������ر��,��Ϊ��ȥ����һ���˿���,���������Ȼ��2������,2��С��(һ����ԭ����54��^_^)...
 *��������г����5����,�����Լ�������,�����ܲ��ܳ鵽˳��,����鵽�Ļ�,������ȥ��������Ʊ,�ٺ٣���
 *������A,����3,С��,����,��Ƭ5��,��Oh My God!������˳��.....
 *LL��������,��������,������\С �����Կ����κ�����,����A����1,JΪ11,QΪ12,KΪ13��
 *�����5���ƾͿ��Ա�ɡ�1,2,3,4,5��(��С���ֱ���2��4),��So Lucky!����LL����ȥ��������Ʊ����
 * ����,Ҫ����ʹ�������ģ������Ĺ���,Ȼ���������LL��������Ρ�Ϊ�˷������,�������Ϊ��С����0��
 * 
 */
public class IsContinuous1 {
	public boolean isContinuous(int [] numbers) {
		if(numbers.length == 0)
			return false;
		boolean bool = false;
		Arrays.sort(numbers);
		int num0count = 0;
		int subcount = 0;
		if(numbers[0] == 0)
			num0count++;
		for(int i=1;i<numbers.length;i++){
			if(numbers[i] == 0)
				num0count++;
			if(numbers[i] == numbers[i-1] && numbers[i] != 0 && numbers[i-1] != 0)
				return false;
			if(numbers[i-1] != 0 && numbers[i] != 0 && numbers[i]-numbers[i-1] >1)
				subcount += (numbers[i]-numbers[i-1])-1;
		}
		if(subcount <= num0count)
			bool = true;
    return bool;
	}
	public static void main(String[] args){
		IsContinuous1 c = new IsContinuous1();
		int[] a={1,0,5,0,4};
		System.out.println(c.isContinuous(a));
	}
}
