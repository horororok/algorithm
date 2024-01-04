import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static int N, W, L; //트럭 수, 다리길이, 최대하중
    static Queue<Integer> bridge = new ArrayDeque<>();
    static int sum; //다리 위에 있는 트럭 무게 합

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        W = sc.nextInt();
        L = sc.nextInt();

        for (int i = 0; i < W; i++) { //다리길이만큼 큐에 0 넣어줌
            bridge.add(0);
        }

        //초기화
        sum = 0;
        int time = 0;

        int truck = sc.nextInt();

        while (true) { //더이상 넣을 트럭이 없을때까지 반복 (반복 1번에 시간+1)
            time++;

            sum -= bridge.poll();
            if (sum + truck <= L) { //새로운 트럭이 다리를 건널 수 있을 때
                bridge.add(truck);
                sum += truck;
                if (--N == 0) break; //더이상 새로운 트럭이 없으면 중단

                truck = sc.nextInt();

            } else { //새로운 트럭이 다리를 건널 수 없을 때 -> 0을 인자로 넣어주고 기다리게 함
                bridge.add(0);
            }
        }

        time += bridge.size(); //다리에 남아있는 트럭들 건너는 시간 합함
        System.out.println(time);
    }
}