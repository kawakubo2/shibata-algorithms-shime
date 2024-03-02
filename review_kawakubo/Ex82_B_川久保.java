package review_kawakubo;

import java.util.Comparator;
import java.util.Scanner;

public class Ex82_B_川久保 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();

		sort(sChar);
		reverse(tChar);
		
		String s1 = new String(sChar);
		String s2 = new String(tChar);
		// Stringクラスが持っているcompareToのロジックを解いてほしいというのが
		// この問題の趣旨であると思います。今回はComparatorを実装したStringComparator
		// を作成してみました。
		//if(s1.compareTo(s2) < 0) {
		StringComparator comparator = new StringComparator();
		if (comparator.compare(s1, s2) < 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	
	}
	
	//降順ソート
	public static void sort(char[] array) {
		
		for (int i = 0; i < array.length -1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] < array[i]) {
					char temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		
	}
	
	//逆順ソート
	public static void reverse(char[] array) {
		 int n = array.length;
		 
		 for(int i = 0; i < n /2; i++) {
			 char temp = array[i];
			 
			 array[i] = array[n -i -1];
			 
			 array[n - i -1] = temp;
		 }
	}

	private static class StringComparator implements Comparator<String> {
		public int compare(String s1, String s2) {
			int len = s1.length() >= s2.length() ? s1.length() : s2.length();
			// この部分が先頭から比較する部分。1つでのs1の方がs2より小さければ
			// s1が小さいことになります。for文がreturnせずに終わったら短い文字列
			// と長い文字列は、この時点ではまだ判定できません。
			for (int i = 0; i < len; i++) {
				if (s1.charAt(i) < s2.charAt(i)) {
					return -1;
				} else if (s1.charAt(i) > s2.charAt(i)) {
					return 1;
				} else {
					continue;
				}
			}
			// 上記で判定できない場合、文字数が多い方を大きいとみなすので引き算するだけですね。
			// 引き算はオーバーフローを起こすから駄目だと書いてある参考書や記事を見かけますが、
			// この場合文字列なので2の31乗以上になることはないので問題ありません。
			return s1.length() - s2.length();
		}
	}
}
