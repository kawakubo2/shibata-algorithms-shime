package review;

import java.util.Scanner;

public class Ex073_01_改訂 {

	static Scanner sc = new Scanner(System.in);

	static class Seat {

		//団体数
		int n;

		public Seat(int n) {
			this.n = n;
		}

		public int getN() {
			return n;
		}

	}

	public static void main(String[] args) {
		
		//団体数を入力
		int n = sc.nextInt();
		
		//Seatクラスのインスタンスに予約団体数を引数で渡す
		Seat seat = new Seat(n);
		
		//予約席数を計算する
		int count = countReservedSeat(seat.getN());
		
		showReservedSeat(count);

		sc.close();
	}

	//予約済みの席数を計算する
	public static int countReservedSeat(int n) {
		
		int count = 0;
		
		int[] l = new int[n];
		int[] r = new int[n];
		
		for(int i = 0; i < n; i++) {
			l[i] = sc.nextInt();
			r[i] = sc.nextInt();
			count += r[i]- l[i] + 1;
		}

		sc.close();

		return count;
	}
	
	//予約済みの席を表示する
	public static void showReservedSeat(int count) {
		System.out.println(count);
	}
}
