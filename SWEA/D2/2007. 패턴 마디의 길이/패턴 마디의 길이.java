import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		//System.setIn(new FileInputStream("src/Day0816_2007/input_2007.txt"));

		Scanner scanner = new Scanner(System.in);

		// 테스트 케이스의 개수 입력
		int T = scanner.nextInt();

		// 각 테스트 케이스에 대해 반복
		for (int test_case = 1; test_case <= T; test_case++) {
			// 입력된 패턴 문자열 저장
			String pattern = scanner.next();

			// 가능한 마디의 길이를 1부터 10까지 순차적으로 검사
			outer: for (int l = 1; l <= 10; l++) {
				// 현재 마디 길이에 해당하는 부분 문자열 생성
				String madi = pattern.substring(0, l);

				// 주어진 문자열을 마디의 길이 간격으로 순회하며 비교
				for (int i = 0; i < pattern.length(); i += l) {
					for (int j = 0; j < l && i + j < pattern.length(); j++) {
						// 만약 현재 마디와 부분 문자열의 문자가 다르면 outer 레이블로 돌아가서 다음 마디 길이를 검사
						if (madi.charAt(j) != pattern.charAt(i + j)) {
							continue outer;
						}
					}
				}

				// 마디 길이를 찾았을 때 결과 출력 후 반복 종료
				System.out.println("#" + test_case + " " + l);
				break;
			}
		}
	}
}