package swordOffer;

import linearlist.LinkList;
import stack.*;
/**
 * 这是剑指offer的第5题：
 * 输入一个链表的头结点，从尾到头反过来打印出每个结点的值。
 * @author Stephen Huge
 */
public class Ex05ReverseLinkList {
	public static void main(String[] args) {
		LinkList<String> list = new LinkList<String>("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		System.out.println(list.toString());
		LinkStack<String> reverse = reverseLinkList(list);		
		System.out.println(reverse.toString());		
	}
	/**
	 * 一个利用栈反转链表的方法。
	 * @param list 要反转的链表
	 * @return 反转之后得到的链栈
	 */
	public static LinkStack<String> reverseLinkList(LinkList<String> list) {
		if(list.isEmpty()) {
			return null;
		}else{
			LinkStack<String> temp = new LinkStack<String>();
			String next;
			for(int i = 0; i < list.length(); i++) {
				next = list.get(i); 
				if(next != null) {
					temp.push(next);
				}
			}
			return temp;
		}					
	}
}
