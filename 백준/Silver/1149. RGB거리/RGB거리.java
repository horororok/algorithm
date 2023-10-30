import java.util.Scanner;

public class Main {

    final static int Red = 0;
    final static int Green = 1;
    final static int Blue = 2;

    static int[][] Cost;
    static int[][] DP;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Cost = new int[N][3];
        DP = new int[N][3];

        // 각 집을 칠하는데 필요한 비용을 입력받는 부분
        for (int i = 0; i < N; i++) {
            Cost[i][Red] = sc.nextInt();
            Cost[i][Green] = sc.nextInt();
            Cost[i][Blue] = sc.nextInt();
        }

        // 첫 번째 집을 칠하는데 드는 비용을 초기화
        DP[0][Red] = Cost[0][Red];
        DP[0][Green] = Cost[0][Green];
        DP[0][Blue] = Cost[0][Blue];

        // 모든 집을 칠하는데 드는 최소 비용을 계산하고 출력
        System.out.print(Math.min(Paint_cost(N - 1, Red), Math.min(Paint_cost(N - 1, Green), Paint_cost(N - 1, Blue))));
    }

    // 각 집을 칠하는데 드는 최소 비용을 계산하는 재귀 함수
    static int Paint_cost(int N, int color) {

        // 이미 계산한 값이 있다면 그 값을 반환
        if (DP[N][color] == 0) {

            if (color == Red) {
                DP[N][Red] = Math.min(Paint_cost(N - 1, Green), Paint_cost(N - 1, Blue)) + Cost[N][Red];
            } else if (color == Green) {
                DP[N][Green] = Math.min(Paint_cost(N - 1, Red), Paint_cost(N - 1, Blue)) + Cost[N][Green];
            } else {
                DP[N][Blue] = Math.min(Paint_cost(N - 1, Red), Paint_cost(N - 1, Green)) + Cost[N][Blue];
            }

        }

        return DP[N][color];
    }
}