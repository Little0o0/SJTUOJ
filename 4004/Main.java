/**
 * 
 * Triangle
Description:
我们都知道著名的杨辉三角形，对于第i行第j个数f(i,j) = f(i-1, j-1) + f(i-1, j)。

1

1 1

1 2 1

1 3 3 1

1 4 6 4 1

1 5 10 10 5 1

...

现在zyx想稍微改变一下这个三角形的初始条件，第一行有三个数都是1，其后每一行的数字仍然是f(i,j) = f(i-1, j-1) + f(i-1, j)

1 1 1

1 2 2 1

1 3 4 3 1

1 4 7 7 4 1

1 5 11 14 11 5 1

...

zyx想知道第n行中最大的数是多少,希望你能够帮帮他。

Input format：
一个整数n

Output format：
一个整数，第n行最大的数

Sample Input：
3
Output Sample
4
数据规模
对于30%的数据，n<=15 对于100%的数据，n<=63
 */
 

//其实就是三个 杨辉三角 错位相加，只要用 杨辉三角 中最大的数（偶数个第一个最大）和相邻两个数相加即可
//根据杨辉三角中 ， n行m列的数为C(m-1 , n-1) , 而第n行中最大数的列数应为 (n+1)/2 向下整 ，所以杨辉三角n行最大数为 C((n+1)/2 -1 ,n-1 )
// 所以最后的结果为 C((n+1)/2 -2 , n-1) + C( (n+1)/2 - 1 , n - 1) + C( (n+1)/2, n - 1 ) 

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(C((n + 1) / 2 - 2, n - 1).add(C((n + 1) / 2 - 1, n - 1).add(C((n + 1) / 2, n - 1))));

	}

	private static BigInteger C(int m, int n) {  //组合数 ，防止溢出用大数类
		BigInteger tmp = new BigInteger(1 + "");

		for (int i = 0; i < m; i++)
			tmp = tmp.multiply(new BigInteger((n - i) + ""));

		for (int i = 0; i < m; i++)
			tmp = tmp.divide(new BigInteger((m - i) + ""));

		return tmp;
	}
}
