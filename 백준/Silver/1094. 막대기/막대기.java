import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = sc.nextInt();

		int cnt = 0;
		int len = 64;

		while (X > 0) {
			if (len > X) {
				len /= 2;
			} else {
				cnt++;
				X -= len;
			}
		}

		System.out.println(cnt);
	}

}