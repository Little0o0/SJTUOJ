import java.util.Scanner;

public class Main {

	static class Hub {
		int x;
		int y;
		int r;

		Hub(int a, int b, int c) {
			x = a;
			y = b;
			r = c;
		}
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int y = sc.nextInt();
		int N = sc.nextInt();
		int e = sc.nextInt();
		int flag = sc.nextInt();

		int b = getB(N);

		Hub tmp = Euclid(e, b);

		int x = 1 , d;
		
		if(tmp.x<0) d = b + tmp.x;
		else d = tmp.x;

		for (int i = 0; i < d; i++) {
			x = x * y;
			x = x % N;
		}

		if (flag == 0)
			System.out.println(x);
		else {
			System.out.println(x);
			System.out.println(d);
		}
	}

	private static Hub Euclid(int a, int b) {

		if (b == 0)
			return new Hub(1, 0, a);

		else {
			Hub t = Euclid(b, a % b);

			return new Hub(t.y, t.x - (a / b) * t.y, t.r);
		}
	}

	private static int getB(int n) {
		int p = 2;
		for (; p <= Math.sqrt(n); p++) {
			if (n % p == 0) {
				return n - p - n / p + 1;
			}
		}
		return 0;
	}

}
