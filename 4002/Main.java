/*
 * 4002 SquareOfDigits
 * 
Description
给你一个矩形数组，获取其中的最大子正方形，该正方形满足四个角的值相同。

Input Format
第一行两个数n,m，表示矩阵的行数和列数 接下来n行，每行m个数，表示矩阵的元素。

矩阵的元素都为数字（0..9），n,m <= 50

Output Format
输出一个数，表示符合条件的正方形内的元素个数

Sample Input
1 2
1 1
Sample Output
1
 
 * */

import java.util.Scanner;
 
public class Main {
 
	@SuppressWarnings("resource")
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int column = sc.nextInt();
		int [][] matrix = new int[row][column];
 
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		

		System.out.println(Find(matrix, Math.min(row, column) , 0, 0, row, column));
 
	}
 
	private static int Find(int matrix[][], int m, int i, int j, int row, int column) { 
		
		if (m == 1)
			return 1;
		
		 //优先判断下越界,越界则缩小边长
		if (i + m -1 == row) 
			return Find(matrix, m - 1, 0, 0, row, column);
		
		
		//从左往右遍历，匹配则返回面积，不匹配则右移一行，右越界则下移一行。
		if (matrix[i][j] == (matrix[i][j + m - 1]) && matrix[i + m - 1][j] == (matrix[i][j]) && matrix[i][j + m - 1] == (matrix[i + m - 1][j + m - 1]))
				return m * m;
 
		else if (j + m == column) 
			return Find(matrix, m, i + 1, 0, row, column);
		else	
			return Find(matrix, m, i, j + 1, row, column);
 
	}
}
