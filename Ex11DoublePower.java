package swordOffer;
/**
 * 面试题 11：数值的整数次方题目：实现函数 doublePower(double base， int exponent)，
 * 求 base 的 exponent次方。不得使用库函数，同时不需要考虑大数问题。
 *  
 * @author Stephen Huge
 *
 */
public class Ex11DoublePower {
	public static void main(String[] args) throws Exception {
		Ex11DoublePower dp = new Ex11DoublePower();
		System.out.println(dp.doublePower(2.3,	-1));
	}
	public double doublePower(double base, int exponent) throws Exception{
		if(base == 0.0 && exponent <= 0) {
			throw new Exception("0的非正数次幂没有意义");
		}
		return getPower(base, exponent);
	}
	
	private double getPower(double base, int exponent) {
		if(base == 0.0) {	//底数为0
			return 0.0;
		}
		if(exponent == 1) {	//指数为1
			return base;
		}
		if(exponent < 0) {	//指数为负
			return 1 / power(base, -exponent);
		}
		return power(base, exponent);
	}
	
	private double power(double base, int exponent) {
		for(int i = 1; i < exponent; i++) {
			base *= base;
		}
		return base;
	}
}
