import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		 int[] unit = new int[M]; // 아이템의 단위 가격을 저장할 배열 생성
	        int[] pack = new int[M]; // 아이템의 패키지 가격을 저장할 배열 생성
	        for (int i = 0; i < M; i++) {
	            pack[i] = sc.nextInt(); // i번째 아이템의 패키지 가격 읽기
	            unit[i] = sc.nextInt(); // i번째 아이템의 단위 가격 읽기
	        }
	        Arrays.sort(unit); // 단위 가격 배열을 오름차순으로 정렬
	        Arrays.sort(pack); // 패키지 가격 배열을 오름차순으로 정렬

	        int min = Integer.MAX_VALUE; // 최소 비용을 저장할 변수 초기화

	        // 최소 비용을 계산
	        min = Math.min(((N / 6) + 1) * pack[0], N * unit[0]);
	        min = Math.min(min, ((N / 6)) * pack[0] + (N % 6) * unit[0]);

		System.out.println(min);
	}
}