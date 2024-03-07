import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        int[] counting = new int[8001];  // -4000부터 4000까지의 값의 빈도수를 저장하는 배열
        int maxFrequency = 0;
        
        for (int number : numbers) {
            counting[number + 4000]++;
            maxFrequency = Math.max(maxFrequency, counting[number + 4000]);
        }
        
        int mode = 0;  // 최빈값, 갯수가 같을 경우 두 번째로 작은 값 출력
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        
        for (int i = 0; i < counting.length; i++) {
            if (counting[i] == maxFrequency) {
                if (firstMin == Integer.MAX_VALUE) {
                    firstMin = i - 4000;
                } else {
                    secondMin = i - 4000;
                    break;
                }
            }
        }
        
        mode = (secondMin != Integer.MAX_VALUE) ? secondMin : firstMin;

        int mean = Math.round((float) Arrays.stream(numbers).sum() / N);
        
        
        Arrays.sort(numbers);
        int median = numbers[N / 2];

        int range = numbers[N - 1] - numbers[0];

        System.out.println(mean);
        System.out.println(median);
        System.out.println(mode);
        System.out.println(range);

        sc.close();
    }
}