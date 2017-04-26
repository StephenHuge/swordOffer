package swordOffer;

/**
 * 面试题 16：反转链表
 * 题目：定义一个函数，输入一个链表的头结点，反转该链表并输出
 * 反转后链表的头结点。
 * 
 * @author Stephen Huge
 *
 */
public class Ex16ReverseList {
	
	public static void main(String[] args) {
		Ex16ReverseList rl = new Ex16ReverseList();
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		a.next = b;
		b.next = c;
		c.next = d;
		rl.reverseList(a);
		
	}
//	public ListNode reverseList(ListNode current) {
//		ListNode nPrev = null;
//		ListNode nNext = null;
//		while(current != null) {
//			nNext = current.next;
//			current.next = nPrev;
//			nPrev = current;
//			current = nNext;
//		}
//		return nPrev;
//	}
/*	//a piece of shit from myself	
  	public ListNode reverseList(ListNode header) {
		if(header == null) {
			return null;
		}
		if(header.next == null) {
			return header;
		}
		ListNode temp = header.clone();
		temp.next = null;
		ListNode reverseHeader = temp;
		
		while(header.next != null) {
			temp = header.next.clone();
			temp.next = reverseHeader;
			reverseHeader = temp;	
			header = header.next;
		}
		return reverseHeader;
	}
	public static class ListNode implements Cloneable{
		int data;
		ListNode next;
		
		public ListNode() {
		}
		public ListNode(int data) {
			this.data = data;
		}
		
		@Override
		public ListNode clone() {
			ListNode temp = null;
			try {
				temp = (ListNode)super.clone();
			} catch (Exception e) {
			}
			return temp;
		}
	}*/
//		//递归方式
	public ListNode reverseList(ListNode current)  
	 {  
	     if (current == null || current.next == null) 
	    	 return current;  
	     ListNode nextNode = current.next;  
	     current.next = null;  
	     ListNode reverseRest = reverseList(nextNode);  
	     nextNode.next = current;  
	     return reverseRest;  
	 } 
}
