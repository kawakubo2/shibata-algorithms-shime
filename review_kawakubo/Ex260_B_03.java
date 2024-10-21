package review_kawakubo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex260_B_03 {

	/*
	 * 受験者ごとの点数を格納するクラスを用意します
	 */
	private static class Score {
		int num; // 受験者番号
		int math;
		int english;
		int getTotal() {
			return this.math + this.english;
		}
		@Override
		public String toString() {
			return "Score: num=" + num + " math=" + math + " english=" + english + " total=" + getTotal();
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		// Scoreのリストにデータを詰め込む処理をprepareメソッドに委任
		List<Score> scores = prepare(sc, n);
		/*
		 * 今回は合格者に順序は付けず、受験者の番号だけわかればいいので
		 * 合格者した受験者の番号を格納するリストを用意します。
		 * 条件1, 2, 3で合格者を格納した時点でソートします。
		 */
		List<Integer> nums = new ArrayList<>();

		// 数学の降順でソート
		scores.sort((a, b) -> {
			if (a.math < b.math) {
				return 1;
			} else if (a.math == b.math) {
				return a.num - b.num; // 点数が同じ場合、受験者の番号順にする
			} else {
				return -1;
			}
		});
		// printList(scores);
		for (int i = 0; i < x; i++) {
			nums.add(scores.get(i).num);
		}
		/*
		 * 削除しないと、他の基準でもう一回合格者になってしまうので
		 * 合格者をscoresから削除します。
		 */
		for (int i = 0; i < x; i++) {
			scores.remove(0);
		}
		
		// 英語の降順でソート
		scores.sort((a, b) -> {
			if (a.english< b.english) {
				return 1;
			} else if (a.english== b.english) {
				return a.num - b.num;
			} else {
				return -1;
			}
		});
		// printList(scores);
		for (int i = 0; i < y; i++) {
			nums.add(scores.get(i).num);
		}
		for (int i = 0; i < y; i++) {
			scores.remove(0);
		}

		// 合計の降順でソート
		scores.sort((a, b) -> {
			if (a.getTotal()< b.getTotal()) {
				return 1;
			} else if (a.getTotal()== b.getTotal()) {
				return a.num - b.num;
			} else {
				return -1;
			}
		});
		// printList(scores);
		for (int i = 0; i < z; i++) {
			nums.add(scores.get(i).num);
		}
		nums.sort((a, b) -> a - b);
		for (int i = 0; i < z; i++) {
			scores.remove(0);
		}

		nums.sort((a, b) -> a - b);
		for (int num: nums) {
			System.out.println(num);
		}

		sc.close();

	}

	private static List<Score> prepare(Scanner sc, int n) {
		List<Score> scores = new ArrayList<>(n);
		for (int i = 1; i <= n; i++) {
			Score score = new Score();
			score.num = i;
			score.math = sc.nextInt();
			scores.add(score);
		}
		for (int i = 1; i <= n; i++) {
			Score score = scores.get(i - 1);
			score.english = sc.nextInt();
		}

		return scores;
	}

	/*
	private static void printList(List<Score> scores) {
		for (Score score: scores) {
			System.out.println(score);
		}
	}
	*/
}
