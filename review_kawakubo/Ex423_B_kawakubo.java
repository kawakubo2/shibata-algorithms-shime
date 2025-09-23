package review_kawakubo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex423_B_kawakubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		List<Integer> locks = new ArrayList<>();

		prepare(locks, n, sc);

		// 行けない部屋の個数を調べる
		int result = getNumberOfRooms(locks);

		// 正解を表示
		showResult(result);

		sc.close();
	}

	// 配列に格納
	public static void prepare(List<Integer> doors, int size, Scanner sc) {

		for (int i = 0; i < size; i++) {
			doors.add(Integer.valueOf(sc.nextInt()));
		}
	}

	public static int getNumberOfRooms(List<Integer> locks) {

		// int result = -1;

		// indexが同じだったら部屋数は一部屋だけ行けない
		/*
		 * 例えば
		 * 鍵の配列が 0 0 1 0 0
		 * であれば鍵は1つしかかかっておらず
		 * 0番目の人はそのカギの前の部屋
		 * N番目の人はそのカギの後ろの部屋まで
		 * 到達できますので、到達できない部屋は0になります。
		 * また、テストデータとして、1つも鍵が掛かっていないケースも
		 * 用意しておいた方がいいかと思います。
		 * 
		 */
		// if (firstIndex == lastIndex) {
		// System.out.println("firstIndex=" + firstIndex + " lastIndex=" + lastIndex);
		// return result = 1;
		// }

		/*
		 * List#indexOf, lastIndexOfとも該当する要素が見つからない場合
		 * -1を返します。つまり、-1 - -1 = 0となり意図したとおり到達できない
		 * 部屋の数は0となります。
		 * また、indexOfとlastIndexOfが同じインデックスを返した場合も
		 * 部屋の数は0となります。
		 */
		return locks.lastIndexOf(1) - locks.indexOf(1);
	}

	public static void showResult(int result) {
		System.out.println(result);
	}
}
