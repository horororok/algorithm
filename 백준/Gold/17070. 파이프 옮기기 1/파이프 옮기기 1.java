import java.util.*;

public class Main {

    public static void main(String[] args) {

    	//x,y 까지 파이프를 이동시킬 수 있는 방법의 수 : dp[x][y][3] 
    	//0 가로, 1 세로, 2 대각
    	//dp[x][y][0] += dp [x][y - 1][0] + dp[x][y - 1][2]
    	//dp[x][y][1] += dp [x - 1][y][1] + dp[x - 1][y][2]
    	//dp[x][y][2] += dp [x - 1][y - 1][0] + dp[x - 1][y - 1][1] + dp[x - 1][y - 1][2]
    	
    	
    	
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int[][] house = new int[size + 1][size + 1];
        int[][][] dp = new int[size + 1][size + 1][3];

        for (int x = 1; x <= size; x++) {
            for (int y = 1; y <= size; y++) {
                house[x][y] = sc.nextInt();
            }
        }

        //시작 지점을 1로 초기화
        dp[1][2][0] = 1;

        //순회하면서 경로의 개수 계산
        for (int x = 1; x <= size; x++) {
            for (int y = 1; y <= size; y++) {

            	//벽이 있으면 건너 뛴다
                if (house[x][y] == 1)
                    continue;

                //왼쪽과 위쪽에서 오는 경로의 수 계산
                dp[x][y][0] += dp[x][y - 1][0] + dp[x][y - 1][2];
                dp[x][y][1] += dp[x - 1][y][1] + dp[x - 1][y][2];

                //위쪽과 왼쪽 셀에 벽이 없는 경우, 대각선 경로 계산
                if (house[x - 1][y] == 0 && house[x][y - 1] == 0) {
                    dp[x][y][2] += dp[x - 1][y - 1][0] + dp[x - 1][y - 1][1] + dp[x - 1][y - 1][2];
                }
            }
        }

        System.out.println(dp[size][size][0] + dp[size][size][1] + dp[size][size][2]);

    }
}