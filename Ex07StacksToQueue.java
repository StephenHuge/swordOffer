package swordOffer;

import java.util.Stack;

/**
 * 这是剑指offer的第7题：
 * 用两个栈实现一个队列，实现对了的两个函数 appendTail 和deleteHead，
 * 分别完成在队列尾插入结点和在队列头部删除结点的功能。
 * @author Stephen Huge
 */
public class Ex07StacksToQueue<T> {
	private Stack<T> stack1 = new Stack<T>();
	private Stack<T> stack2 = new Stack<T>();
	
	/**
	 * 往队列尾添加新的元素，添加成功返回true，添加失败返回false
	 * @return 添加成功返回true，添加失败返回false
	 */
	public boolean appendTail(T element) {
		if(!stack1.isEmpty() && !stack2.isEmpty()) {
			return false;			
		}else if(!stack1.isEmpty()) {
			stack1.push(element);
			return true;		
		}else{
			stack2.push(element);
			return true;
		}		
	}
	/**
	 * 队头元素出队，出队成功则返回出队的元素，出队失败则抛出异常"failed"
	 * @return 出队成功则返回出队的元素
	 * @throws Exception 出队失败则抛出异常"failed"
	 */
	public T deleteHead() throws Exception{
		if(!stack1.isEmpty() && stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
			return stack2.pop();
		}else if(!stack2.isEmpty() && stack1.isEmpty()) {
			while(!stack2.isEmpty()) {
				stack1.push(stack2.pop());
			}
			return stack1.pop();
		}
		throw new Exception("failed");		
	}
	
	public static void main(String[] args) throws Exception {
		Ex07StacksToQueue<String> stq = new Ex07StacksToQueue<>();
		stq.appendTail("aaa");
		stq.appendTail("bbb");
		stq.appendTail("ccc");
		stq.deleteHead();
	}
}
