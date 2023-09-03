import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		int xc []= new int[T];
		int yc [] = new int [T];
		for(int tc = 0; tc<T; tc++) {
			xc[tc] = sc.nextInt();
			yc[tc] = sc.nextInt();
			
		}
		
		int xmax = Integer.MIN_VALUE;
		int xmin = Integer.MAX_VALUE;
		for(int i = 0; i<T; i++) {
			if(xc[i]>xmax) {
				xmax = xc[i];
			}
			if(xc[i]<xmin) {
				xmin = xc[i];
			}
		}
		
		int ymax = Integer.MIN_VALUE;
		int ymin = Integer.MAX_VALUE;
		for(int i = 0; i<T; i++) {
			if(yc[i]>ymax) {
				ymax = yc[i];
			}
			if(yc[i]<ymin) {
				ymin = yc[i];
			}
		}
		
		int ans = (xmax - xmin)*(ymax - ymin);
		System.out.println(ans);
		
	}
}