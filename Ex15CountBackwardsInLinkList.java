package swordOffer;


/**
 * 面试题 15：链表中倒数第 k 个结点
 * 题目：输入一个链表，输出该链表中倒数第 k 个结点。为了符合大多数人的习惯，本题从
 * 1开始计数，即链表的尾结点是倒数第一个结点。例如一个有 6 个结点的链表，从头结点
 * 依次是 1,2,3,4， 5,6。倒数第三个结点就是值为 4 的结点。
 * 
 * @author Stephen Huge
 *
 */
public class Ex15CountBackwardsInLinkList {

	public static void main(String[] args) {
		Ex15CountBackwardsInLinkList cbwill = new Ex15CountBackwardsInLinkList();		
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		ListNode sol = cbwill.countBackwardsInLinkList(a, 2);
		System.out.println(sol.getClass().getSimpleName());
	}
	public ListNode countBackwardsInLinkList(ListNode node, int k) {
		if(node == null || k == 0) {
			return null;
		}
		ListNode temp = null;
		ListNode result = null;
		temp = node;
		for(int i = 0; i < k; i++) {
			if(temp.next != null) {
				temp = temp.next;
			}else{
				return null;
			}
		}
		result = node;
		while(temp.next != null) {
			temp = temp.next;
			result = result.next;
		}
		return result;
	}
	/*
	//用栈空间复杂度为O（n），时间复杂度为O（n），效率太低
	public ListNode countBackwardsInLinkList(ListNode node, int k) {
		if(node == null || k == 0) {
			return null;
		}
		Stack<ListNode> stack = new Stack<ListNode>();
		for(ListNode temp = node;temp.next != null; temp = temp.next) {
			stack.push(temp);
		}
		for(int i = 1; i < k; i++) {
			stack.pop();
		}
		return stack.peek();
	}*/
//	public class ListNode{
//		int data;
//		ListNode next;
//		
//		public ListNode(int data) {
//			this.data = data;
//		}
//	}
}
