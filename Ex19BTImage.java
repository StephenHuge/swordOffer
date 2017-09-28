package swordOffer;
/**
 * 这是剑指offer的第19题：二叉树的镜像
 * 题目：请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 * 
 * @author Stephen Huge
 *
 */
public class Ex19BTImage {
	public static void main(String[] args) throws Exception {	
		int[] dlr = {1,2,4,7,3,5,6,8};	//前序遍历序列 
		int[] ldr = {4,7,2,1,5,3,8,6};	//中序遍历序列
		Ex06RebuiltBT rbt= new Ex06RebuiltBT();		
		BinaryNode bt = rbt.RebuiltBT(dlr, ldr);
		System.out.println();
		Ex19BTImage bti = new Ex19BTImage();
		BinaryNode bt2 = bti.BTImage(bt);
		Ex23PrintBTByRow.printBTByRow(bt2);
		
	}
	public BinaryNode BTImage(BinaryNode node) {
		if(node == null) {
			return null;
		}
		if(node.lChild == null && node.rChild == null) {
			return node;
		}
		//更换左右子结点
		BinaryNode temp = node.lChild;
		node.lChild = node.rChild;
		node.rChild = temp;
		//不断向下递归，获得镜像二叉树
		BTImage(node.lChild);
		BTImage(node.rChild);
		return node;
	}
}
