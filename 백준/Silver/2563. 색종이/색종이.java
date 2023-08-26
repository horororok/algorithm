import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 100 * 100 이차원 배열을 만든다
		// 10*10의 정사각형 색종이 붙이기
		// 색종이가 붙은 영역의 넓이
		// 색종이 왼쪽아래 지점의 좌표가 주어진다
		// 밖으로 나가는 경우는 없다 했으므로 경계조건은 주지 않아도 된다.

		// 100*100크기의 빈 이차원 배열
		int[][] arr = new int[100][100];

		// 넓이를 구해줄 변수
		int sum = 0;

		int N = sc.nextInt();
		for (int _ = 0; _ < N; _++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					arr[x + i][y + j] = 1;
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				if (arr[i][j] == 1) {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
}