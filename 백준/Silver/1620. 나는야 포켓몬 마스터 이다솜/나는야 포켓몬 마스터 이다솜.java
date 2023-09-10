import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
//		System.setIn(new FileInputStream("src/input_1620.txt"));

		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split(" ");
		int m = Integer.parseInt(arr[0]);
		int n = Integer.parseInt(arr[1]);

		HashMap<String, Integer> map1 = new HashMap<>();
		HashMap<Integer, String> map2 = new HashMap<>();
		for (int i = 1; i <= m; i++) {
			String pn = sc.nextLine();
			map1.put(pn, i);
			map2.put(i, pn);

		}
//		System.out.println(map1);
//		System.out.println(map2);
//		System.out.println(map1.get("Bulbasaur"));

		for (int _ = 0; _ < n; _++) {
			String test = sc.nextLine();
			
			if (isNumber(test)) {
				System.out.println(map2.get(Integer.parseInt(test)));
			} else {
				System.out.println(map1.get(test));
			}

		}

	}

	public static boolean isNumber(String strnum) {
		try {
			Integer.parseInt(strnum);
			return true;
		} catch (NumberFormatException ex) {
			return false;
		}
	}

}