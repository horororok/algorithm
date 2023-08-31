import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String N = sc.next();
        int B = sc.nextInt();

        int len = N.length();
        long ans = 0;
        for (int i = 0; i < len; i++) {
            char c = N.charAt(i);

            int digitValue = 0;
            if (c >= '0' && c <= '9') {
                digitValue = c - '0';
            } else {
                digitValue = c - 'A' + 10;
            }

            int power = len - 1 - i;
            ans += digitValue * Math.pow(B, power);
        }
        System.out.println(ans);
    }
}