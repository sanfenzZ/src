package src;

import java.util.Stack;

/*
 * 题目描述
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */
public class PushAndPop {
	Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    
    public void push(int node) {
        s1.push(node);
    }
    
    public int pop() {
    	while(!s1.empty())
    		s2.push(s1.pop());
    	int result = s2.pop();
    	while(!s2.empty())
    		s1.push(s2.pop());
    	return result;
    }
}
