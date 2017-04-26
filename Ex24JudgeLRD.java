package swordOffer;
/**
 * 面试题 24：二叉搜索树的后序遍历序列
 * 题目：输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 是则返回true，否则返回false。
 * 
 * @author Stephen Huge
 * 
 */
import java.util.Arrays;

public class Ex24JudgeLRD {
	public static void main(String[] args) throws Exception {
//		int[] lrd = {5,7,6,9,11,3,10,8};
		int[] lrd = {8,8,8,8,8,8,8,8,8};
		System.out.println(judgeLRD(lrd));
	}
	public static boolean judgeLRD(int[] lrd) throws Exception {
		if(lrd == null || lrd.length == 0) {	//数组为null或者长度为0则抛出异常
			throw new Exception("数组输入失误");
		}	
		int len = lrd.length;
		if(len == 1) {	// 默认如果lrd长度为1，则符合规则，返回true
			return true;
		}
		int root = lrd[len - 1];
		int cut = 0;
		while(lrd[cut] < root && cut < len - 1) {	//将数组切成用cut两部分，左部分0到cut，右部分cut+1到len-2
			if(lrd[cut] == root) {	//不能有相等的值
				return false;
			}
			cut++;
		}
		int[] lTree = null;
		int[] rTree = null;
		boolean left = false;	//左子树是否符合规则
		boolean right = false;	//右子树是否符合规则
		if(cut != 0) {
			lTree = Arrays.copyOfRange(lrd, 0, cut);
			left = judgeLRD(lTree);
		}else{  //左子树为空，默认符合
			left = true;
		}
		if(cut != len -1) {
			rTree = Arrays.copyOfRange(lrd, cut, len - 1);
			for(int i = cut; i < len - 1; i++) {
				if(lrd[i] <= root) {
					return false;
				}
			}
			right = judgeLRD(rTree);
		}else{  //右子树为空，默认符合
			right = true;
		}		
		return left && right;	//左右子树均符合规则则返回true，否则返回false
	}
}		