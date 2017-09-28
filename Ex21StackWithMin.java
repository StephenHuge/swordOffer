package swordOffer;

import java.util.Stack;

/**
 *面试题 21：包含 min 函数的栈
 *题目：定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的min函数。在
 *该栈中，调用min、push及pop的时间复杂度都是O(1)。
 *
 * @author userhjs
 *
 * @date 2017年4月26日
 */
public class Ex21StackWithMin {
	
	public static void main(String[] args) {
		Ex21StackWithMin swm = new Ex21StackWithMin();
		swm.push(5);
		swm.push(4);
		swm.push(3);
		swm.push(2);
		swm.push(1);
		
		System.out.println(swm.min());
		swm.pop();
		System.out.println(swm.min());
		swm.pop();
		System.out.println(swm.min());
		swm.pop();
		System.out.println(swm.min());
		swm.pop();
		System.out.println(swm.min());
	}
	
	private Stack<Integer> min = new Stack<Integer>();
	
	private Stack<Integer> data = new Stack<Integer>();
	
	public Ex21StackWithMin(){
	}
	
	public Integer push(Integer num) {
		data.push(num);
		if(min.empty() || num <= min.peek()) {
			min.push(num);
		}else {
			min.push(min.peek());
		}
		return Integer.valueOf(-1);
	}
	
	public Integer pop() {
		min.pop();
		return data.pop();
	}
	
	public Integer peek() {
		return min.peek();
	}
	
	public boolean empty() {
		return data.empty();
	}
	
	public Integer min() {
		return min.peek();
	}
	
}
