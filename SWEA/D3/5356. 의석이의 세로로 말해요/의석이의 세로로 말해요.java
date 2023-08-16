

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException {
        
        //System.setIn(new FileInputStream("src/Day0816_5356/input_5356.txt"));

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt(); // 테스트 케이스의 개수 입력
        sc.nextLine(); // 개행 문자 제거

        // 각 테스트 케이스에 대해 반복
        for (int tc = 1; tc <= T; tc++) {
        	// 각 테스트 케이스는 다섯 줄로 이루어져 있음
            int TCase = 5; 
         // 최대 열 개수를 15로 설정
            char[][] arr = new char[TCase][15]; 

         // 열의 최대 개수 초기화
            int maxCol = 0; 

            // 각 줄에 대해 반복
            for (int i = 0; i < TCase; i++) {
            	 // 문자열 입력
                String input = sc.nextLine();
                // 최대 길이 15로 제한
                int length = Math.min(15, input.length());
             // 열의 최대 개수 갱신
                maxCol = Math.max(maxCol, length); 

                // 문자열을 문자 하나하나로 쪼개서 배열에 저장
                for (int j = 0; j < length; j++) {
                    arr[i][j] = input.charAt(j);
                }
            }

            // 출력 시작
            System.out.print("#" + tc + " ");

            // 열 기준으로 출력
            for (int i = 0; i < maxCol; i++) {
                for (int j = 0; j < TCase; j++) {
                    // 해당 열에 값이 있을 때만 출력
                    if (arr[j][i] != '\u0000') {
                        System.out.print(arr[j][i]);
                    }
                }
            }

            // 줄 바꿈
            System.out.println();
        }
    }
}
