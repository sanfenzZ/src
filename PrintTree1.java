package src;

import java.util.ArrayList;
import java.util.Stack;

/*
 * 题目描述
 * 请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class PrintTree1 {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		int line = 1;
		Stack<TreeNode> s1 = new Stack<TreeNode>();//把单行的放在这里
		s1.add(pRoot);
		Stack<TreeNode> s2 = new Stack<TreeNode>();//复数行
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		while(!s1.empty() || !s2.empty()){
			if(line % 2 != 0){
				ArrayList<Integer> temp = new ArrayList<Integer>();
				while(!s1.empty()){
					TreeNode node = s1.pop();
					if(node != null){
						temp.add(node.val);
						s2.add(node.left);
						s2.add(node.right);
					}
				}
				if(!temp.isEmpty()){
					list.add(temp);
					line++;
				}
			}else{
			ArrayList<Integer> temp = new ArrayList<Integer>();
			while(!s2.empty()){
				TreeNode node = s2.pop();
				if(node != null){
					temp.add(node.val);
					s1.add(node.right);
					s1.add(node.left);
				}
			}
			if(!temp.isEmpty()){
				list.add(temp);
				line++;
			}
			}
	}
		return list;
}
}
