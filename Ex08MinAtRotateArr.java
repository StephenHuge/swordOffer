package swordOffer;
/**
 * 这是剑指offer的第8题：旋转数组的最小数字
 * 题目描述：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的
 * 旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如数
 * 组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为 1。
 * 
 * @author Stephen Huge
 *
 */
public class Ex08MinAtRotateArr {
	public static void main(String[] args) {
		Ex08MinAtRotateArr mara = new Ex08MinAtRotateArr();
		int[] arr = {2, 3, 4, 5, 1};
//		int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1};
		int sol = mara.MinAtRotateArr(arr);
		System.out.println(sol);
	}
	public int MinAtRotateArr(int[] arr) {
		return  MinAtRotateArr(arr, 0, arr.length - 1);
	}
	private int MinAtRotateArr(int[] arr, int left, int right) {			
		int pivot = (left + right) / 2;
		if(arr[left] == arr[right]) {
			return iterateGet(arr);
		}
		if(left == pivot) {
			return arr[left + 1];
		}
		if(arr[left] < arr[pivot]) {
			left = pivot;
			pivot = (pivot + right) / 2;
		}
		if(arr[left] > arr[pivot]) {
			right = pivot;
			pivot = (pivot - left) / 2;
		}
		return MinAtRotateArr(arr, left, right);
		
	}
	// 数组左右数相同时，无法使用二分法判断，采用遍历判断
	private int iterateGet(int[] arr) {
		int result = arr[0];
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < result) {
				result = arr[i];
			}
		}
		return result;
	}
}
