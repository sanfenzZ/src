package lab03;

/*
 * ��Ŀ����
 * ����һ�Ŷ��������������ҳ����еĵ�k��Ľ�㡣
 * ���磬    5 
 * 		/ \ 
 * 	   3   7 	
 * 	  / \ /\ 
 * 	  2 4 6 8 �У��������ֵ��С˳�����������ֵΪ4��
 */
public class KthNode1 {
	public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
	int index = 0;
	TreeNode KthNode(TreeNode pRoot, int k)
    {
		if(pRoot != null){
			TreeNode temp = KthNode(pRoot.left, k);
			if(temp != null)  
				return temp;
			index++;
			if(index == k)
				return pRoot;
			temp = KthNode(pRoot.right, k);
			if(temp != null)
				return temp;
		}
		return null;    
    }
}
