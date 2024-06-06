package review_kawakubo;

public class Ex077_B_100000 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		final int n = 100_000;
		int match = 0;
		for (int i = 1; i <= n; i++) {
			if (maxSquareShime(i) == maxSquareKawakubo(i)) match++;
		}
		System.out.println(n == match ? "合格": "不合格");
		long end = System.currentTimeMillis();
		System.out.println("処理時間: " + (end - start) + "ms");
	}

	public static long maxSquareShime(long n) {
		long ans = 0;
		for(long i = 0; i <= n; i++) {
			if(i * i <= n) {
				ans = i * i;
			}
		}
		return ans;
	}
	public static long maxSquareKawakubo(long n) {
		long maxSquare = 0;
		long left = 0;
		long right = n;
		while (left <= right) {
			long mid = (left + right) / 2;
			long square = mid * mid;
			if (square > n) right = mid - 1;
			if (square <= n) {
				left = mid + 1;
				maxSquare = square;
			}
		}
		return maxSquare;
	}
}