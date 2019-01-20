import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc =new  Scanner (System.in);
		
		String pub = sc.nextLine().trim();
		String pri = sc.nextLine().trim();
		
		for (int i = 1; i < pub.length(); i++) {  		//寻找可能的约数a
			if(pub.length() % i != 0 ) continue;
			else if(check(pub,pri,i)) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("No Solution");
	}

	private static boolean check(String pub, String pri, int a) { //看明文按照约数a加密以后是否与密文相等
		return pri.equals(encrypt(pub , a));
	}

	private static String encrypt(String pub, int a) { //利用约数a进行加密 
		String pri = "";
		char[] tmp = pub.toCharArray();
		int t;
		
		for (int j = 0; j < a; j++) {
			t = j;
			while(t<pub.length()) {
				pri += tmp[t];
				t += a; 
			}
		}
		return pri;
	}

}
