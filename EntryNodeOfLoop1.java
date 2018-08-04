package src;

import java.util.Stack;

/*
 * ��Ŀ����
 * һ�������а����������ҳ�������Ļ�����ڽ�㡣
 */
public class EntryNodeOfLoop1 {
	public class ListNode {
		    int val;
		    ListNode next = null;

		    ListNode(int val) {
		        this.val = val;
		    }
		}
	public ListNode EntryNodeOfLoop(ListNode pHead)
    {
		ListNode node = null;
		if(pHead == null)
        	return node;
		Stack stack = new Stack<>();
		while(pHead.next != null){
			node = pHead;
			if(stack.contains(node.val)){
				return node;
			}
			stack.add(node.val);
			pHead = pHead.next;
		}
		return null;
    }
}
