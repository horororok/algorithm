import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		long n = sc.nextInt();
		
		long ans = 0;
		for(int i = 1; i<n; i++) {
			ans+=i;
		}
		
		System.out.println(ans);
		System.out.println(2);
		
	}

}