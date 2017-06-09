package swordOffer;

import java.util.Arrays;

/**
 * 这是剑指offer的第6题：输入二叉树的前序遍历和中序遍历的结果，重建出该二叉树。
 * 假设前序遍历和中序遍历结果中都不包含重复的数字，例如输入的前序遍历序列
 * {1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，重建出二叉树。
 * 
 * @author Stephen Huge
 * 
 */
public class Ex06RebuiltBT {
	public static void main(String[] args) throws Exception {
		int[] dlr = {1,2,4,7,3,5,6,8};	//前序遍历序列 
		int[] ldr = {4,7,2,1,5,3,8,6};	//中序遍历序列
		Ex06RebuiltBT rbt= new Ex06RebuiltBT();		
		BinaryNode bt = rbt.RebuiltBT(dlr, ldr);
		System.out.println();
		rbt.getLRD(bt);
	}
	//通过前序遍历序列和中序遍历序列重建二叉树
	public BinaryNode RebuiltBT(int[] dlr, int[] ldr) throws Exception {
//		if(dlr == null || ldr == null) {	//长度为0的数组不为空，这么判断会有data为0的结点产生
		if(dlr.length <= 0 || ldr.length <= 0) {	//可能产生空指针异常，因为数组可能未被实例化，
													//在这个例子中虽无此之虞，但仍应该注意
			return null;
		}
		if(dlr.length != ldr.length) {
			throw new Exception("序列长度不相等");
		}
		BinaryNode root = new BinaryNode();				
		for(int i = 0; i < dlr.length; i++) {
			if(ldr[i] == dlr[0]) {
				root.data = ldr[i];
				System.out.print(root.data + " ");
				 root.lChild = RebuiltBT(Arrays.copyOfRange(dlr, 1, i + 1), 
						 Arrays.copyOfRange(ldr, 0, i));
				 root.rChild = RebuiltBT(Arrays.copyOfRange(dlr, i + 1, dlr.length), 
						 Arrays.copyOfRange(ldr, i + 1, ldr.length));
			}
		}		
		return root;
	}
	//打印二叉树后序遍历序列
	public void getLRD(BinaryNode node) {
		if(node.lChild == null && node.rChild == null) {
			System.out.print(node.data + " ");	//打印叶结点
			return;
		}
		if(node.lChild != null) {
			getLRD(node.lChild);
		}
		if(node.rChild != null){
			getLRD(node.rChild);
		}
			System.out.print(node.data + " ");
	}
	
//	public class BinaryNode{
//		BinaryNode lChild;
//		BinaryNode rChild;
//		int data;
//	}
}
	

