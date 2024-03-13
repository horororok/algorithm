import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws Exception{
    //자주 나오는 단어를 앞에 배치
    //해당 단어의 길이가 갈수록 앞에 배치한다.
    //알파벳 사전 순으로 앞에 있는 단어일수록 앞에 배치한다.
    //길이가 M이상인 단어들만 외울 것


    //첫째 줄은 단어 개수 N, 단어의 길이 기준 M이 주어진다.
    //둘째 줄부터 N+1 번째 줄까지 외울 단어를 입력받는다.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력을 받기 위한 BufferedReader 객체 생성
    
    String[] input = br.readLine().split(" ");  //공백을 기준으로 입력을 나눠서 배열에 저장
    
    int N = Integer.parseInt(input[0]); //배열의 첫번째 원소를 정수형으로 변환하여 N에 저장
    int M = Integer.parseInt(input[1]); //배열의 두번째 원소를 정수형으로 변환하여 M에 저장

    Map<String, Integer> map = new HashMap<>(); //단어와 단어의 빈도수를 저장하기 위한 Map 객체 생성

    for(int i=0; i<N; i++){ //N번 반복
      String word = br.readLine(); //단어를 입력받아 word에 저장
      if(word.length() < M) continue; //만약 단어의 길이가 M보다 작다면 continue
      map.put(word, map.getOrDefault(word, 0) + 1); //map에 단어와 단어의 빈도수를 저장
    }

    List<String> list = new ArrayList<>(map.keySet()); //map의 key값들을 list에 저장

    //1. 길이가 M 미만인 단어 제거
    //2. 자주 나오는 단어를 앞에 배치
    //3. 길이가 긴 단어를 앞에 배치
    //4. 알파벳 사전 순으로 앞에 있는 단어를 앞에 배치

    list.sort((a, b) -> { //list를 정렬
      if(map.get(a) == map.get(b)){ //만약 a와 b의 빈도수가 같다면
        if(a.length() == b.length()){ //만약 a와 b의 길이가 같다면
          return a.compareTo(b); //a와 b를 사전순으로 정렬
        }
        return b.length() - a.length(); //a와 b의 길이가 다르다면 길이가 긴 단어를 앞에 배치
      }
      return map.get(b) - map.get(a); //a와 b의 빈도수가 다르다면 빈도수가 높은 단어를 앞에 배치
    });


    StringBuilder sb = new StringBuilder(); //문자열을 더하기 위한 StringBuilder 객체 생성

    for(String word : list){ //list를 반복
      sb.append(word).append("\n"); //sb에 단어를 추가
    }

    System.out.println(sb); //sb를 출력

  }
}