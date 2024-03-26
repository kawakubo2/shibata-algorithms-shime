package review;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex91_B {

	//他の人のコードをコピペしただけ
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Map<String, Integer> blue = new HashMap<String, Integer>();

		for (int i = 0; i < n; i++) {
			String ball = sc.next();
			blue.put(ball, blue.getOrDefault(ball, 0) + 1);
		}

		int m = sc.nextInt();

		Map<String, Integer> red = new HashMap<>();
		for (int i = 0; i < m; i++) {
			String ball = sc.next();
			red.put(ball, red.getOrDefault(ball, 0) + 1);
		}

		int ans = 0;
		for (String ball : blue.keySet()) {
			int countBlue = blue.get(ball);
			int countRed = red.getOrDefault(ball, 0);
			ans = Math.max(ans, countBlue - countRed);
		}

		System.out.println(ans);

		sc.close();
	}

}
