package swordOffer;

public class ListNode {
	public int data;
	public ListNode next;
	
	public ListNode() {		
	}
	public ListNode(int data) {
		this.data = data;
	}
	public ListNode(int data, ListNode next) {
		this.data = data;
		this.next = next;
	}
	public ListNode addToTail(ListNode node) {
		return addToTail(this, node);
	}
	public ListNode addToTail(ListNode head, ListNode node) {
		if(head == null) {
			head = node;
		}
		if(head.next == null) {
			head.next = node;
		}
		ListNode temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
		return head;
	}
	
}
