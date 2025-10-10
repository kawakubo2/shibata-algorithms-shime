package review;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex426_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : str.toCharArray()) {
			// 値がない場合デフォルト値を取得
			map.put(c, map.getOrDefault(map, 0) + 1);
		}

		sc.close();

		// もしカウントが1ならその文字が他の文字と異なる一文字である
		for (char c : str.toCharArray()) {
			if (map.get(c) == 1) {
				System.out.println(c);
				return;
			}
		}
	}

}
