package review;

import java.util.Scanner;

public class Ex136_B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long startTime = System.nanoTime();
		int ans = getOddCount(n);
		long endtTime = System.nanoTime();
		System.out.println("処理時間: " + (endtTime - startTime));

		showAns(ans);

		sc.close();

	}

	public static int getOddCount(int n) {
		
		int ans = 0;
		
		for(int i=1; i<=n; i++) {
			if(Integer.toString(i).length()%2==1) {
				ans++;
			}
		}
		return ans;
	}
	
	public static void showAns(int ans) {
		
		System.out.println(ans);
	}
}
