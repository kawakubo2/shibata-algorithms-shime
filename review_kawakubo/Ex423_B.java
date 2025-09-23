package review_kawakubo;

import java.util.Scanner;

public class Ex423_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int door[] = new int[n];

		prepare(door, sc);

		// 部屋0にいる人
		int firstIndex = getFirstIndex(door);

		// 部屋Nにいる人(末尾の人)
		int lastIndex = getlastIndex(door);

		// 行けない部屋の個数を調べる
		int result = judgeNumberOfRooms(firstIndex, lastIndex, door);

		// 正解を表示
		showResult(result);

		sc.close();
	}

	// 配列に格納
	public static void prepare(int[] door, Scanner sc) {

		for (int i = 0; i < door.length; i++) {
			door[i] = sc.nextInt();
		}
	}

	// 部屋0にいる人どこまで行けるか計算
	public static int getFirstIndex(int[] door) {

		int firstIndex = -1;

		for (int i = 0; i < door.length; i++) {
			if (door[i] != 0) {
				firstIndex = i;
				break;
			}
		}
		return firstIndex;
	}

	// 部屋Nにいる人(末尾の人)どこまで行けるか計算
	public static int getlastIndex(int[] door) {
		int lastIndex = -1;
		for (int i = door.length - 1; i >= 0; i--) {
			if (door[i] != 0) {
				lastIndex = i;
			}
		}
		return lastIndex;
	}

	public static int judgeNumberOfRooms(int firstIndex, int lastIndex, int[] door) {

		// indexが同じだったら部屋数は一部屋だけ行けない
		/*
		 * 川久保注
		 * indexが同じなら、鍵のある前後の部屋まで到達できているので
		 * 到達できない部屋は0になります。
		 */
		if (firstIndex == lastIndex) {
			System.out.println("firstIndex=" + firstIndex + " lastIndex=" + lastIndex);
			return 0;
		}

		return lastIndex - firstIndex;
	}

	public static void showResult(int result) {
		System.out.println(result);
	}
}
