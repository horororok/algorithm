import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int result = 50;

        for (int i = 0; i <= (B.length() - A.length()); i++) {
            int count = 0;
            for (int j = 0; j < A.length(); j++) {
                if (A.charAt(j) != B.charAt(j + i)) {
                    count++;
                }
            }
            result = Math.min(result, count);
        }
        System.out.println(result);
    }
}