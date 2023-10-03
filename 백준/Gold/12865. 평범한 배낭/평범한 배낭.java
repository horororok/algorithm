import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] weights = new int[N + 1];
		int[] values = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			int W = sc.nextInt();
			int V = sc.nextInt();

			weights[i] = W;
			values[i] = V;
		}

		// N개의 물건과 각 물건 i의 무게 W와 가치 V

		int[][] dp = new int[N + 1][K + 1];

		for (int i = 1; i <= N; i++) {
			for (int w = 0; w <= K; w++) {
				if (weights[i] <= w) {
					// 현재 해당 무게에서의 최적해 : dp[i-1][w]
					// 이번 물건을 고려한 최적해 : dp[i-1][w-weights[i]] + cost[i]
					// 두 경우중 더 큰 값 저장

					dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - weights[i]] + values[i]);
				} else {
					// 현재 고려할 물건의 무게가 임시 무게를 벗어나 고려할 수 없음
					dp[i][w] = dp[i - 1][w];
				}
			}

		}
		System.out.println(dp[N][K]);

	}

}