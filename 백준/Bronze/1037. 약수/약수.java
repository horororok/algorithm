import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		List<Long> list = new ArrayList<>();
		for (int tc = 0; tc < N; tc++) {
			long A = sc.nextLong();
			list.add(A);
		}
		Collections.sort(list);
		if (N == 1) {
			System.out.println(list.get(0) * list.get(0));
		} else {
			System.out.println(list.get(0) * list.get(list.size() - 1));
		}

	}
}