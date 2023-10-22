import java.util.Scanner;

public class Main {

	static int N, dpcnt, recurcnt;
	static int[] fib;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();

		fib = new int[N + 1];

		dp(N);
		recur(N);

		System.out.println(recurcnt);
		System.out.println(dpcnt);

	}

	static int recur(int n) {
		if (n <= 2) {
			recurcnt++;
			return 1;
		} else {
			return recur(n - 1) + recur(n - 2);
		}
	}

	static int dp(int n) {
		fib[1] = fib[2] = 1;

		for (int i = 3; i <= n; i++) {
			dpcnt++;
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		return fib[n];
	}

}