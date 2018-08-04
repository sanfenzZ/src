package src;

import java.util.ArrayList;

public class FindNumsAppearOn {
	public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
		if(array.length < 1 || array == null)
			return ;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<array.length;i++){
			list.add(array[i]);
		}
		boolean num1true = false;
		for(int i=0;i<array.length;i++){
			int thisnum = array[i];
			if(i == list.lastIndexOf(thisnum) && list.indexOf(thisnum) == i){
				if(num1true == false){
					num1[0] = thisnum;
					num1true = true;
				}else
					num2[0] = thisnum;
			}
				
		}
	}
	public static void main(String[] args){
		FindNumsAppearOn f= new FindNumsAppearOn();
		int[] arr={1,22,22,33,33,5,51,51};
		int[] a= new int[2];
		int[] b= new int[2];
		f.FindNumsAppearOnce(arr, a, b);
		System.out.println("a:"+a[0]+"   b:"+b[0]);
	}
}
