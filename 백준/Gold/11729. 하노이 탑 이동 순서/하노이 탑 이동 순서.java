import java.util.Scanner;

public class Main {
	//  N : 원판의 개수
	//  start : 출발지
	//  mid : 옮기기 위해 이동해야 할 장소
	//  to : 목적지
	//
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();

		// 원판을 옮기는 횟수를 계산하여 출력
		sb.append((int) (Math.pow(2, N) - 1)).append('\n');

		// 하노이 탑 이동 순서 계산 함수 호출
		rec(N, 1, 2, 3);
		System.out.println(sb);
	}

	public static void rec(int N, int start, int mid, int to) {
		if (N == 1) {
			// 원판을 한 번 이동하고 결과를 StringBuilder에 저장
			sb.append(start + " " + to + "\n");
			return;
		}

		// N-1 개의 원판을 중간 지점(mid)으로 이동
		rec(N - 1, start, to, mid);

		// 가장 큰 원판을 목적지로 이동
		sb.append(start + " " + to + "\n");

		// 중간 지점에 있는 N-1 개의 원판을 목적지로 이동
		rec(N - 1, mid, start, to);
	}
}