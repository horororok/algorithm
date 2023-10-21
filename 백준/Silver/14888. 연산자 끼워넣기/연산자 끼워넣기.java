import java.util.Scanner;

public class Main {

    public static int MAX = Integer.MIN_VALUE; // 최댓값을 저장하는 변수
    public static int MIN = Integer.MAX_VALUE; // 최솟값을 저장하는 변수
    public static int[] operator = new int[4]; // 연산자 개수를 저장하는 배열 (0: 덧셈, 1: 뺄셈, 2: 곱셈, 3: 나눗셈)
    public static int[] number; // 입력된 숫자를 저장하는 배열
    public static int N; // 숫자의 개수

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 숫자의 개수를 입력
        
        number = new int[N];
        for (int i = 0; i < N; i++) {
            number[i] = sc.nextInt(); // 숫자를 입력받아 배열에 저장
        }

        for (int i = 0; i < 4; i++) {
            operator[i] = sc.nextInt(); // 각 연산자의 개수를 입력받아 배열에 저장
        }

        dfs(number[0], 1); // 깊이 우선 탐색(dfs)

        System.out.println(MAX); // 최댓값 출력
        System.out.println(MIN); // 최솟값 출력

    }

    public static void dfs(int num, int idx) {
        if (idx == N) { // 모든 숫자를 사용한 경우
            MAX = Math.max(MAX, num); // 최댓값 업데이트
            MIN = Math.min(MIN, num); // 최솟값 업데이트
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) { // 해당 연산자의 개수가 1 이상인 경우에만 진행

                operator[i]--; // 해당 연산자를 사용했으므로 개수를 하나 감소

                switch (i) {
                    case 0:
                        dfs(num + number[idx], idx + 1); // 덧셈 연산 수행
                        break;
                    case 1:
                        dfs(num - number[idx], idx + 1); // 뺄셈 연산 수행
                        break;
                    case 2:
                        dfs(num * number[idx], idx + 1); // 곱셈 연산 수행
                        break;
                    case 3:
                        dfs(num / number[idx], idx + 1); // 나눗셈 연산 수행
                        break;
                }

                operator[i]++; // 연산을 마치고 돌아왔으므로 해당 연산자의 개수를 다시 복구
            }
        }
    }
}