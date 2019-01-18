/*
 * 4002 SquareOfDigits
 * 
Description
����һ���������飬��ȡ���е�����������Σ��������������ĸ��ǵ�ֵ��ͬ��

Input Format
��һ��������n,m����ʾ��������������� ������n�У�ÿ��m��������ʾ�����Ԫ�ء�

�����Ԫ�ض�Ϊ���֣�0..9����n,m <= 50

Output Format
���һ��������ʾ�����������������ڵ�Ԫ�ظ���

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
		
		 //�����ж���Խ��,Խ������С�߳�
		if (i + m -1 == row) 
			return Find(matrix, m - 1, 0, 0, row, column);
		
		
		//�������ұ�����ƥ���򷵻��������ƥ��������һ�У���Խ��������һ�С�
		if (matrix[i][j] == (matrix[i][j + m - 1]) && matrix[i + m - 1][j] == (matrix[i][j]) && matrix[i][j + m - 1] == (matrix[i + m - 1][j + m - 1]))
				return m * m;
 
		else if (j + m == column) 
			return Find(matrix, m, i + 1, 0, row, column);
		else	
			return Find(matrix, m, i, j + 1, row, column);
 
	}
}
