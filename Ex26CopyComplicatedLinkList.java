package swordOffer;

/**
 *面试题 26：复杂链表的复制
 *题目：实现函数复制一个复杂链表。在复杂链表中，每个结点除了有一个 next
 *指针指向下一个结点外，还有一个指向链表中任意结点或 null。
 *
 * @author Stephen Huge
 * @date 2017年6月9日
 *
 */
public class Ex26CopyComplicatedLinkList { 
	
	public static void main(String[] args) {
		Ex26CopyComplicatedLinkList ccll = new Ex26CopyComplicatedLinkList();
		ComplicatedLinkList a = new ComplicatedLinkList(1);
		ComplicatedLinkList b = new ComplicatedLinkList(2);
		ComplicatedLinkList c = new ComplicatedLinkList(3, b, a);
		ComplicatedLinkList d = new ComplicatedLinkList(4, c, null);
		ComplicatedLinkList list = new ComplicatedLinkList(5, d, c);
		@SuppressWarnings("unused")
		ComplicatedLinkList answer = ccll.copyComplicatedLinkList(list);
	}
	public ComplicatedLinkList copyComplicatedLinkList(ComplicatedLinkList list) {
		if(list == null) {
			return null;
		}
		ComplicatedLinkList copied = new ComplicatedLinkList();
		copied.data = list.data;
		copied.next = copyComplicatedLinkList(list.next);
		copied.another= copyComplicatedLinkList(list.another);
		return copied;
	}
	
	public static class ComplicatedLinkList {
		int data;
		ComplicatedLinkList next;
		ComplicatedLinkList another;
		public ComplicatedLinkList() { }
		public ComplicatedLinkList(int data) {
			this.data = data;
		}
		public ComplicatedLinkList(int data, 
				ComplicatedLinkList next, ComplicatedLinkList another) {
			this.data = data;
			this.next = next;
			this.another = another;
		}
	}
} 