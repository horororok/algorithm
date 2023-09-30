import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // HashMap을 사용하여 길이가 m 이상인 단어들과 그 개수를 저장
        Map<String, Integer> map = new HashMap<>();

        // n개의 단어를 읽으며, 길이가 m 이상인 단어의 등장 횟수를 세어 map에 저장
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            if (s.length() < m) continue; // 길이가 m 미만인 단어는 무시
            map.put(s, map.getOrDefault(s, 0) + 1); // 이미 나온 단어인 경우 카운트 증가, 처음 나온 단어인 경우 1로 설정
        }

        // map에서 단어들을 가져와서 ArrayList에 저장
        List<String> words = new ArrayList<>(map.keySet());

        // words 리스트를 정렬
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                // 자주 등장하는 단어 순서대로 정렬
                if (Integer.compare(map.get(a), map.get(b)) != 0) {
                    return Integer.compare(map.get(b), map.get(a));
                }
                // 등장 횟수가 같으면 길이가 긴 단어가 먼저 오도록 정렬
                if (a.length() != b.length()) {
                    return b.length() - a.length();
                }
                // 등장 횟수와 길이가 같으면 사전 순으로 정렬
                return a.compareTo(b);
            }
        });

        // 정렬된 단어들을 출력
        for (String str : words) {
            bw.write(str);
            bw.newLine();
        }

        // 버퍼 비우고 닫기
        bw.flush();
        br.close();
        bw.close();
    }
}