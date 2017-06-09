package swordOffer;
/**
 * 面试题 12：打印 1 到最大的 n 位数题目：输入数字 n，按顺序打印出从 1 到
 * 最大的 n位进制数。比如输入3，则打印出 1、 2、 3 一直到 999.
 * 
 * @author Stephen Huge
 * 
 */

public class Ex12PrintNDigits {
	public static void main(String[] args) throws Exception {
		Ex12PrintNDigits pnd = new Ex12PrintNDigits();
		pnd.printNDigits(8);
	}
	public void printNDigits(int n) throws Exception{
		if(n < 0 || n > 8) {	//int型的数最大值是2147483647，是9位，不能超过这个数，所以n最大可以取到8
			throw new Exception("n的值不合法");
		}
		int num = 1;
		int count = 0;	
		while(count < n) {
			num *= 10;
			count++;
		}
		for(int i = 1; i < num; i++) {
			System.out.print(i + "\t");
			if(i % 10 == 0) {	//	每10个数换行
				System.out.println();
			}
		}
	}
}
