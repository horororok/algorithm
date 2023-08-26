import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int nums[] = new int[9];
		for (int i = 0; i < 9; i++) {
			nums[i] = sc.nextInt();
		}

		// 합이 100인 7개의 수 찾기
		outer : for (int i = 0; i < 3; i++) {
			for (int j = i + 1; j < 4; j++) {
				for (int k = j + 1; k < 5; k++) {
					for (int l = k + 1; l < 6; l++) {
						for (int m = l + 1; m < 7; m++) {
							for (int n = m + 1; n < 8; n++) {
								for (int o = n + 1; o < 9; o++) {
									int sum = nums[i] + nums[j] + nums[k] + nums[l] + nums[m] + nums[n] + nums[o];
									if (sum == 100) {
										int[] result = { nums[i], nums[j], nums[k], nums[l], nums[m], nums[n],
												nums[o] };
										sortArray(result); // 정렬
										printArray(result);
										break outer;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	// counting 정렬
	public static void sortArray(int[] arr) {
		int max = arr[0];
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}

		int[] count = new int[max + 1];
		for (int num : arr) {
			count[num]++;
		}

		int index = 0;
		for (int i = 0; i < count.length; i++) {
			while (count[i] > 0) {
				arr[index++] = i;
				count[i]--;
			}
		}
	}

	// 배열 출력
	public static void printArray(int[] arr) {
		for (int num : arr) {
			System.out.println(num + " ");
		}
	}
}