package swordOffer;

import java.util.Scanner;

/**
 *面试题 28：字符串的排列
 *题目：输入一个字符串，打印出该字符串中字符的所有排列。
 *
 * @author Stephen Huge
 * @date 2017年6月12日
 *
 */
public class Ex28StringPermutation {
	public static void main(String[] args) {
//        String str = "";
//          
//        Scanner scan = new Scanner(System.in);
//          
//        str = scan.nextLine();
		String str = "abcd";
		permutation(str.toCharArray(), 0);
	}

	public static void permutation(char[] str, int i) {
		if (i >= str.length) {
			return;
		}
		if (i == str.length - 1) {
			System.out.println(String.valueOf(str));
		} else {
			for (int j = i; j < str.length; j++) {
				char temp = str[j];
				str[j] = str[i];
				str[i] = temp;

				permutation(str, i + 1);

				temp = str[j];
				str[j] = str[i];
				str[i] = temp;
			}
		}
	} 
}
