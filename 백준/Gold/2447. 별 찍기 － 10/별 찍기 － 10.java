import java.util.Scanner;

public class Main {
	static char[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		arr = new char[N][N];

		star(0, 0, N, false); // 'star' 함수를 호출하여 패턴을 생성

		StringBuilder sb = new StringBuilder(); // 출력을 구성하기 위한 StringBuilder 생성
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(arr[i][j]); // 문자를 StringBuilder에 추가
			}
			sb.append('\n'); // 행을 구분하기 위해 개행 문자를 추가
		}
		System.out.print(sb); // 최종 패턴을 출력
	}

	static void star(int x, int y, int N, boolean blank) {
		// 이 함수는 별 모양 패턴을 생성하기 위한 재귀적인 메서드

		if (blank) {
			// 'blank'가 참이면 공백으로 영역을 채웁니다
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = ' '; // (i, j) 위치의 문자를 공백으로 설정
				}
			}
			return;
		}

		if (N == 1) {
			// N이 1인 경우, 중앙 문자를 '*'로 설정
			arr[x][y] = '*';
			return;
		}

		int size = N / 3; // 각 하위 패턴의 크기를 계산
		int count = 0; // 하위 패턴을 추적하기 위한 카운트 변수를 초기화
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) {
					star(i, j, size, true); // 중앙 하위 패턴에 대해 'blank'를 참으로 설정하여 재귀 호출
				} else {
					star(i, j, size, false); // 바깥쪽 하위 패턴에 대해 재귀 호출
				}
			}
		}
	}
}