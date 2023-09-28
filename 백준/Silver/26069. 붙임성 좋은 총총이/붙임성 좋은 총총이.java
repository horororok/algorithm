
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

//map 사용
public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		sc.nextLine();
		Map<String, Boolean> rainbow = new HashMap<>(); // true이면 춤

		for (int i = 0; i < N; ++i) {
			String[] names = sc.nextLine().split(" ");

			String a = names[0]; // 첫 번째 이름
			String b = names[1]; // 두 번째 이름

			if (a.equals("ChongChong") || b.equals("ChongChong")) {
				// 총총이라는 이름이 있다면 둘 다 춤
				rainbow.put(a, true);
				rainbow.put(b, true);
				continue;
			}

			// 한 명이라도 춤을 추고 있다면 나머지도 춤을 춤
			if (rainbow.containsKey(a)) {
				if (rainbow.get(a)) {
					rainbow.put(b, true);
					continue;
				}
			}
			// 한 명이라도 춤을 추고 있다면 나머지도 춤을 춤
			if (rainbow.containsKey(b)) {
				if (rainbow.get(b)) {
					rainbow.put(a, true);
					continue;
				}
			}

			// 아무도 춤을 추고 있지 않다면 둘 다 false
			rainbow.put(a, false);
			rainbow.put(b, false);
		}

		int count = 0;
		Set<Entry<String, Boolean>> entrySet = rainbow.entrySet(); // rainbow entrySet
		Iterator<Entry<String, Boolean>> entryIterator = entrySet.iterator(); // entrySet의 이터레이터
		while (entryIterator.hasNext()) {
			Entry<String, Boolean> entry = entryIterator.next();
			Boolean v = entry.getValue(); // 이터레이터의 값을 가져옴
			if (v)
				count++; // 값이 true면 count를 증가
		}

		System.out.print(count);
	}
}
