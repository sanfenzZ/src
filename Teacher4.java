package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Teacher4 {
	//ð�����򣬶���һ���������������һ����ֵ��ʼ���±Ƚϣ�����С�ľ��滻
	public void Sort(int[] a){
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i] > a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	public void Print(int[] a){
		System.out.print("����������ǣ�");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
}
	public static void main(String[] args){
		//int[] num = {2,5,7,6,2,4,10,3,48};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������֣���','����");
		String str = sc.next();
		String[] array = str.split(",");
		int num[] = new int[array.length];
		for(int i=0;i<array.length;i++){
			int c = Integer.parseInt(array[i]);
			num[i] = c;
		}		
		Teacher4 te = new Teacher4();
		System.out.println("����ǰ�����飺");
		te.Print(num);
		te.Sort(num);
		System.out.println();
		System.out.println("����������:");
		te.Print(num);
	}

}
	