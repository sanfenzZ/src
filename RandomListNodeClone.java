package src;
/*
 * ��Ŀ����
 * ����һ����������ÿ���ڵ����нڵ�ֵ���Լ�����ָ�룬
 * һ��ָ����һ���ڵ㣬��һ������ָ��ָ������һ���ڵ㣩�����ؽ��Ϊ���ƺ��������head��
 * ��ע�⣬���������벻Ҫ���ز����еĽڵ����ã�������������ֱ�ӷ��ؿգ�
 */
public class RandomListNodeClone {
	public class RandomListNode {
	    int label;
	    RandomListNode next = null;
	    RandomListNode random = null;
	 
	    RandomListNode(int label) {
	        this.label = label;
	    }
	}
	public RandomListNode Clone(RandomListNode pHead){
		if(pHead == null)
			return null;
		RandomListNode head = new RandomListNode(pHead.label);
		RandomListNode result = head;
		if(pHead.random != null)
			head.random = new RandomListNode(pHead.random.label);
		while(pHead.next != null){
			pHead = pHead.next;
			head.next = new RandomListNode(pHead.label);
			if(pHead.random != null)
				head.next.random = new RandomListNode(pHead.random.label);
			head = head.next;
		}
    return result;
	}
}	
