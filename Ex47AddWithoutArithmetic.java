package swordOffer;

import java.util.Scanner;

/**
 * 面试题 47：不用加减乘除做加法
 * 题目：写一个函数，求两个整数之和，要求在函数体内不得使用+、 -、 *、 /
 * 四则运算符号。
 * 思路：使用数电中的半加器实现
 * @author Stephen Huge
 * @date 2017年6月24日
 *
 */
public class Ex47AddWithoutArithmetic {
	public static void main(String[] args) {
		Ex47AddWithoutArithmetic awa = new Ex47AddWithoutArithmetic();
		
		Scanner sNum1 = new Scanner(System.in);
		Scanner sNum2 = new Scanner(System.in);
		
		try {
			int num1 = sNum1.nextInt();
			int num2 = sNum2.nextInt();
			int sum = awa.add(num1, num2);
			
			System.out.println("The sum is " + sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sNum1.close();
		sNum2.close();
	}
	public int add(int num1, int num2) {
		int sum, carry;
		
		while(true) {		//如果进位carry不为0，则将sum与carry再做相加直加到carry == 0为止
			sum = num1 ^ num2;	//sum是不进位的和，通过num1和num2异或得到
			carry = (num1 & num2) << 1;	//carry是num1与num2相加之后得到的进位
			num1 = sum;
			num2 = carry;
			if(carry == 0) {
				break;
			}
		}
		return sum;
	}
}
