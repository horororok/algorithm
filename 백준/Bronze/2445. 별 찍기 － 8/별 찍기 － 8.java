import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i= 1; i<n+1; i++) {
			for(int j = 0; j<2*n;j++) {
				if(j<i) {
					System.out.print("*");
				}else if(j<2*n -i) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i = n-1; i>0; i--) {
			for(int j = 2*n-1; j>=0;j--) {
				if(i>j) {
					System.out.print("*");
				}else if(2*n-i<=j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
	}
}