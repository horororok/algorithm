import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[5][5];
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                board[r][c] = sc.nextInt();
            }
        }

        int[] calls = new int[25];
        for (int i = 0; i < 25; i++) {
            calls[i] = sc.nextInt();
        }

        int ans = 0;
        int bingo = 0;

        for (int i = 0; i < 25; i++) {
            int input = calls[i];
            boolean found = false;

            // 숫자 찾기
            for (int r = 0; r < 5; r++) {
                for (int c = 0; c < 5; c++) {
                    if (board[r][c] == input) {
                        board[r][c] = 0;
                        found = true;
                        break;
                    }
                }
                if (found) {
                    break;
                }
            }

            // 빙고 개수 검사
            bingo = 0;
            for (int r = 0; r < 5; r++) {
                int rCount = 0;
                int cCount = 0;
                for (int c = 0; c < 5; c++) {
                    if (board[r][c] == 0) {
                        rCount++;
                    }
                    if (board[c][r] == 0) {
                        cCount++;
                    }
                }
                if (rCount == 5) {
                    bingo++;
                }
                if (cCount == 5) {
                    bingo++;
                }
            }

            // 대각선 검사
            int diagonal1Count = 0;
            int diagonal2Count = 0;
            for (int d = 0; d < 5; d++) {
                if (board[d][d] == 0) {
                    diagonal1Count++;
                }
                if (board[d][4 - d] == 0) {
                    diagonal2Count++;
                }
            }
            if (diagonal1Count == 5) {
                bingo++;
            }
            if (diagonal2Count == 5) {
                bingo++;
            }

            if (bingo >= 3) {
                ans = i + 1;
                break;
            }
        }

        System.out.println(ans);
    }
}