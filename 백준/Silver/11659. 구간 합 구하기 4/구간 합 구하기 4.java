import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int N = sc.nextInt(); // 정수 N
        int M = sc.nextInt(); // 정수 M

        int[] arr = new int[N + 1]; // 크기가 N+1인 정수 배열 'arr'을 생성
        arr[0] = 0; // 배열의 첫 번째 요소를 0으로 초기화

        // N개의 정수를 읽고, 'arr' 배열에 누적 합을 저장
        for (int i = 0; i < N; i++) {
            arr[i + 1] = arr[i] + sc.nextInt();
        }

        // M개의 입력 처리
        for (int i = 0; i < M; i++) {
            int a = sc.nextInt(); // 정수 'a'를 입력 받음
            int b = sc.nextInt(); // 정수 'b'를 입력 받음

            // 'a'부터 'b'까지 'arr' 배열의 합을 계산하고 출력
            System.out.println(arr[b] - arr[a - 1]);
        }
    }
}