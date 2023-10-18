import java.util.Scanner;

public class Main {
	
	public static int[] arr;
	public static int N, M;
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
 
		N = sc.nextInt(); // N 입력: 1부터 N까지의 자연수를 사용
		M = sc.nextInt(); // M 입력: 선택할 숫자의 개수
 
		arr = new int[M]; // 선택한 숫자를 저장할 배열 생성
        
		dfs(0); // DFS 알고리즘을 호출하여 가능한 조합을 찾음
		System.out.print(sb); // 결과를 출력
 
	}
 
	public static void dfs(int depth) {
		if (depth == M) { // 선택한 숫자가 M개가 되면 조합을 출력
			for (int i = 0; i < M; i++) {
				sb.append(arr[i] + " "); // 선택한 숫자를 문자열에 추가
			}
			sb.append('\n');
			return;
		}
 
		for (int i = 1; i <= N; i++) { // 1부터 N까지의 숫자 중에서 선택
			arr[depth] = i; // 현재 깊이에 해당하는 배열 위치에 숫자를 저장
			dfs(depth + 1); // 다음 깊이로 이동하여 재귀 호출
		}
	}
}