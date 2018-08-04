package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Teacher4 {
	//冒泡排序，定义一个变量，从数组第一个数值开始向下比较，比它小的就替换
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
		System.out.print("数组的数据是：");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
}
	public static void main(String[] args){
		//int[] num = {2,5,7,6,2,4,10,3,48};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("输入数字，以','隔开");
		String str = sc.next();
		String[] array = str.split(",");
		int num[] = new int[array.length];
		for(int i=0;i<array.length;i++){
			int c = Integer.parseInt(array[i]);
			num[i] = c;
		}		
		Teacher4 te = new Teacher4();
		System.out.println("排序前的数组：");
		te.Print(num);
		te.Sort(num);
		System.out.println();
		System.out.println("排序后的数组:");
		te.Print(num);
	}

}
	