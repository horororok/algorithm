import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int fiveq = N / 5;
        int fiver = N % 5;
        int thrq = 0;
        int thrr = 0;

        if (fiver == 0) {
            System.out.println(fiveq);
        } else {
            while (fiveq >= 0) {
                if (fiver % 3 == 0) {
                    thrq = fiver / 3;
                    System.out.println(fiveq + thrq);
                    return;
                }
                fiveq--;
                fiver += 5;
            }
            System.out.println(-1);
        }
    }
}