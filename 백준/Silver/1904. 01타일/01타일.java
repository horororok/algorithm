import java.util.Scanner;

public class Main {

    public static int[] dp = new int[1000001]; // 연산된 값을 저장할 배열

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        dp[0] = 0; // 초기값: F(0) = 0
        dp[1] = 1; // 초기값: F(1) = 1
        dp[2] = 2; // 초기값: F(2) = 2

        for (int i = 3; i < dp.length; i++) {
            dp[i] = -1; // 연산되지 않은 값들을 -1로 초기화
        }

        System.out.println(Tile(N)); // F(N)의 결과를 계산하고 출력

    }

    public static int Tile(int N) {
        if (dp[N] == -1) { // 값이 아직 계산되지 않았다면
            dp[N] = (Tile(N - 1) + Tile((N - 2))) % 15746; // 재귀적인 공식을 사용하여 F(N)을 계산
        }
        return dp[N]; // 계산된 F(N)의 값을 반환
    }

}