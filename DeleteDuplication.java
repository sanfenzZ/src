package lab03;

import java.util.ArrayList;

/*
 * ��Ŀ����
 * ��һ������������У������ظ��Ľ�㣬��ɾ�����������ظ��Ľ�㣬�ظ��Ľ�㲻��������������ͷָ�롣
 *  ���磬����1->2->3->3->4->4->5 �����Ϊ 1->2->5

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
