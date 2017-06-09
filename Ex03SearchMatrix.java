package swordOffer;

import sortalgorthims.Tool;

/**
 * 这是剑指offer的第3题：
 * 一个二维数组，每一行从左到右递增，每一列从上到下递增．输
 * 入一个二维数组和一个整数，判断数组中是否含有整数。
 * @author Stephen Huge
 */

public class Ex03SearchMatrix {
	public static void main(String[] args){
		int[][] a = Tool.getRandomMatrix2(2, 2);
		for(int i=0; i<a.length; i++)
			Tool.print(a[i]);
		boolean b = searchMatrix(a, 4);
		Tool.print(b+"");
	}

	/**
	 * 在{@code int}型二维数组寻找{@code int}型变量s是否存在，存在返回{@code true}，否则返回{@code false}；
	 * @param a {@code int}型二维数组
	 * @param s 要寻找的{@code int}型变量
	 * @return 如果数组a中存在s，则返回{@code true}，否则返回{@code false}
	 */
	public static boolean searchMatrix(int[][] a, int s){
		if (a==null)	return false;
		int col = a[0].length-1;		//列数
		int row = 0;					//行数
		while(col>=0 && row<a.length){
			if (a[row][col]==s)	return true;
			if (a[row][col]>s)		
				col--;
			else
				row++;		
		}
		return false;	
	}
}		
		/*	//错误的方法
		if (a==null)	return false;	
		
		int col = a.length-1;		//行数
		int row = a[0].length-1;	//列数
		if (a[col][row]<s)	return false;
		while(true){
			while(col > row){			//行数大于列数，按行搜索			
				col /= 2;
				if (a[col][row]==s)	return true;
				if (a[col][row] > s)	break;
				else{
					col += col/2;
					if(a[col][0]>s)	break;
					if (a[col][row]==s)	return true;
					break;
				}
				
			}
			while(col < row ){			//行数小于列数，按列搜索			
				row /= 2;
				if (a[col][row]==s)	return true;
				if (a[col][row]>s)	break;
				else{
					row += row/2;
					if(a[0][row]>s)	break;
					if (a[col][row]==s)	return true;
					break;
				}
			}
		}
*/	

