import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		// 9*9 행렬

		int[][] arr = new int[9][9];
		for (int r = 0; r < 9; r++) {
			for (int c = 0; c < 9; c++) {
				arr[r][c] = sc.nextInt();
			}
		}

		int max = -1;
		int r = 0;
		int c = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					r = i + 1;
					c = j + 1;
				}
			}
		}

		System.out.println(max);
		System.out.println(r + " " + c);

	}

}