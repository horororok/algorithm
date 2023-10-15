import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    static char[] arr; 

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String tmp;

        while ((tmp = br.readLine()) != null) {
            int N = (int) Math.pow(3, Integer.parseInt(tmp)); // 입력 값을 기반으로 N을 계산

            arr = new char[N]; // N 길이의 문자 배열을 생성합

            for (int i = 0; i < N; i++)
                arr[i] = ' '; // 배열을 공백 문자로 초기화

            makeString(0, N - 1, N); // makeString 메서드를 호출하여 문자열을 생성

            for (char c : arr)
                bw.write(c); 
            
            bw.newLine(); 
            bw.flush(); 
        }

        System.out.println(sb); // 아무 내용도 없는 StringBuilder를 출력
    }

    static void makeString(int first, int last, int len) {
        if (len == 1) {
            arr[first] = '-'; // len이 1이면 배열의 첫 번째 요소에 '-' 문자를 저장
            return; // 재귀를 종료
        }

        int tmp_len = len / 3; // 문자열을 세 부분으로 나누기 위한 길이를 계산합
        makeString(first, first + tmp_len - 1, tmp_len); // 왼쪽 부분 생성
        makeString(last - tmp_len + 1, last, tmp_len); // 오른쪽 부분 생성
    }
}