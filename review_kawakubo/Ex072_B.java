package review_kawakubo;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
川久保注

JDKのStringクラスの説明の中に以下のような記述があります。
「Java言語は、文字列連結演算子( + )、およびその他のオブジェクトから文字列への変換に対する特別なサポートを提供します。文字列連結はStringBuilder (またはStringBuffer)クラスとそのappendメソッドを使って実装されています。文字列変換はObjectによって定義されたtoStringメソッドを使って実装され、Javaのクラスすべてによって継承されます。文字列連結および文字列変換についての詳細は、Gosling、Joy、およびSteeleによる『Java言語仕様』を参照してください。」

「文字列連結はStringBuilder (またはStringBuffer)クラスとそのappendメソッドを使って実装されています」とありますが、実際計測すると、文字列連結演算子+で文字列連結とStringBuffer#appnedでは処理速度が大きく異なります。
メモリは計測していませんが、GarbageCollectorの実行タイミング次第でメモリを圧迫するかもしれません。
今回も文字列長を最大100000と想定していますので、文字列連結はStringBuffer(またはStringBuilder)を使った方が無難と思われます
 */


public class Ex072_B {

	public static void main(String[] args) {
		String str = generateRandomString(100000);
		System.out.println("--- 七五三メソッド ---");
		String shime = oddStringShime(str);
		// 最初の100文字
		System.out.println(shime.substring(0, 100));
		System.out.println("--- 川久保メソッド ---");
		String kawakubo = oddStringKawakubo(str);
		// 最初の100文字
		System.out.println(kawakubo.substring(0, 100));
		// 念のため、結果が同じであることを確認
		System.out.println("実行結果: " + (shime.equals(kawakubo) ? "等しい": "異なる"));

	}

	public static String oddStringShime(String str) {
		long start = System.currentTimeMillis();
		String ans = "";
		for(int i = 0; i < str.length(); i += 2) {
			ans += str.charAt(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("処理時間=" + (end - start) + "ミリ秒");
		return ans;
	}
	public static String oddStringKawakubo(String str) {
		long start = System.currentTimeMillis();
		StringBuffer ans = new StringBuffer();
		for(int i = 0; i < str.length(); i += 2) {
			ans.append(str.charAt(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("処理時間=" + (end - start) + "ミリ秒");
		return ans.toString();
	}

	public static String generateRandomString(int length) {
		StringBuffer sb = new StringBuffer();
		for (char c = 'a'; c < 'z'; c++) {
			sb.append(c);
		}
		String alphabet = sb.toString();
		int size = alphabet.length();
		StringBuffer result = new StringBuffer();
		Random rand = new Random();
		Set<Character> debugSet = new TreeSet<>();
		for (int i = 0; i < length; i++) {
			int randomInt = rand.nextInt(size);
			result.append(alphabet.charAt(randomInt));
			debugSet.add(alphabet.charAt(randomInt));
		}
		// debug start
		System.out.println("size=" + debugSet.size());
		for (var c: debugSet) {
			System.out.print(c);
		}
		System.out.println();
		// debug end
		return result.toString();
	}
}
