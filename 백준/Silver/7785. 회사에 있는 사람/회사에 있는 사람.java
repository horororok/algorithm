import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		StringBuilder sb = new StringBuilder();

		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String key = sc.next();
			String val = sc.next();

			if (val.equals("enter")) {
				map.put(key, val);
			} else {
				map.remove(key);
			}
		}
		
		ArrayList<String> arr = new ArrayList<>(map.keySet());
		Collections.sort(arr, Collections.reverseOrder());
		
		for(String key : arr) {
			System.out.println(key);
		}

	}
}