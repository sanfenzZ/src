package src;
import java.util.Stack;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;


public class Solution {
	public static boolean IsPopOrder(int [] pushA,int [] popA) {
        ArrayList<Integer> pushAList = new ArrayList<Integer>();
        ArrayList<Integer> popBList = new ArrayList<Integer>();
        boolean bool = false;
        int len = pushA.length-1;
        int count = 0;
        //System.out.println("len"+len);
        for(int i=0;i<pushA.length;i++){
            if(pushA[i] == popA[len-i]){
                count++;
                //System.out.println(count);
            }
        }
        count = count-1;
        if(count == len)
            bool = true;
        //System.out.println(count);
        return bool;
}
    public static void main(String[] args){
    	Solution s = new Solution();
    	int[] A={1,2,3,4,5};
    	int[] B={5,4,3,2,1};
    	System.out.println(IsPopOrder(A,B));
    	}
}
