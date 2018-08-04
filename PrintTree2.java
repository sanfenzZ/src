package src;

import java.util.ArrayList;
import java.util.Stack;

/*
 * 题目描述
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 */
public class PrintTree2 {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
		Stack<TreeNode> s1 = new Stack<>();
		s1.push(pRoot);
		Stack<TreeNode> s2 = new Stack<>();
	    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	    
	    while(!s1.isEmpty() || !s2.isEmpty()){
	    	ArrayList<Integer> temp = new ArrayList<>();
	    	while(!s1.empty()){
	    		TreeNode node = s1.pop();
	    		if(node != null){
	    			temp.add(node.val);
	    			s2.add(node.left);
	    			s2.add(node.right);
	    		}
	    	}
	    	if(temp != null)
	    		list.add(temp);
            while(!s2.empty()){
                s1.push(s2.pop());
            }
    }
		return list;
}
}
