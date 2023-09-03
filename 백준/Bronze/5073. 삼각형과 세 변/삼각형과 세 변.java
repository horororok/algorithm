import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);

		int[] arr = new int[3];
		
		while(true) {
			arr[0] = sc.nextInt();
			arr[1] = sc.nextInt();
			arr[2] = sc.nextInt();
			
			//0 0 0
			if(arr[0] == 0 && arr[1] == 0 && arr[2] ==0) {
				break;
			}
			
			Arrays.sort(arr);
			
			if(arr[2] >= arr[0] + arr[1]) {
				System.out.println("Invalid");
			}else if(arr[0] == arr[1] && arr[1] == arr[2]) {
				System.out.println("Equilateral");
			}else if(arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
				System.out.println("Isosceles");
			}else {
				System.out.println("Scalene");
			}
		}
		
		
	}
}