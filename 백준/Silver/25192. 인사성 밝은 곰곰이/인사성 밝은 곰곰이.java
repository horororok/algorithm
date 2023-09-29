import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<String> set = new HashSet<>();

		// enter 이후에 또다시 엔터가 나올때까지 닉네임을 셋에 넣는다
		/// 엔터가 또나올 경우 셋의 크기를 저장하고 셋을 초기화 한다
		// 다시 반복하면서 저장한 셋의 크기에 끝날때까지 계속 셋의 크기를 더해준다.

		int N = sc.nextInt();

		int cnt = 0;
		int ans = 0;
		for (int i = 0; i < N; i++) {
			String a = sc.next();

			if (a.equals("ENTER")) {
				ans += cnt;
				cnt = 0;
				set.clear();
				continue;
			} else {
				set.add(a);
				cnt = set.size();
			}

		}
		ans += cnt;
		
		System.out.println(ans);

	}
}