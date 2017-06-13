package swordOffer;

import java.util.Scanner;
/**
 * 面试题 46：求 1+2+...+n
 * 题目：求 1+2+...+n,要求不能用除法、 for、 while、 if、 else、 switch、 case
 * 等关键字及条件判断语句（ A?B:C）。
 * 
 * @author Stephen Huge
 * @date 17/04/22
 */
public class Ex46Sum {
	public static void main(String[] args){
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Input n:");
		int n = scan.nextInt();
		Ex46Sum su = new Ex46Sum();
		int sol = su.sum(n);
		System.out.println("Sum from 1 to n is " + sol);	
	}
//	public int sum(int n){
//		if(n <= 0) {
//			return -1;
//		}
//		if(n == 1) {
//			return 1;
//		}
//		if((n & 1) == 0) {//偶数
//			
//		}
//	}
	@SuppressWarnings("unused")
	public int sum(int n) {
		if(n <= 0) {
			return -1;
		}
		try{
			int[] array = new int[n-2];
			return n+sum(n-1);
		}
		catch(Exception e) {
			return 1;

		}
	}
}
