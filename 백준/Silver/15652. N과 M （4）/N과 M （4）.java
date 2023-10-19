import java.util.Scanner;

public class Main {

    public static int N, M; // N은 1부터 N까지의 자연수 범위, M은 골라야 하는 수의 개수
    public static int[] arr; // 선택한 수를 저장할 배열
    public static StringBuilder sb = new StringBuilder(); 

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); 
        M = sc.nextInt(); 
        arr = new int[M]; // M개의 수를 저장할 배열 생성

        dfs(1, 0); // 깊이 우선 탐색(dfs) 시작
        System.out.println(sb); // 결과 출력

    }

    // 깊이 우선 탐색(dfs) 함수
    public static void dfs(int a, int depth) {
        if (depth == M) { // depth가 M과 같다면( M개의 수를 모두 선택한 경우)
            for (int val : arr) { // 선택한 수를 출력
                sb.append(val).append(' ');
            }
            sb.append('\n'); // 한 줄의 조합이 끝났으므로 개행 문자를 추가
            return; // 재귀 호출 종료
        }

        for (int i = a; i <= N; i++) { // i는 at부터 N까지의 범위에서 변함
            arr[depth] = i; // 배열 arr의 현재 깊이(depth)에 현재 값을 저장
            dfs(i, depth + 1); // 다음 깊이로 재귀 호출
        }
    }
}