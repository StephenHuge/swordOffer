package swordOffer;

import sortalgorthims.Tool;

/**
 * 面试题 14：调整数组顺序使奇数位于偶数前面
 * 题目：输入一个整数数组，实现一个函数来调整该函数数组中数字的顺序，使得
 * 所有奇数位于数组的前半部分，所有的数组位于数组的后半部分。
 * 
 * @author Stephen Huge
 *
 */
public class Ex14OrderOddEven {
	public static void main(String[] args) {
		Ex14OrderOddEven ooe = new Ex14OrderOddEven();
		int[] arr = {11,25,32,1,3,4,37,12,33,13,32,10,38,58,7,4,63,33,6,43,4,21,14,24,62,4,42,1};
		int[] b = ooe.orderOddEven(arr);
		Tool.printL(b);
	}
	public int[] orderOddEven(int[] arr) {
		if(arr == null || arr.length == 0) {
			return null;
		}
		int left = 0;
		int right = arr.length - 1;
		while(left < right) {
			while(left < right && !isEven(arr[left])) {	//遇到偶数停下
				left++;
			}
			while(left < right && isEven(arr[right])) {	//遇到奇数停下
				right--;
			}
			if(left < right) {
				swap(arr, left, right);
			}
		}
		return arr;
	}

	private void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;		
	}

	private boolean isEven(int i) {
		return i % 2 == 0;		
	}
}
