package swordOffer;

import java.util.Stack;

/**
 *面试题 22：栈的压入、弹出序列
 *题目：输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出序列。
 *假设压入栈的所有数字均不相等。例如压栈序列为 1、 2、3、 4、 5.序列 4、 5、 3、 2、 1 是
 *压栈序列对应的一个弹出序列，但 4、 3、 5、 1、2 却不是。
 * @author StephenHuge
 *
 * @date 2017年4月26日
 */
public class Ex22StackPushPopOrder {
	public static void main(String[] args) {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {4,3,5,2,1};
		Ex22StackPushPopOrder sppo = new Ex22StackPushPopOrder();
		System.out.println(sppo.stackPushPopOrder(arr1, arr2));
	}
	public boolean stackPushPopOrder(int[] arr1, int[] arr2) {
		Stack<Integer> s = new Stack<Integer>();
		int p1 = 0;	//arr1的下标
		int p2 = 0;	//arr2的下标
		s.push( arr1[ p1++ ] );
		while(p2 < arr2.length - 1) {
			while(s.peek() != arr2[p2]) {
				if(p2 < arr2.length - 1) {
					s.push( arr1[ p1++ ] );
				}else{
					return false;
				}
			}
			while(s != null && s.peek() == arr2[p2]) {
				s.pop();
				p2++;	
			}	
		}
		return true;
//		if(line1 == null || line2 == null){
//			return false;
//		}
//		int point1 = 0;
//		Stack<Integer> stack = new Stack<Integer>();
//		for(int i = 0; i < line2.length; i++) {
//			if(!stack.isEmpty() && stack.peek() == line2[i]) {//
//				stack.pop();
//			}else{
//				if(point1 == line1.length) {
//					return false;
//				}else{
//					do{
//						stack.push(line1[point1++]);
//					}while(stack.peek() != line2[i] && point1 != line1.length);
//					if(stack.peek() == line2[i]) {
//						stack.pop();
//					}
//					else{
//						return false;						
//					}
//				}
//			}
//		}
//		return true;
	}
}
