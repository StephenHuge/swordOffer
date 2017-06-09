package swordOffer;
/**
 * 面试题 9：斐波那契数列
 * 题目：写一个函数，输入 n，求斐波那契数列的第 n 项。
 * 
 * @author Stephen Huge
 *
 */
public class Ex09Fibonacci {
	public static void main(String[] args) {
		//long类型变量占4个字节，的取值范围-2,147,483,648到2,147,483,647，在此n最大能取到46，
		//也就是斐波那契数列的第46项：1,836,311,903，到第47项为2,971,215,073，大于long最大取值
		long a = fibonacci(46);
		System.out.println(a);
	}
	public static long fibonacci(int n) {
		int a = 0;	
		int b = 1;
		int res = 1;
//		if(n == 1) {
//			System.out.print(res + "\t");
//		}
		for(int i = 1; i < n; i++) {
//			if(i == 1) {
//				System.out.print(res + "\t");
//			}
			res = b + a;
			a = b;
			b = res;			
//			System.out.print(res + "\t");
//			if((i + 1) % 10 == 0) {
//				System.out.println();
//			}
		}
		return res;
	}
	//	递归实现，效率十分低下
	public static long f(int n) {
		return n > 2 ? f(n - 1) + f(n - 2) : 1;
	}
}
