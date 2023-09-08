
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[N];
		int[] arr2 = new int[N];
		for (int i = 0; i < N; i++) {
			int input = sc.nextInt();
			arr[i] = input;
			arr2[i] = input;
		}

		Arrays.sort(arr2);

		HashMap<Integer, Integer> hm = new HashMap<>();

		hm.put(arr2[0], 0);

		int rank = 1;
		int idx = 1;
		while (idx < N) {
			if (arr2[idx] != arr2[idx - 1]) {
				hm.put(arr2[idx], rank);
				rank++;
			}
			idx++;
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			sb.append(hm.get(arr[i])).append(" ");
		}
		System.out.println(sb);
	}
}
