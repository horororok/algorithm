import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print(hansu(sc.nextInt()));

	}

	public static int hansu(int num) {
		int cnt = 0;
		if (num < 100) {
			return num;
		}

		else {
			cnt = 99;

			for (int i = 100; i <= num; i++) {
				int baek = i / 100;
				int sip = (i / 10) % 10;
				int il = i % 10;

				if ((baek - sip) == (sip - il)) {
					cnt++;
				}
			}
		}

		return cnt;
	}

}