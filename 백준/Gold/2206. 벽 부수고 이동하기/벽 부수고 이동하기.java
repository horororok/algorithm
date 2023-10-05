import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	// N*M 행렬의 맵
		// 1,1 에서 N,M까지 최단 경로로 이동
		// 최단거리 출력
		// 벽을 한개 까지 부술 수 있다.

		// 최단거리 -> BFS

		// 벽을 만났을 때
		// 벽을 부순 적이 없다면 -> 벽을 부수고 이동
		// 벽을 부순적이 있다면 -> 지나갈 수 없다

		// 3중 visited 배열 visited[2][N][M]
		// 벽을 부수고 탐색하는 경우 : visited[0][N][M]
		// 벽을 부수지 않고 탐색하는 경우 : visited[1][N][M]
	
	static int N, M;
	static int[][] arr;

	static int[][] dist; // 거리 측정 배열
	static boolean[][][] visit; // 벽을 부순 여부에 따라 방문 여부 기록

	public static int[] dx = { -1, 0, 1, 0 };
	public static int[] dy = { 0, 1, 0, -1 };
	static int result = -1;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt(); // 행 수
		M = sc.nextInt(); // 열 수
		arr = new int[N][M]; // 맵 정보
		dist = new int[N][M]; // 거리 측정 배열
		visit = new boolean[2][N][M]; // 벽을 부순 여부에 따른 방문 여부 기록

		// 시작지점과 도착지점이 같을 경우
		if (N - 1 == 0 && M - 1 == 0) {
			System.out.print(1);
			System.exit(0);
		}

		// 맵 정보 입력
		for (int i = 0; i < N; i++) {
			String str = sc.next();
			for (int j = 0; j < M; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
		BFS(); // BFS 탐색 실행
		System.out.println(result);
	}

	private static void BFS() {
		LinkedList<int[]> que = new LinkedList<>();
		que.offer(new int[] { 0, 0, 0 }); // 시작 지점을 큐에 추가
		arr[0][0] = -1; // 시작 지점을 -1로 표시

		while (!que.isEmpty()) {
			int[] poll = que.poll();
			int x = poll[0];
			int y = poll[1];
			int z = poll[2]; // 벽을 부쉈는지 여부

			for (int i = 0; i < 4; i++) {
				int nowX = x + dx[i];
				int nowY = y + dy[i];

				// 배열 범위를 벗어나면 건너뛰기
				if (nowX < 0 || nowY < 0 || N <= nowX || M <= nowY) {
					continue;
				}

				// 벽을 만났을 때
				if (arr[nowX][nowY] == 1) {
					// 아직 벽을 부수지 않았고, 방문하지 않았다면
					if (z == 0 && !visit[1][nowX][nowY]) {
						visit[z][nowX][nowY] = true; // 방문 처리
						dist[nowX][nowY] = dist[x][y] + 1; // 거리 측정
						que.offer(new int[] { nowX, nowY, 1 }); // 벽을 부수고 이동
					}
				} else {
					// 벽이 아니라면
					if (!visit[z][nowX][nowY]) {
						visit[z][nowX][nowY] = true; // 방문 처리
						dist[nowX][nowY] = dist[x][y] + 1; // 거리 측정
						que.offer(new int[] { nowX, nowY, z }); // 벽을 부수지 않고 이동
					}
				}

				// 도착 지점에 도달한 경우
				if (nowX == N - 1 && nowY == M - 1) {
					result = dist[nowX][nowY] + 1; // 도착 지점까지의 최단 거리 계산
					return;
				}
			}
		}
	}
}