package src;

import java.util.ArrayList;

public class Num {
	/*在一个二维数组中，每一行都按照从左到右递增的顺序排序，
	 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，
	 * 输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
	 * 
	 */
	 public boolean Find(int [][] array,int target) {
	        int i,j;boolean temp=false,flag=false;
	        for( i=0;i<array.length;i++)
	            {
	            for(j=0;j<array[0].length;j++)
	                {
	                if(array[i][j]==target){
	                    temp=true;
	                    flag=true;                  
	                    break;}
	            }
	            if(flag==true) break;
	        }
	        return temp;
	    }
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 1, 2, 3, 4 },
				{ 1, 2, 3, 4 } };
	}
}
