import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 1; i < 10; i++) {
			arr[i] += arr[i - 1];
		}

		int a = 0;
		int sum = 0;
		while (a < 10 && sum <= 100) {
			sum = arr[a];
			a++;
		}

		int num1, num2;
		if (a == 1) {
			num1 = arr[a - 1];
			num2 = arr[a - 1];
		} else {
			num1 = arr[a - 2];
			num2 = arr[a - 1];
		}

		if (100 - num1 >= num2 - 100) {
			System.out.println(num2);
		} else {
			System.out.println(num1);
		}
	}
}