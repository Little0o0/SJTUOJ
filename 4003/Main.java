/*
getMinBottles
Description
你有n个初始装水1L的瓶子。你可以将两个包含同样多水的瓶子合并为一个瓶子，水量为两个瓶子的和。 我希望最终剩下k个瓶子，但这可能是无法做到的。 但你还可以购进若干个初始装水1L的瓶子，这样就能通过上面的操作达到要求。 试问，最少需要购进多少个瓶子。

Input Format
一行两个正整数n,k (n<=100000000, k<=1000, 30%数据k=1)

Output Format
一行一个整数，表示最少需要购进多少个瓶子数

Sample Input
4 1
Sample Output
0

*/

import java.util.Scanner;
import java.util.Vector;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();  //n , k 与题中所给含义相同
		int k = sc.nextInt();
		
		int n_copy = n, sim = 0, ans = 0; //n_copy是用来恢复后面的n sim是不加瓶子能最简化个数 , ans是输出

		if (n <= k)
			System.out.println(k - n);//注意这种情况下, 在瓶子不够要求的时候需要补瓶子
		else {


			do {
				if ((n & 1) == 1)
					sim++;
			} while ((n >>= 1) != 0);    
			if (sim <= k)
				System.out.println(0);	//在最简化瓶子数小于要求时, 不需要加瓶子


			/*否则，选出还需要合并多少个瓶子，计算简化水量，
			比如：倘若还需要合并两个瓶子，则用倒数第三多的瓶子
			中的水减去比它少的瓶子即为还需要的瓶子数 
		*/

			else {
				n = n_copy;
				for (int i = 1, j = 0; j <= sim - k; i <<= 1) {  

					if ((n & 1) == 1)					
						j += 1;
					else
						ans += i;

					n >>= 1;
				}
				System.out.println(ans+1); 
			}
		}
	}
}
