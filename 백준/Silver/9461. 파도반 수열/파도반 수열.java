import java.util.Scanner;

public class Main {
    
    // 배열 seq는 메모이제이션을 위한 배열로, 중간 계산 결과를 저장한다
    public static Long[] seq = new Long[101];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 초기 파도반 수열 값을 설정
        seq[0] = 0L;
        seq[1] = 1L;
        seq[2] = 1L;
        seq[3] = 1L;

        int T = sc.nextInt(); // 테스트 케이스

        while (T-- > 0) {
            int N = sc.nextInt();
            System.out.println(recur(N)); // N에 대한 파도반 수열 값을 출력
        }
    }

    // 파도반 수열 값을 계산하는 재귀 함수
    public static long recur(int N) {
        if (seq[N] == null) {
            // 이전에 계산한 값이 없다면, N-2와 N-3의 값으로 파도반 수열 값을 계산하고 메모이제이션
            seq[N] = recur(N - 2) + recur(N - 3);
        }
        return seq[N];
    }
}