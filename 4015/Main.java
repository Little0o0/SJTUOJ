import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt() % 7;

		int B = sc.nextInt() % 7;

		long n = sc.nextLong();
		int a = 1, b = 1;

		if (n == 1 || n == 2)
			System.out.println(1);
		else {
			for (int i = 0; i < n - 2; i++) {
				int tmp = a;
				a = (A * a + B * b) % 7;
				b = tmp;
			}
			System.out.println(a);
		}
	}

}
