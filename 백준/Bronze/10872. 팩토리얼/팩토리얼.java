import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int num = 1;
		for(int i = 1; i<n+1; i++) {
			num *= i;
		}
		System.out.println(num);
		
	}
}
