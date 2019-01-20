import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Num n = new Num(sc.nextLine());
		System.out.println(n.add(new Num(sc.nextLine())));

	}
}

class Num {
	char[] num;
	int length;

	public Num() {
	}

	public Num(char[] n, int l) {
		num = n;
		length = l;
	}

	public Num(String str) {
		num = new StringBuffer(str).reverse().toString().toCharArray();
		length = str.length();
	}

	public Num add(Num other) {

		int max = Math.max(this.length, other.length);
		int min = Math.min(this.length, other.length);

		int i = 0, t;
		int carry = 0;
		char[] tmp = new char[max + 1];

		for (; i < min; i++) {
			t = (int) this.num[i] + (int) other.num[i] - 2 * ((int) 'a') + carry;
			if (t > 25) {
				carry = 1;
				t = t - 26;
			} else
				carry = 0;
			tmp[i] = (char)(t+(int) 'a');
		}
		if (this.length > other.length)
			for (; i < max; i++) {
				t = (int) this.num[i] - (int) 'a' + carry;
				if (t > 25) {
					carry = 1;
					t = t - 26;
				} else
					carry = 0;
				tmp[i] = (char)(t+(int) 'a');
			}
		else
			for (; i < max; i++) {
				t = (int) other.num[i] - (int) 'a' + carry;
				if (t > 25) {
					carry = 1;
					t = t - 26;
				} else
					carry = 0;
				tmp[i] = (char)(t+(int) 'a');
			}

		
		if (carry == 1) {
			tmp[max] = 'b';
			return new Num(tmp, max + 1);
		} else
			return new Num(tmp, max);
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = length - 1; i >= 0; i--) {
			str = str + num[i];
		}

		return str;
	}
}