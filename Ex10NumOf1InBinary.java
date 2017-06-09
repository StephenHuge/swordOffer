package swordOffer;
/**
 * 剑指offer第10题
 * 题目：请实现一个函数，输入一个整数，输出该数二进制表示中 1 的个数。例如
 * 把 9 表示成二进制是 1001；有 2 位是 1，因此如果输入 9，函数输出 2.
 * 
 * @author Stephen Huge
 *
 */
public class Ex10NumOf1InBinary {
	public static void main(String[] args) {
		Ex10NumOf1InBinary nob = new Ex10NumOf1InBinary();
		int ans = nob.numOf1InBinary(2147483647);
		System.out.println(ans);
	}
	public int numOf1InBinary(long num) {
		if(num < 0 || num > Long.MAX_VALUE) {
			return -1;
		}
		int count = 0;
		if(num % 2 == 0) {
			count++;
		}
		while(num >= 1) {
			if(num % 2 != 0) {
				count++;
			}
			num /= 2;
		}
		return count;
	}
}
