import java.util.Scanner;

public class Main {

	// 메모이제이션
	// wrapper배열을 사용하여 초기값을 null을 갖게 함
	static Integer[] dp;

	public static void main(String[] args) {
		// 3으로 나누어 떨어지면 3으로 나눈다
		// 2로 나누어 떨어지면 2로 나눈다
		// 1을 뺀다
		// 위 세가지 연산을 사용해서 1로 만들때 최소 연산 수

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		dp = new Integer[N + 1];
		// N이 1보다 크거나 같다
		dp[0] = dp[1] = 0;

		System.out.println(calc(N));

	}

	private static int calc(int n) {

		// n을 탐색하지 않았을 경우(재방문 여부 체크)
		if (dp[n] == null) {
			// 6으로 나누어 떨어질 경우
			if (n % 6 == 0) {
				// 3으로 나누는 경우, 2로 나누는 경우, 1을 빼는 경우 세가지 중 최솟값으로 dp 배열 갱신
				dp[n] = Math.min(calc(n - 1), Math.min(calc(n / 3), calc(n / 2))) + 1;
			}
			// 3으로만 나누어 떨어질 경우
			else if (n % 3 == 0) {
				// 3으로 나누는 경우와 1을 빼는 경우 중 최솟값
				dp[n] = Math.min(calc(n / 3), calc(n - 1)) + 1;
			}
			// 2로만 나누어 떨어질 경우
			else if (n % 2 == 0) {
				// 2로 나누는 경우와 1을 빼는 경우 중 최솟값
				dp[n] = Math.min(calc(n / 2), calc(n - 1)) + 1;
			}
			// 2와 3으로 나누어 떨어지지 않을 경우
			else {
				// 1을 빼줌
				dp[n] = calc(n - 1) + 1;
			}
		}
		return dp[n];
	}
}