package review_kawakubo;

public class Ex51_B_kawakubo {

	public static void main(String[] args) {
		final int kMax = 10;

		long sStart = System.nanoTime();
		int[] ans1 = new int[kMax * kMax * 3];
		shime(kMax, ans1);
		long sEnd = System.nanoTime();
		System.out.printf("処理時間: %dナノ秒%n", (sEnd - sStart));

		printAnswers(ans1);	
		//
		long kStart = System.nanoTime();
		int[] ans2 = new int[kMax * kMax * 3];
		kawakubo(kMax, ans2);
		long kEnd = System.nanoTime();
		System.out.printf("処理時間: %8dナノ秒%n", (kEnd - kStart));
		// printAnswers(ans2);

		System.out.println(judge(ans1, ans2) ? "一致": "不一致");
	}
	private static void shime(int kMax, int[] answers) {
		int i = 0;
		for (int k = 2; k <= kMax; k++) {
			for (int s = 0; s <= kMax * 3; s++) {
				int ans = 0;
				System.out.printf("k=%4d, s=%4d, ", k, s);
				long start = System.nanoTime();
				for (int x = 0; x <= k; x++) {
					for (int y = 0; y <= k; y++) {
						if (x + y <= s && (s - x - y) <= k) {
							ans++;
						}
					}
				}
				long end = System.nanoTime();
				System.out.printf("perf=%8dns%n", end - start);	
				answers[i++] = ans;
			}
		}
	}
	private static void kawakubo(int kMax, int[] answers) {
		int i = 0; 
		for (int k = 2; k <= kMax; k++) {
			for (int s = 0; s <= kMax * 3; s++) {
				int ans = 0;
				System.out.printf("k=%4d, s=%4d, ", k, s);
				long start = System.nanoTime();
				for (int x = 0; x <= k; x++) {
					for (int y = 0; y <= k; y++) {
						int z = s - x - y;
						if (z < 0) break;
						if (z <= k) ans++;
					}
				}
				long end = System.nanoTime();
				System.out.printf("perf=%8dns%n", end - start);	
				answers[i++] = ans;
			}
		}
	}
	private static void printAnswers(int[] answers) {
		for (var a: answers) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	private static boolean judge(int[] ans1, int[] ans2) {
		if (ans1.length != ans2.length) throw new IllegalArgumentException("テスト回数不一致");
		for (int i = 0; i < ans1.length; i++) {
			if (ans1[i] != ans2[i]) return false;
		}
		return true;
	}
}
