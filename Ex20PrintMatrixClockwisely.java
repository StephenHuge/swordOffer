package swordOffer;
/**面试题 20：顺时针打印矩阵
 * 题目：输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * 
 * @author Stephen Huge
 * @date 17/04/22
 */
public class Ex20PrintMatrixClockwisely {

	public static void main(String[] args) {
//		int[][] array = new int[3][0];
//		int[][] array = {{1,2,3,4,5}};
//		int[][] array = {{1},{2},{3},{4},{5}};
//		int[][] array = {{1,2,3},{2,3,4}};		
		int[][] array = {{1,2},{2,3},{3,4},{4,5},{5,6}};		
//		int[][] array = {{1,2,3},{2,3,4},{3,4,5}};
//		int[][] array={{1,2,3,4,5},{5,6,7,8,9},{9,10,11,12,13},{13,14,15,16,17},{17,18,19,20,21},{21,22,23,24,25}};
		Ex20PrintMatrixClockwisely pmcw = new Ex20PrintMatrixClockwisely();
		pmcw.printMatrixClociwisely(array);
	}
	public void printMatrixClociwisely(int[][] a) {
		if(a == null || a.length == 0 || (a.length > 0 && a[0].length == 0)) {
			System.out.println("Length error!");
			return;
		}
		
		int up = 0;
		int down = a.length - 1;	//每列的行数
		int left = 0;
		int right = a[0].length - 1;//每行的列数
		
		int rDir = 1;	// 行的方向变量，为1从左往右，为0从右往左打印
		int cDir = 1;	// 列的方向变量，为1从上往下，为0从下往上打印
		
		while(true) {
			if(left <= right) {
				if(rDir == 1) {
					printLR(a, left, right, up, down);
					up++;
					rDir = 0;
				}else {
					printRL(a, left, right, up, down);
					down--;
					rDir = 1;
				}	
			}else {
				System.out.println("left > right");
				return;
			}
			if(up <= down) {
				if(cDir == 1) {
					printUD(a, left, right, up, down);
					right--;
					cDir = 0;
				}else {
					printDU(a, left, right, up, down);
					left++;
					cDir = 1;			
				}	
			}else {
				System.out.println("up < down");
				return;
			}	
		}
	}
	private void printLR(int[][] a, int left, int right, int up, int down) {	//从左到右打印
		for(int i = left; i <= right; i++) {
			System.out.print(a[up][i] + " ");
		}
		System.out.print(". ");
	}
	private void printRL(int[][] a, int left, int right, int up, int down) {	//从右到左打印
		for(int i = right; i >= left; i--) {
			System.out.print(a[down][i] + " ");
		}
		System.out.print(". ");
	}
	private void printUD(int[][] a, int left, int right, int up, int down) {	//从上到下打印
		for(int i = up; i <= down; i++) {
			System.out.print(a[i][right] + " ");
		}
		System.out.print(". ");
	}
	private void printDU(int[][] a, int left, int right, int up, int down) {	//从下到上打印
		for(int l = down;l >= up; l--) {
		System.out.print(a[l][left] + " ");
	}
		System.out.print(". ");
	}
}
