package src;

/*
 * ��Ŀ����
 * ����һ�ö��������������ö���������ת����һ�������˫������Ҫ���ܴ����κ��µĽ�㣬ֻ�ܵ������н��ָ���ָ��
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
	//�������
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
