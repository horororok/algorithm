import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main  {
    public static void main(String[] args) throws Exception {
      
      //새로운 사람이 입장한 이후 첫 채팅을 입력하는 사람은 반드시 곰곰티콘으로 인사를 한다.
      //ENTER은 새로운 사람이 채팅방에 입장했음을 나타낸다.
      //그 외의 경우는 채팅을 입력한 유저의 닉네임
      //곰곰티콘이 사용된 횟수 구하기
      //첫번째 주어지는 문자열은 무조건 ENTER이다.

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

      int N = Integer.parseInt(br.readLine()); //정수형으로 변환하여 N에 저장
      
      int gomgom = 0; //gomgom을 0으로 초기화

      HashSet<String> set = new HashSet<>(); //set을 HashSet으로 선언

      while(N-- > 0) { //N이 0보다 크면 반복
        String str = br.readLine(); //문자열을 입력받아 str에 저장
        if(str.equals("ENTER")) { //str이 "ENTER"이면
        set = new HashSet<>(); //set을 HashSet으로 초기화
        continue; //다음 반복으로 넘어감
        }
        if(!set.contains(str)) { //set에 str이 포함되어 있지 않으면
          gomgom++; //gomgom을 1 증가
          set.add(str); //set에 str을 추가
        }

      }
      System.out.println(gomgom); //gomgom 출력
    }
}