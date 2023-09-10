import java.util.Scanner;

public class Main {

	public static int N; // 기존 문자열의 개수
	public static int M; // 입력되는 문자열의 개수
	public static String[] arr1;
	public static String[] arr2;

	public static int cnt;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		M = sc.nextInt();

		arr1 = new String[N];
		for (int i = 0; i < N; i++) {
			arr1[i] = sc.next();
		}
		arr2 = new String[M];
		for (int i = 0; i < M; i++) {
			arr2[i] = sc.next();
		}

		
		//완전탐색
		cnt = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (arr2[i].equals(arr1[j])) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);

	}
}