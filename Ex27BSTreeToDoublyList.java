package swordOffer;

/**
 *面试题 27：二叉搜索树与双向链表
 *题目：输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求
 *不能创建任何新的结点，只能调整树中结点指针的指向。
 *
 *思路：找到每个结点的相邻结点即可
 * @author Stephen Huge
 * @date 2017年6月9日
 *
 */
public class Ex27BSTreeToDoublyList {
	public static void main(String[] args) {
		Ex27BSTreeToDoublyList bsttdl = new Ex27BSTreeToDoublyList();
		BSTree a = new BSTree(1);
		BSTree b = new BSTree(2);
		BSTree c = new BSTree(3);
		BSTree d = new BSTree(4);
		BSTree e = new BSTree(5);
		c.lChild = a;
		a.rChild = b;
		c.rChild = d;
		d.rChild = e;
		System.out.println("-------------------------------");
		BSTree min = bsttdl.convert(c, 1);
		BSTree max = bsttdl.convert(c, 2);
		printL(min);
		printR(max);
	}
	public BSTree convert(BSTree root, int number) {
		convert(root);
		if(number == 1) {
			return getMin(root);
		}
		if(number == 2) {
			return getMax(root);
		}
		return null;
	}
	private void convert(BSTree root) {
		if(root == null) {
			return;
		}
		BSTree rLChild = root.lChild;
		BSTree rRChild = root.rChild;
		findLeft(root);	
		findRight(root);	
		convert(rLChild);
		convert(rRChild);
		
	}
	private void findLeft(BSTree root) {

		if(root.lChild != null) {
			BSTree rLChild = root.lChild;
			BSTree rTemp = rLChild;
			while(rTemp.rChild != null) {	//找到root左结点的最右叶结点
				rTemp = rTemp.rChild;
			}
			root.lChild = rTemp;
			rTemp.rChild = root;
		} 
	}
	private void findRight(BSTree root) {

		if(root.rChild != null) {
			BSTree rRChild = root.rChild;
			BSTree rTemp = rRChild;
			while(rTemp.lChild != null) {	//找到root右结点的最左叶结点
				rTemp = rTemp.lChild;
			}
			root.rChild = rTemp;
			rTemp.lChild = root;
		}
	}
	private BSTree getMin(BSTree root) {
		if(root == null) {
			return null;
		}
		BSTree min = root;
		while(min.lChild != null) {
			min = min.lChild;
		}
		return min;
	}
	private BSTree getMax(BSTree root) {
		if(root == null) {
			return null;
		}
		BSTree max = root;
		while(max.rChild != null) {
			max = max.rChild;
		}
		return max;
	}
	private static void print(BSTree tree) {
		if(tree == null) {
			return;
		}
		System.out.println("data : " + tree.data);
	} 
	private static void printR(BSTree tree) {
		print(tree);
		printR(tree.rChild);
	}
	private static void printL(BSTree tree) {
		print(tree);
		printL(tree.lChild);
	}
	public static class BSTree {
		int data;
		BSTree lChild;
		BSTree rChild;
		public BSTree(int data) {
			this.data = data;
		}
	}
}
