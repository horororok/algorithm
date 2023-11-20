import java.util.Scanner; 

public class Main {
    static int N, M, ans = Integer.MIN_VALUE; 
    static int[][] map; // 행렬을 저장하기 위한 2차원 배열 선언

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        N = sc.nextInt(); // 입력에서 행의 수를 읽기
        M = sc.nextInt(); // 입력에서 열의 수를 읽기
        map = new int[N][M]; // 크기가 N x M인 2차원 배열 초기화

        // 입력에서 행렬 값 읽기
        for (int i = 0; i < N; i++) {
            String str = sc.next(); // 한 행을 문자열로 읽기
            for (int j = 0; j < M; j++) {
                map[i][j] = str.charAt(j) - '0'; // 문자를 정수로 변환하여 배열에 저장
            }
        }

        int len = Math.min(N, M); // len 변수를 N과 M 중 작은 값으로 초기화

        // 1로만 구성된 가장 큰 정사각형의 크기를 찾기 위한 루프
        while (len > 1) {
            for (int i = 0; i <= N - len; i++) {
                for (int j = 0; j <= M - len; j++) {
                    int num = map[i][j]; // 현재 정사각형의 좌상단 값 추출
                    // 정사각형의 네 꼭지점이 모두 같은 값을 가지는지 확인
                    if (num == map[i][j + len - 1] && num == map[i + len - 1][j] && num == map[i + len - 1][j + len - 1]) {
                        System.out.println(len * len); // 정사각형의 크기 출력
                        return; // 프로그램 종료
                    }
                }
            }
            len--; // 다음 반복을 위해 정사각형의 크기 줄이기
        }

        System.out.println(len * len); // 찾은 가장 큰 정사각형의 크기 출력
    }
}