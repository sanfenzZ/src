package src;

import java.util.ArrayList;
import java.util.Stack;

/*
 * ��Ŀ����
 * ��ʵ��һ����������֮���δ�ӡ������������һ�а��մ����ҵ�˳���ӡ���ڶ��㰴�մ��������˳���ӡ�������а��մ����ҵ�˳���ӡ���������Դ����ơ�
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
		Stack<TreeNode> s1 = new Stack<TreeNode>();//�ѵ��еķ�������
		s1.add(pRoot);
		Stack<TreeNode> s2 = new Stack<TreeNode>();//������
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
