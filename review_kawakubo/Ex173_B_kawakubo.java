package review_kawakubo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex173_B_kawakubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
		 * 川久保注
		 * 
		 */
		int n = sc.nextInt();
		String[] judge = new String[n];
		/*
		 * 川久保注
		 * この部分でAC, WA, TLE, REのデータを
		 * 配列に詰め込む
		 * 理由は下の方に説明しています。
		 * この部分がメソッドとして切り出されるはずです。
		 */
		for (int i = 0; i < n; i++) {
			judge[i] = sc.next();
		}

		Map<String, Integer> map = new HashMap<>();
		
		String[] status = { "AC", "WA", "TLE", "RE" };
		for (int i = 0; i < 4; i++) {
			map.put(status[i], 0);
		}
		
		/*
		川久保注
		以下のコードでも全く問題ないですが、
		汎用性を持たせるにはAC, WA, TLE, RE
		を配列に詰め込む操作と、それをカウントアップ
		する操作は分けて考えた方が無難です。
		Nは1～100_000という制約があるので、
		人間が入力するわけではなく、外部から受け取る
		データをカウントアップする可能性もあるので、
		データを生成する処理、カウントアップする処理
		は分離します。
		for (int i = 0; i < 4; i++) {
			map.put(status[i], 0);
		}
			
		for (int j = 0; j < n; j++) {
			
			String s = sc.next();

			map.put(s, map.get(s) + 1);
		}
		*/
		
		for (String s: judge) {
			map.put(s, map.get(s) != null ? map.get(s) + 1: 1);
		}
		
		System.out.println("AC x " + map.get("AC"));
		System.out.println("WA x " + map.get("WA"));
		System.out.println("TLE x " + map.get("TLE"));
		System.out.println("RE x " + map.get("RE"));

		sc.close();
	}

}
