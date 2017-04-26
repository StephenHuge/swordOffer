package swordOffer;

/**
 * 这是剑指offer的第5题：
 * 输入一个链表的头结点，从尾到头反过来打印出每个结点的值。
 * @author Stephen Huge
 */
public class Ex05ReverseLinkList2 {	
	public static void main(String[] args) {
		//内部类的实例化方式
		Ex05ReverseLinkList2.Node a = new Ex05ReverseLinkList2().new Node("aaa");
		Ex05ReverseLinkList2.Node b = new Ex05ReverseLinkList2().new Node("bbb");
		Ex05ReverseLinkList2.Node c = new Ex05ReverseLinkList2().new Node("ccc");
		a.next = b;
		b.next = c;
		c.next = null;
		reverseLinkList2(a);
	}
	public static void reverseLinkList2(Node header) {		
		if(header.next != null) {	//递归调用
			reverseLinkList2(header.next);
		}		
		System.out.println(header.data.toString());	
	}
	public class Node{
		Node next;
		Object data;
		Node() {}
		Node(Object data) {
			this.data = data;
		}
	}
}
