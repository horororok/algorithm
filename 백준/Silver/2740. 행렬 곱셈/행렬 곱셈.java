import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 첫 번째 행렬의 행 개수
		int M = sc.nextInt(); // 첫 번째 행렬의 열 개수 (두 번째 행렬의 행 개수)

		int[][] A = new int[N][M]; // 첫 번째 행렬

		// 첫 번째 행렬 입력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt(); // 각 원소를 입력받음
			}
		}

		sc.nextInt(); // 중간값을 건너뜀 (두 번째 행렬의 열 개수)
		int K = sc.nextInt(); // 두 번째 행렬의 열 개수

		int[][] B = new int[M][K]; // 두 번째 행렬

		// 두 번째 행렬 입력
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < K; j++) {
				B[i][j] = sc.nextInt(); // 각 원소를 입력받음
			}
		}

		StringBuilder sb = new StringBuilder();

		// 행렬 곱셈 및 결과 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < K; j++) {
				int sum = 0;
				for (int k = 0; k < M; k++) {
					sum += A[i][k] * B[k][j]; // 행렬 곱셈 수행
				}
				sb.append(sum).append(' ');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}