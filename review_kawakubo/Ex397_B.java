package review_kawakubo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex397_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		final int FULLHOUSE = 7;

		int[] cards = new int[FULLHOUSE];

		// カードを配列に格納する
		addCards(cards, sc);

		// カードの数字と枚数をMapに格納する
		addCardsForMap(cards, map);

		// ちゃんと機能しているか表示している
		showMap(map);

		// カードの枚数部分だけ格納する配列
		int[] total = new int[map.size()];
		addAmountOfCards(total, map);

		// カードの枚数が2枚ある札があるか判断する
		// boolean flagfor2 = judgeForTwo(total);
		
		// カードの枚数が3枚ある札があるか判断する
		// boolean flagfor3 = judgeForThree(total);
		
		//フルハウスかどうかYesNoで表示する
		// showResult(flagfor2, flagfor3);

		System.out.println(isFullhouse(map) ? "Yes": "No");
		
		sc.close();
	}

	public static void addCards(int[] cards, Scanner sc) {

		for (int i = 0; i < cards.length; i++) {
			cards[i] = sc.nextInt();
		}
	}

	public static void addCardsForMap(int[] cards, Map<Integer, Integer> map) {

		for (int i = 0; i < cards.length; i++) {
			if (map.containsKey(cards[i])) {
				map.put(cards[i], map.get(cards[i]) + 1);
			} else {
				map.put(cards[i], +1);
			}
		}
	}

	public static void showMap(Map<Integer, Integer> map) {

		for (Integer num : map.keySet()) {
			System.out.println(num + ",  count数= " + map.get(num));
		}
	}

	public static void addAmountOfCards(int[] total, Map<Integer, Integer> map) {

		int count = 0;
		for (Integer num : map.keySet()) {
			total[count] = map.get(num);
			count++;
		}
	}

	/*
		public static boolean judgeForTwo(int[] total) {

		boolean flagfor2 = false;

		for (int i = 0; i < total.length; i++) {

			if (total[i] == 2) {
				flagfor2 = true;
			}
		}
		return flagfor2;
	}

	public static boolean judgeForThree(int[] total) {

		boolean flagfor3 = false;

		for (int i = 0; i < total.length; i++) {

			if (total[i] == 3) {
				flagfor3 = true;
			}
		}
		return flagfor3;
	}
	
	public static void showResult(boolean flagfor2, boolean flagfor3) {
		
		if (flagfor2 && flagfor3) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
	*/
	
	public static boolean isFullhouse(Map<Integer, Integer> map) {
		return map.containsValue(3) && map.containsValue(2);
	}
}
