import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int h,k;
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		h = sc.nextInt();
		
		if( h == 1 ) {System.out.println(1);return;}
		
		BigInteger[][] tree = new BigInteger[h-1][k];
		
		for(int i = 0 ; i < k ; i++)
			tree[0][i] = new BigInteger("1");
		
		for (int i = 1; i < h-1; ++i)
			for (int j = 0; j < k; ++j)
				tree[i][j] = new BigInteger("0");
		
		for (int i = 1; i < h-1; ++i)
			for (int j = 0; j < k; ++j)
				for(int p = 0 ; p < k - j ; ++p)
					tree[i][j] = tree[i][j].add(tree[i-1][p]);
		
		BigInteger ans = new BigInteger("0");
		for (int i = 0; i < k; ++i)
			ans  =ans.add(tree[h-2][i]);
		
		System.out.println(ans);
		
	}
}
