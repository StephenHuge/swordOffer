package swordOffer;

import java.util.Stack;

/**
 *面试题 25：二叉树中和为某一值的路径
 *题目：输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
 *从树的根节点开始往下一直到叶结点所经过的结点形成一条路径
 *
 * @author StephenHuge
 *
 * @date 2017年5月20日
 */
public class Ex25PathOfNumInBiTree {
	public static void main(String[] args) {
		BinaryNode bt=new BinaryNode();
		BinaryNode node1=new BinaryNode();
		BinaryNode node2=new BinaryNode();
		BinaryNode node3=new BinaryNode();
		BinaryNode node4=new BinaryNode();
		bt.lChild=node1;
		bt.rChild=node2;
		node1.lChild=node3;
		node1.rChild=node4;
		bt.data=10;
		node1.data=5;
		node2.data=12;
		node3.data=4;
		node4.data=7;
		Ex25PathOfNumInBiTree ponubt = new Ex25PathOfNumInBiTree();
		int sum = 22;
//		int sum = 19;
		ponubt.pathOfNumInBiTree(bt, sum);
	}
	public void pathOfNumInBiTree(BinaryNode bt, int sum) {
		if(bt == null) {
			return;
		}
		int currentSum = 0;
		Stack<Integer> stack = new Stack<Integer>();
		pathOfNumInBiTree(bt, sum, stack, currentSum);
	}
	private void pathOfNumInBiTree(BinaryNode bt, int sum, Stack<Integer> stack, int currentSum) {
		currentSum += bt.data;
		stack.push(bt.data);
		if(bt.lChild == null && bt.rChild == null) {
			if(currentSum == sum) {
				System.out.println("Find one path: ");
				for(int path : stack) {
					System.out.print(path + " ");
				}
				System.out.println();
			}
		}
		if(bt.lChild != null) {
			pathOfNumInBiTree(bt.lChild, sum, stack, currentSum);
		}
		if(bt.rChild != null) {
			pathOfNumInBiTree(bt.rChild, sum, stack, currentSum);
		}
		stack.pop();
	}
}
