import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String string = new String(sc.nextLine());
		string = string.replace(" ", "");  //去除空格
		
		BigInteger a = new BigInteger(string.substring(0, string.indexOf('+')));  //分离
		BigInteger b = new BigInteger(string.substring(string.indexOf('+')+1));
		
		if(a.add(b).compareTo(new BigInteger("100000000"))==1) System.out.println("Large"); //相加
		else System.out.println(a.add(b));
	}
}
