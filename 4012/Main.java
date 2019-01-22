import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int n ;
		BigInteger NoFruit = new BigInteger("0");
		BigInteger total_sum = new BigInteger("0");
		BigInteger sum;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		BigInteger[] a = new BigInteger[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = new BigInteger(sc.nextInt()+""); //initalize
		}
		
		Arrays.sort(a);
		
		for(int i = 0 ; i < n - 1 ; i++) {
			sum = a[i].add(a[i+1]);
			a[i] = NoFruit;
			a[i+1] = sum;
			total_sum = total_sum.add(sum);
			Arrays.sort(a);			//sort
		}
		System.out.println(total_sum);
	}
}
