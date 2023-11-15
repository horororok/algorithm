import java.util.Scanner;

public class Main {
    // Pair 클래스 정의
    static class Pair {
        double first, second;

        Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }
    }

    // mid를 기준으로 num을 업데이트하는 함수
    static double update(double mid, double num) {
        return mid + Math.abs(mid - num);
    }

    // idx부터 시작하여 계산을 수행하는 함수
    static void func(int idx, double[] l, double[] r, Pair[] arr) {
        // 해당 범위의 값이 모두 같으면 계산하지 않음
        if (arr[idx].first == arr[idx].second)
            return;

        // mid 값 계산
        double mid = (arr[idx].first + arr[idx].second) / 2;

        // idx 다음의 범위에 대해 업데이트 수행
        for (int i = idx + 1; i < 3; i++) {
            arr[i].first = update(mid, arr[i].first);
            arr[i].second = update(mid, arr[i].second);
        }

        // 왼쪽 끝과 오른쪽 끝 값 업데이트
        l[0] = update(mid, l[0]);
        if (l[0] > r[0])
            r[0] = l[0];
        l[0] = mid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double len = sc.nextDouble();

        double[] left = { 0 };
        double[] right = { len };

        // Pair 객체를 저장할 배열
        Pair[] arr = new Pair[3];
        for (int i = 0; i < 3; i++) {
            double first = sc.nextDouble();
            double second = sc.nextDouble();
            arr[i] = new Pair(first, second);
        }

        // 각 경우에 대해 함수 호출하여 업데이트 수행
        for (int i = 0; i < 3; i++)
            func(i, left, right, arr);

        // 결과값 계산 및 출력
        double res = right[0] - left[0];
        res *= 10;
        res = Math.floor(res);
        res /= 10;
        System.out.println(String.format("%.1f", res));
    }
}