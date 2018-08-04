package src;

/*
 * 题目描述
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */
public class Convert4 {
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	TreeNode head = null;
	TreeNode realhead = null;
	public TreeNode Convert(TreeNode root) {
        ConvertSub(root);
        return realhead;
    }
	//中序遍历
	public void ConvertSub(TreeNode root){
		if(root == null)
			return ;
		ConvertSub(root.left);
		if(head == null){
			head = root;
			realhead = root;
		}else{
			head.right = root;
			root.left = head;
			head = root;
		}
		ConvertSub(root.right);
	}
}
