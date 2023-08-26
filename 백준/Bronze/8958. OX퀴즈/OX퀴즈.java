import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// sum 과 cnt 변수를 만들어서
		// cnt로 연속된 O의 개수 를 세고 X일경우 0으로 초기화
		// sum에 cnt를 더해준다

		int N = sc.nextInt();
		for (int tc = 0; tc < N; tc++) {
			int sum = 0;
			int cnt = 0;
			String input = sc.next();
			char[] arr = input.toCharArray();

			if (arr[0] == 'O') {
				cnt = 1;
				sum = 1;
			}
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] == 'O' && arr[i - 1] != 'O') {
					cnt++;
					sum++;
				} else if (arr[i] == 'O' && arr[i - 1] == 'O') {
					cnt++;
					sum += cnt;
				} else {
					cnt = 0;
				}

			}
			System.out.println(sum);
		}
	}
}