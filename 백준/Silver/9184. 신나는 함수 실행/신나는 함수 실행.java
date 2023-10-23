import java.util.Scanner;

public class Main {

    // 메모이제이션을 위한 3차원 배열 dp를 선언
    // dp[a][b][c]는 w(a, b, c)의 결과를 저장
    static int[][][] dp = new int[21][21][21];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        // 입력을 계속 받기 위한 무한 루프를 사용
        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            // 입력이 -1, -1, -1일 때 루프를 종료
            if (a == -1 && b == -1 && c == -1) {
                break;
            }

            // 결과를 문자열로 만들어 StringBuilder에 추가
            sb.append("w(" + a + ", " + b + ", " + c + ") = ").append(w(a, b, c)).append('\n');
        }

        // 모든 결과를 출력
        System.out.println(sb);
    }

    static int w(int a, int b, int c) {
        // 메모이제이션: 이미 계산된 결과가 있다면 그 값을 반환
        if (isIn(a, b, c) && dp[a][b][c] != 0) {
            return dp[a][b][c];
        }

        // 범위 검사: a, b, c 중 하나라도 0 이하일 경우 1을 반환
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        // 범위 검사: a, b, c 중 하나라도 20을 초과하면 dp[20][20][20]에 값을 저장하고 반환합
        if (a > 20 || b > 20 || c > 20) {
            return dp[20][20][20] = w(20, 20, 20);
        }

        // 재귀 호출 및 값을 메모이제이션하여 반환
        if (a < b && b < c) {
            return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        }

        return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
    }

    // 입력값 a, b, c가 0 이상 20 이하인지 확인하는 함수
    static boolean isIn(int a, int b, int c) {
        return 0 <= a && a <= 20 && 0 <= b && b <= 20 && 0 <= c && c <= 20;
    }
}