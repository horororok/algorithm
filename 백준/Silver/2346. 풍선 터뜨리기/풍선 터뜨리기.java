import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 원형 큐

		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		int N = sc.nextInt();

		Deque<int[]> deq = new ArrayDeque<>();

		for (int i = 0; i < N; i++) {
			int[] input = { i + 1, sc.nextInt() };
			deq.add(input);
		}

//		for (int[] element : deq) {
//            System.out.println(Arrays.toString(element));
//        }

		while (deq.size() > 1) {
			int[] arr = deq.pollFirst();
//			System.out.println(Arrays.toString(arr));
			sb.append(arr[0]).append(" ");
			int num = arr[1];

			if (num > 0) {
				for (int j = 1; j < num; j++) {
					deq.offerLast(deq.pollFirst());
				}
			} else {
				for (int j = num; j < 0; j++) {
					deq.offerFirst(deq.pollLast());
				}
			}
		}

		sb.append(deq.poll()[0]);

		System.out.println(sb);
	}
}