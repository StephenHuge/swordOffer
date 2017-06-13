package swordOffer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 这是剑指offer的第23题：从上往下打印二叉树的每个结点，同一层的结点按照从左到右的顺序打印。
 * @author Stephen Huge
 *
 */
public class Ex23PrintBTByRow {
	public static void main(String[] args) throws Exception {
//		int[] dlr = {1,2,4,7,3,5,6,8};	//前序遍历序列 
//		int[] ldr = {4,7,2,1,5,3,8,6};	//中序遍历序列
//		Ex06RebuiltBT rbt= new Ex06RebuiltBT();		
//		BinaryNode bt = rbt.RebuiltBT(dlr, ldr);
//		System.out.println();
		BinaryNode a = new BinaryNode(2);
		BinaryNode b = new BinaryNode(3);
		BinaryNode c = new BinaryNode(4);
		BinaryNode d = new BinaryNode(5);
		BinaryNode e = new BinaryNode(6);
		BinaryNode bt = new BinaryNode(1, a, b);
		a.lChild = c;
		c.lChild = d;
		d.rChild = e;
		printBTByRow(bt);
	}
	
	public static void printBTByRow(BinaryNode root) {
		if(root == null) {
			return;
		}
		Queue<BinaryNode> q = new LinkedList<BinaryNode>();
		BinaryNode last = root;
		q.add(root);
		while(!q.isEmpty()) {
			BinaryNode node = q.poll();
			System.out.print(node.data + " ");
			if(node == last) {
				System.out.println();
			}
			if(node.lChild != null) {
				q.add(node.lChild);
				//记录last操作
				if(node == last && node.rChild == null) {
					last = node.lChild;
				}
			}
			if(node.rChild != null) {
				q.add(node.rChild);	
				//记录last操作
				if(node == last) {
					last = node.rChild;
				}
				
			}
		}
	}

//	public class BinaryNode{
//		BinaryNode lChild;
//		BinaryNode rChild;
//		int data;
//	}
}
