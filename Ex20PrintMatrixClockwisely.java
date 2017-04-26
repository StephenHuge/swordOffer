package swordOffer;
/**面试题 20：顺时针打印矩阵
 * 题目：输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字。
 * 
 * @author Stephen Huge
 * @date 17/04/22
 */
public class Ex20PrintMatrixClockwisely {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		int[][] array={{1,2,3,4,5},{5,6,7,8,9},{9,10,11,12,13},{13,14,15,16,17},{17,18,19,20,21},{21,22,23,24,25}};
//		int[][] array = {{1,2,3,4,5}};
		int[][] array = {{1},{2},{3},{4},{5}};
		Ex20PrintMatrixClockwisely pmcw = new Ex20PrintMatrixClockwisely();
		pmcw.printMatrixClockwisely(array);
	}
	public void printMatrixClockwisely(int[][] a) {
		if(a == null) {
			return;
		}
		int up = 0;
		int down = a.length - 1;//每列的行数
		int left = 0;
		int right = a[0].length - 1;//每行的列数

		if(up == down) {//行数为1
			for(int i = 0; i <= right; i++) {
				System.out.print(a[0][i] + " ");
			}
		}else if(left == right) {//列数为1
			for(int i = 0; i <= down; i++) {
				System.out.print(a[i][0] + " ");
			}
		}else{
			while(left < right && up < down) {
				if(left < right) {//第一横
					for(int i = left; i <= right; i++) {
						System.out.print(a[up][i] + " ");
					}
					up++;
				}
				if(up < down) {//第一竖
					for(int j = up; j <= down; j++) {
						System.out.print(a[j][right] + " ");
					}
					right--;
				}
				if(left < right) {//第二横
					for(int k = right; k >= left; k--) {
						System.out.print(a[down][k] + " ");
					}
					down--;
				}
				if(up < down) {//第二竖
					for(int l = down;l >= up; l--) {
						System.out.print(a[l][left] + " ");
					}
					left++;
				}
			}			
		}
	}
}
