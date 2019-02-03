import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		while (a != 0) {
			a--;
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			long min = 9999999999999L;
			
			
			for (int i = 0; i < m; i++) {
				long u = sc.nextLong();
				int d = sc.nextInt();
				double x = Math.ceil(((double)(d*n))/(u+d));
				long tmp = (d+u)*((long)x) - d*n;
				if(min>tmp) min = tmp;
			}
			
			System.out.println(min);
		}

	}

}
