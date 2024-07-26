package review_kawakubo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex173_B_kawakubo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] status = { "AC", "WA", "TLE", "RE" };

		/*
		 * 川久保注
		 * 以下のように細かくメソッドを分離することで
		 * 可読性、テスト性、保守性が増します。  
		 */
		// counterの初期化
		Map<String, Integer> judgeCounter = initJudge(status);
		// AC, WA, TLE, REの入力
		String[] judges = inputJudge(n , sc);
		// AC, WA, TLE, REのカウントアップ
		countJudge(judgeCounter, judges);
		// counterの表示
		pringCounter(judgeCounter);

		sc.close();
	}

	private static Map<String, Integer> initJudge(String[] status) {
		Map<String, Integer> result = new LinkedHashMap<>();
		for (int i = 0; i < status.length; i++) {
			result.put(status[i], 0);
		}
		return result;
	}
	private static String[] inputJudge(int n, Scanner sc) {
		String[] result = new String[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.next();
		}
		return result;
	}
	private static void countJudge(Map<String, Integer> map , String[] judges) {
		for (String s: judges) {
			map.put(s, map.get(s) != null ? map.get(s) + 1: 1);
		}
	}
	private static void pringCounter(Map<String, Integer> counter) {
		for (String judge: counter.keySet()) {
			System.out.printf("%s x %d%n", judge, counter.get(judge));
		}
	}
}
