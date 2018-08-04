package src;

/*
 * ��Ŀ����
 * ��ʵ��һ�������������ж�һ�Ŷ������ǲ��ǶԳƵġ�ע�⣬���һ��������ͬ�˶������ľ�����ͬ���ģ�������Ϊ�ԳƵġ�
 */
public class IsSymmetrical1 {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	public boolean isSymmetrical(TreeNode pRoot)
    {	
		if(pRoot == null)
			return false;
		return Symmetrical(pRoot.left,pRoot.right);
	}
	private boolean Symmetrical(TreeNode left, TreeNode right) {
		if(left == null) return right == null;
		if(right == null) return false;
		if(left.val != right.val) return false;
		return Symmetrical(left.left, right.right)&&Symmetrical(left.right, right.left);
		
	}
}
