import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }

        int maxLen = 1;
        int currentLen = 1;

        // 증가하는 수열 길이 구하기
        for (int i = 1; i < N; i++) {
            if (num[i] >= num[i - 1]) {
                currentLen++;
            } else {
                currentLen = 1;
            }
            maxLen = Math.max(maxLen, currentLen);
        }

        // 감소하는 수열 길이 구하기
        currentLen = 1;
        for (int i = 1; i < N; i++) {
            if (num[i] <= num[i - 1]) {
                currentLen++;
            } else {
                currentLen = 1;
            }
            maxLen = Math.max(maxLen, currentLen);
        }

        System.out.println(maxLen);
    }
}