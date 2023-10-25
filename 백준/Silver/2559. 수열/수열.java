import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int max = 0; // 답, 최대 온도 구간의 합을 저장할 변수
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 온도를 측정한 전체 날짜의 수.
        int K = sc.nextInt(); // 합을 구하기 위한 연속적인 날짜의 수
        int[] temperature = new int[N]; // 온도 저장 배열

        // 온도 데이터 입력
        for (int i = 0; i < N; i++) {
            temperature[i] = sc.nextInt();
        }

        // 처음 K일간의 온도 합
        for (int i = 0; i < K; i++) {
            max = max + temperature[i];
        }

        int temp = max; // 구간 온도의 합을 저장하는 변수

        // K일 이후부터 루프를 돌면서 최대 온도 구간의 합 계산
        for (int i = K; i < N; i++) {
            // 시간 초과를 해결하기 위해서
            // K일 간격으로 구간을 옮겨가면서 합을 업데이트
            // 이전 구간 합(temp)에서 구간의 첫 번째 온도를 빼고, 구간의 마지막 온도를 더하여 새로운 구간 합 구하기
            temp = temp - temperature[i - K] + temperature[i];
            max = Math.max(max, temp); // 더 큰 수를 최대값으로 갱신
        }

        System.out.println(max); // 최대 온도 구간의 합 출력
    }
}