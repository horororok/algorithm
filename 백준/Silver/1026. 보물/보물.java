import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int N = sc.nextInt(); // 입력에서 정수 N을 읽음
        int[] A = new int[N]; // 값을 저장하기 위한 크기가 N인 배열 A를 생성
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt(); // N개의 공백으로 구분된 정수를 읽어 배열 A에 저장
        }
        Arrays.sort(A); // 배열 A를 오름차순으로 정렬

        Integer[] B = new Integer[N]; // Integer 객체의 배열 B를 생성
        for (int i = 0; i < N; i++) {
            B[i] = sc.nextInt(); // N개의 공백으로 구분된 정수를 읽어 배열 B에 저장
        }
        Arrays.sort(B, Comparator.reverseOrder()); // 배열 B를 내림차순으로 정렬

        int ans = 0; // 정답을 저장할 변수를 초기화
        for (int i = 0; i < N; i++) {
            ans += A[i] * B[i]; // 배열 A와 B의 요소를 곱하고 결과를 누적
        }

        System.out.println(ans); 
    }
}