package src;

import src.Convert4.TreeNode;

/*
 * 题目描述
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class IsBalanced_Solution1 {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	boolean bool = true;
	public boolean IsBalanced_Solution(TreeNode root) {
		getDepth(root);
		return bool;
	
	}
	//后序遍历
	public int getDepth(TreeNode root){
		if(root == null)
			return 0;
		int left = getDepth(root.left);
		int right = getDepth(root.right);
		if(Math.abs(right-left)>1)
			bool = false;
		return left>right?left+1:right+1;
		
	}
	public static void main(String[] args){
		int i=0,j=0;
		if(++i>0&&++j>0)
			System.out.println(i+j);
	
	}
}
