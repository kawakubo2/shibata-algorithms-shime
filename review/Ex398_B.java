package review;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex398_B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		//カードの枚数は定数７枚
		final int FULLHOUSE = 7;

		//カードの手札用Map
		Map<Integer, Integer> map = putCards(sc, FULLHOUSE);

		//Mapにちゃんと入っているか確認したかったのでテスト用表示メソッド
		showMapTest(map);

		//手札に２組の札があるか
		boolean isTwo = checkTwo(map);
		
		//手札に３組の札があるか
		boolean isThree = checkThree(map);

		//結果（フルハウスか）を表示するメソッド
		showResult(isTwo, isThree);
		
	}

	//Mapに手札を格納　Keyがカードの数字、Valueが枚数
	public static Map<Integer, Integer> putCards(Scanner sc, int FULLHOUSE) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < FULLHOUSE; i++) {
			int card = sc.nextInt();
			if (map.containsKey(card)) {
				map.put(card, map.get(card) + 1);
			} else {
				map.put(card, 1);
			}
		}
		return map;

	}

	//テスト
	public static void showMapTest(Map<Integer, Integer> map) {

		for (Integer num : map.keySet()) {
			System.out.println(num + "の枚数 = " + map.get(num));
		}

	}

	//手札の中に2組があるか
	public static boolean checkTwo(Map<Integer, Integer> map) {

		boolean isTwo = false;

		for (Integer num : map.keySet()) {
			if (map.get(num) >= 2) {
				isTwo = true;
			}
		}

		return isTwo;

	}

	//手札の中に3組があるか
	public static boolean checkThree(Map<Integer, Integer> map) {

		boolean isThree = false;

		for (Integer num : map.keySet()) {
			if (map.get(num) >= 3) {
				isThree = true;
			}
		}

		return isThree;

	}
	
	//フルハウスかどうかYes/Noで表示する
	public static void showResult(boolean isTwo, boolean isThree) {
		
		if (isTwo && isThree) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
