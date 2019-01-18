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


这种算法下，依然还有一个数据没有通过，没有debug完
*/

import java.util.Scanner;
import java.util.Vector;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>(); //v用于储存水量对2的对数 , n与k与题目相对应
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong(); 	
		int k = sc.nextInt();

		//此处统计倘若不添加瓶子，能够最少合并为几个瓶子，并记录瓶子水量对2的对数
		int i = -1;
		do {
			i++;
			if (n % 2 == 1)
				v.add(i);
		} while ((n = (n >> 1)) != 0);

		//若最简化的瓶子数小于等于要求瓶子数，则不需要加瓶子
		if (v.size() <= k)
			System.out.println(0);

		/*否则，选出还需要合并多少个瓶子，计算简化水量，
		比如：倘若还需要合并两个瓶子，则用倒数第三多的瓶子
		中的水减去比它少的瓶子中的水即为还需要的瓶子数 
		*/

		else {
			int last = v.size() - k;
			NumtoAdd = (1 << v.get(last));

			for (int j = 0; j < last; j++) {
				NumtoAdd = NumtoAdd -(1 << (v.get(j)));
			}

			System.out.println(NumtoAdd);
		}
	}
}
