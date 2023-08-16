

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO Auto-generated method stub
        //System.setIn(new FileInputStream("src/Day0816_5356/input_5356.txt"));

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 개수 입력
        sc.nextLine(); // 개행 문자 제거

        // 각 테스트 케이스에 대해 반복
        for (int tc = 1; tc <= T; tc++) {
            // 각 테스트 케이스는 다섯 줄로 이루어져 있음
            int TCase = 5;
            // 이차원 문자 배열 선언
            char[][] arr = new char[TCase][15]; // 최대 열 개수를 15로 설정

            // 각 줄에 대해 반복
            int maxCol = 0;
            for (int i = 0; i < TCase; i++) {
                // 문자열 입력
                String input = sc.nextLine();
                // 최대 길이 15로 제한
                int length = Math.min(15, input.length());
                maxCol = Math.max(maxCol, length); // 열의 최대 개수 갱신

                // 문자열을 문자 하나하나로 쪼개서 배열에 저장
                for (int j = 0; j < length; j++) {
                    arr[i][j] = input.charAt(j);
                }
            }

            // 배열 출력
            System.out.print("#" + tc + " ");
            for (int i = 0; i < maxCol; i++) {
                for (int j = 0; j < TCase; j++) {
                    if (arr[j][i] != '\u0000') { // 널 문자가 아닐 때 출력
                        System.out.print(arr[j][i]);
                    }
                }
            }
            System.out.println();
        }
    }
}
