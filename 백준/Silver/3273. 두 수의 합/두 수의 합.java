import java.util.*;
import java.io.*;

public class Main {
	static int N, X, ans;
	static int arr[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 요소의 개수 N
		N = sc.nextInt();

		// 요소를 저장할 배열
		arr = new int[N];

		HashSet<Integer> set = new HashSet<>();

		// N개의 요소를 배열과 HashSet에 추가
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
			set.add(arr[i]);
		}

		X = sc.nextInt();

		// X와 합쳐지는 쌍의 개수
		ans = 0;

		// 배열을 반복하면서 (X - arr[i])가 HashSet에 있는지 확인
		for (int i = 0; i < N; i++) {
			if (set.contains(X - arr[i])) {
				ans++;
			}
		}

		// 각 유효한 쌍이 두 번씩 세어지기 때문에 2로 나눠준다
		System.out.println(ans / 2);
	}
}