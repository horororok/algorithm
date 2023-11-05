import java.util.Scanner;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> deque = new LinkedList<Integer>();

        int cnt = 0;  // 총 이동 횟수를 추적하기 위한 변수

        int N = sc.nextInt();  // 입력: 덱에 있는 전체 요소의 수
        int M = sc.nextInt();  // 입력: 덱에서 뽑아낼 요소의 수
        for (int i = 1; i <= N; i++) {
            deque.offer(i);  // 1부터 N까지의 정수로 덱을 채움
        }

        int[] seq = new int[M];  // 뽑아낼 요소의 순서를 저장하는 배열

        for (int i = 0; i < M; i++) {
            seq[i] = sc.nextInt();  // 입력: 뽑아낼 요소의 순서
        }

        for (int i = 0; i < M; i++) {

            int targetIdx = deque.indexOf(seq[i]);  // 대상 요소의 인덱스를 찾음
            int halfIdx;
            if (deque.size() % 2 == 0) {
                halfIdx = deque.size() / 2 - 1;
            } else {
                halfIdx = deque.size() / 2;
            }

            if (targetIdx <= halfIdx) {
                for (int j = 0; j < targetIdx; j++) {
                    int temp = deque.pollFirst();  // 요소를 덱의 앞에서 뒤로 이동
                    deque.offerLast(temp);
                    cnt++;  // 이동 횟수 증가
                }
            } else {
                for (int j = 0; j < deque.size() - targetIdx; j++) {
                    int temp = deque.pollLast();  // 요소를 덱의 뒤에서 앞으로 이동
                    deque.offerFirst(temp);
                    cnt++;  // 이동 횟수 증가
                }
            }
            deque.pollFirst();  // 덱의 앞에서 요소를 제거
        }

        System.out.println(cnt);  // 출력: 총 이동 횟수

    }
}