package review_kawakubo;

import java.util.Arrays;
import java.util.Scanner;

public class Ex201_B {

	private static class Mountain {
		public int height;
		public String name;
		public Mountain(int height, String name) {
			this.height = height;
			this.name = name;
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		/*
		 * 川久保コメント
		 * 今回は内部クラス(Mountainクラス)の配列を使って解いてみます。
		 * クラスで管理すると、1年間の登山者数、初登頂した日付など
		 * 仕様変更が発生した時など、Comparatorだけ切り替えればよくなる
		 * というメリットがあります。
		 * また、privateな内部クラスであるため、他の利用者に影響を与える
		 * ことなく変更しやすくなります。
		 */
		var list = new Mountain[n];
		
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			int height = sc.nextInt();
			list[i] = new Mountain(height, str);
		}
		// 高さ順に並べるため、Comparatorをラムダ式で指定
		Arrays.sort(list, (m1, m2) -> m1.height - m2.height);
		// 降順なので後ろから二番目がsecond heighest mountain
		System.out.println(list[n -2].name);

		sc.close();
	}

}
