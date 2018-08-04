package lab03;

import java.util.ArrayList;

/*
 * 题目描述
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针。
 *  例如，链表1->2->3->3->4->4->5 处理后为 1->2->5

public class ListNode {
   int val;
   ListNode next = null;

   ListNode(int val) {
       this.val = val;
   }
}

public class DeleteDuplication {
	    public ListNode deleteDuplication(ListNode pHead)
	    {
	    	ListNode p = pHead;
	    	ListNode first = new ListNode(-1);
	    	first.next = pHead;
	    	ListNode last = first; 
	    	
	    	while(p != null && p.next != null){
	    		if(p.val == p.next.val){
	    			int numval = p.val;
	    			while(p!=null&&p.val == numval)
	    				p = p.next;
	    			last.next = p;
	    		}else{
	    			last = p;
	    			p = p.next;
	    		}
	    		
	    	}
	    return first.next;
	    }
}*/
