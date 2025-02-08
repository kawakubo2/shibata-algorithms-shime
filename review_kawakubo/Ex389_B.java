package review_kawakubo;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex389_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		// long start = System.nanoTime();
		Map<Long, Integer> factorials = createFactorialMap();
		// System.out.println("準備処理: " + (System.nanoTime() - start) + "ns");

		
		// for (Long num: factorials.keySet()) {
		// 	System.out.println(num + ": " + factorials.get(num));
		// }

		long x = sc.nextLong();
		
		if (factorials.get(x) != null) {
			System.out.println(factorials.get(x));
		} else {
			System.out.println("該当なし");
		}

		sc.close();
		
	}

	public static Map<Long, Integer> createFactorialMap() {
		Map<Long, Integer> result = new LinkedHashMap<>();
		long factorial = 1L;
		int n = 1;
		result.put(factorial, 1);
		while(true) {
			n++;
			factorial *= n;
			if (n > 20) break;
			result.put(factorial, n);
		}
		return result;
	}

}
