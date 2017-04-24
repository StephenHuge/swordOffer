package swordOffer;

public class Ex10NumOf1InBinary2 {
	public static void main(String args[]) {
		Ex10NumOf1InBinary2 test=new Ex10NumOf1InBinary2();
		System.out.println(test.numberOf1(2147483647));
	}
	public int numberOf1(long n) {
		int count=0;
		while(n!=0) {
			count++;
			n=(n-1) & n;
		}
		return count;
	}
}	