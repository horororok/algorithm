import java.util.Scanner;

public class Main {
    static int N, M, D, result;
    static int[] archer;
    static int[][] arr, copyarr;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        N = scanner.nextInt();
        M = scanner.nextInt();
        D = scanner.nextInt();
        arr = new int[N][M];
        copyarr = new int[N][M];
        archer = new int[3];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        combination(0, 0);
        System.out.println(result);
    }

    public static void combination(int start, int idx) {
        if (idx == 3) {
            result = Math.max(result, game());
            return;
        }

        for (int i = start; i < M; i++) {
            archer[idx] = i;
            combination(i + 1, idx + 1);
        }
    }

    public static int game() {
        int total = 0;
        copyarr = new int[N][M];

        for (int line = N; line > 0; line--) {
            for (int pick : archer) {
                for (int dist = 1; dist <= D; dist++) {
                    int kill = attack(copyarr, dist, line, pick);
                    if (kill < 0) continue;
                    total += kill;
                    break;
                }
            }
        }
        return total;
    }

    public static int attack(int[][] copyarr, int dist, int line, int pick) {
        for (int m = pick - dist; m <= pick + dist; m++) {
            int n = line - (dist - Math.abs(pick - m));

            if (n < 0 || m < 0 || n >= line || m >= M || arr[n][m] == 0) continue;
            if (copyarr[n][m] == 0) {
                copyarr[n][m] = line;
                return 1;
            } else if (copyarr[n][m] == line) return 0;
        }
        return -1;
    }
}