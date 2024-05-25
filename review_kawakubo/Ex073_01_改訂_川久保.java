package review_kawakubo;

import java.util.Scanner;

public class Ex073_01_改訂_川久保 {

	static Scanner sc = new Scanner(System.in);

	static class Group{

		private int left;
		private int right;

		public Group(int left, int right) {
			this.left = left;
			this.right = right;
		}

		public int getNumberOfSeats() {
			return right - left + 1;
		}
	}

	public static void main(String[] args) {
		
		//団体数を入力
		final int n = sc.nextInt();
	
		Group[] groups = new Group[n];
	
		/*
		 * 川久保注
		 * メソッドの中に複数の機能を詰め込むことはNGですね。
		 * 特にユーザインタフェースと業務ロジックが同じメソッドに
		 * 入り込むと、仕様変更しづらくなります。
		 * 今回はメソッドにしましたが、ユーザ入力はクラスとして
		 * 設計するのが望ましいです。その際、インタフェースを
		 * 実装するようにするといい設計になってきます。
		 * (例えば、予約席の合計のロジックがユーザインタフェースから
		 * 独立するため、単独で使用できるようになるし、ユーザインタフェース
		 * を気にすることなくテストできるようにもなります。)
		 * 
		 * 今回の例であれば
		 * (1) 席を入力する(ここが本来クラスかされるべきところ)
		 * (2) 席の総数を計算する
		 * (3) 席の総数を表示する
		 * というように3つに分けた方がいいかと思います。
		 * 
		 */
		// (1) 席を入力する
		reserveSeats(groups);

		// (2) 席の総数を計算する
		int count = countReservedSeat(groups);
		
		// (3) 席の総数を表示する
		showReservedSeat(count);

		sc.close();
	}

	public static void reserveSeats(Group[] groups) {
		for (int i = 0; i < groups.length; i++) {
			groups[i] = new Group(sc.nextInt(), sc.nextInt());
		}
	}

	//予約済みの席数を計算する
	public static int countReservedSeat(Group[] groups) {
		
		int count = 0;
		
		for(Group g: groups) {
			count += g.getNumberOfSeats();

		}
		return count;
	}
	
	//予約済みの席を表示する
	public static void showReservedSeat(int count) {
		System.out.println(count);
	}
}
