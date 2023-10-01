import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N = sc.nextLong();

		System.out.println(factorial(N));

	}

	public static long factorial(long a) {
		if (a == 0) {
			return 1;
		}
		return a * factorial(a - 1);

	}
}