package src;

import java.util.ArrayList;

public class Num {
	/*��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������
	 * ÿһ�ж����մ��ϵ��µ�����˳�����������һ��������
	 * ����������һ����ά�����һ���������ж��������Ƿ��и�������
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
