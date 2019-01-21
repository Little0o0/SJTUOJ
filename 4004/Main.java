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
