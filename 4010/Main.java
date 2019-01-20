import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean Up_Down = true;
		int n = sc.nextInt();
		int NoPerson = 999999999;											//NoPerson 表示当前没有人 , min表示最小A min_index表示最小A地址
		int min = 99999999, min_index = 0, Head = 0, index = 0, length = 0;  //Head表示当前的头地址 , length 表示 头到最小A的长度
		int CurrentPersons = n;
		int[] A = new int[n];

		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}

		while (CurrentPersons != 0) {
			if (Up_Down) {
				
				for (int i = 0; i < A.length; i++) {
					
					if(Head + i > A.length -1 ) index = Head + i - A.length;
					else index = Head + i;
					
					if (A[index] < min) {
						min = A[index];
						min_index = index;
					}
				}
				if (min_index - Head < 0)
					length = min_index - Head + A.length;
				else
					length = min_index - Head;

				for (int i = 0; i < length; i++)
					A[(Head + i) % A.length] -= min;

				A[min_index] = NoPerson;

				for (int i = length + 1; i < A.length; i++)
					A[(Head + i) % A.length] -= (min - 1);

				Up_Down = false;
				Head = min_index;
				CurrentPersons--;
				min = 99999999;

			} else {
				for (int i = 0; i < A.length; i++) {
					if (Head - i < 0)
						index = Head - i + A.length;
					else
						index = Head - i;

					if (A[index] < min) {
						min = A[index];
						min_index = index;
					}
				}

				if (Head - min_index < 0)
					length = Head - min_index + A.length;
				else
					length = Head - min_index;

				for (int i = 0; i < length; i++) {
					if (Head - i < 0)
						index = Head - i + A.length;
					else
						index = Head - i;
					A[index] -= min;
				}

				A[min_index] = NoPerson;

				for (int i = length + 1; i < A.length; i++) {
					if (Head - i < 0)
						index = Head - i + A.length;
					else
						index = Head - i;
					
					A[index] -= (min - 1);
				}
				Up_Down = true;
				Head = min_index;
				CurrentPersons--;
				min = 99999999;
			}
		}
		System.out.println(min_index + 1);
	}
}
