import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    static class Cow implements Comparable<Cow> {
        int start, time;

        public Cow(int start, int time) {
            super();
            this.start = start;
            this.time = time;
        }

        @Override
        public int compareTo(Cow o) {
            // 소를 시작 시간을 기준으로 정렬하되, 시작 시간이 같다면 걸리는 시간을 기준으로 정렬
            if (this.start != o.start) return this.start - o.start;
            return this.time - o.time;
        }
    }

    public static void main(String[] args) {
        // 소의 수 입력
        int N = sc.nextInt();
        Cow[] c = new Cow[N];

        // 소의 시작 시간과 걸리는 시간을 입력받아 Cow 객체를 생성하고 배열에 저장
        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int time = sc.nextInt();
            c[i] = new Cow(start, time);
        }

        // 소를 시작 시간을 기준으로 정렬
        Arrays.sort(c);

        // 모든 소를 처리하는데 걸리는 최소 시간 계산
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            Cow cur = c[i];
            // 현재 소의 시작 시간이 이전 소들이 끝난 시간보다 뒤라면 그대로 진행
            if (cur.start > cnt) cnt = cur.start + cur.time;
            // 현재 소의 시작 시간이 이전 소들이 끝난 시간보다 앞이라면 대기 시간 없이 바로 처리
            else cnt += cur.time;
        }

        // 최종적으로 모든 소를 처리하는데 걸리는 최소 시간 출력
        System.out.println(cnt);
    }
}