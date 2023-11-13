import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 6개의 좌표를 입력받음
        int[] points = new int[6];
        for (int i = 0; i < 6; i++) {
            points[i] = sc.nextInt();
        }

        // 세 점이 일직선 상에 있는 경우
        if ((points[2] - points[0]) * (points[5] - points[1]) == (points[4] - points[0]) * (points[3] - points[1])) {
            System.out.println(-1);
            return;
        }

        // 세 변의 길이 계산
        double ab = getLength(points[0], points[1], points[2], points[3]);
        double bc = getLength(points[2], points[3], points[4], points[5]);
        double ca = getLength(points[4], points[5], points[0], points[1]);

        // 가장 긴 변과 가장 짧은 변의 길이 계산
        double max = Math.max(ab, Math.max(bc, ca));
        double min = Math.min(ab, Math.min(bc, ca));

        // 육각형의 둘레 계산 및 출력
        System.out.println(2 * (max - min));
    }

    // 두 점 사이의 거리를 계산하는 메서드
    public static double getLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}