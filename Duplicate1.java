package src;

/*
 * ��Ŀ����
 * ��һ������Ϊn����������������ֶ���0��n-1�ķ�Χ�ڡ� ������ĳЩ�������ظ��ģ�����֪���м����������ظ��ġ�
 * Ҳ��֪��ÿ�������ظ����Ρ����ҳ�����������һ���ظ������֡� 
 * ���磬������볤��Ϊ7������{2,3,1,0,2,5,3}����ô��Ӧ������ǵ�һ���ظ�������2��
 */
public class Duplicate1 {
	public boolean duplicate(int numbers[], int length, int[] duplication) {
        boolean[] k = new boolean[length];
        for (int i = 0; i < k.length; i++) {
            if (k[numbers[i]] == true) {
                duplication[0] = numbers[i];
                return true;
            }
            k[numbers[i]] = true;
        }
            return false;
    }
	public static void main(String[] args){
		Duplicate1 d = new Duplicate1();
		int[] num = {1,2,3,4,5,5,3,1};
		int[] a = {1,2};
		d.duplicate(num, num.length, a);
		System.out.println(a[0]);
	}
}
