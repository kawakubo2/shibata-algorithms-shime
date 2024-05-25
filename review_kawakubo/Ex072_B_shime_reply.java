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

/**
 * 川久保先生追記コメント
 * 
 * Ex070_B_ほかの人のコードを指摘しますね。 気持ちはわかるのですが、executeメソッドはイマイチの作りです。
 * メソッドは関数とほぼ同じなので、シグネチャが大切です。 BufferedReaderが引数で、時間的にかぶっている秒数を文字列かしたものが返り値と
 * いうのは作り的にはやってはいけないですね。
 * 
 * 引数としてはint型4個と戻り値もint型にして メソッド名をoverlapくらいにすれば、 引数と文字列だけでメソッドが何をやりたいかを説明できます。
 * 
 * 
 * executeメソッドの何がよくないか 1) メソッドは実行するものなので「execute」はメソッドが何をするものかの説明になっていない。 2)
 * メソッド内に2つの異なるコードが混在している。 ・ユーザの入力を受けつける ・かぶった時間の計算をしている この2つはしっかり分けた方がいいですね。
 * 
 * 上記を踏まえてExe070_B_川久保_javaを作ってみましたので、ご参考までに。
 * 
 * 
 * 
 * @author shime
 *
 */

public class Ex072_B_shime_reply {

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
		System.out.println("実行結果: " + (shime.equals(kawakubo) ? "等しい" : "異なる"));

	}

	public static String oddStringShime(String str) {
		long start = System.currentTimeMillis();
		String ans = "";
		for (int i = 0; i < str.length(); i += 2) {
			ans += str.charAt(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("処理時間=" + (end - start) + "ミリ秒");
		return ans;
	}

	public static String oddStringKawakubo(String str) {
		long start = System.currentTimeMillis();
		StringBuffer ans = new StringBuffer();
		for (int i = 0; i < str.length(); i += 2) {
			ans.append(str.charAt(i));
		}
		long end = System.currentTimeMillis();
		System.out.println("処理時間=" + (end - start) + "ミリ秒");
		return ans.toString();
	}

	public static String generateRandomString(int length) {
		StringBuffer sb = new StringBuffer();
		//七五三読解：String sbに全アルファベット(小文字のみ)詰め込む
		for (char c = 'a'; c < 'z'; c++) {
			sb.append(c);
		}
		
		//七五三読解：String型に文字列を代入する（全アルファベット）
		String alphabet = sb.toString();
		System.out.println("alphabet" + alphabet);
		
		//七五三読解：26(アルファベット総数)をsizeに格納する
		int size = alphabet.length();
		System.out.println("size" + size);
		
		
		StringBuffer result = new StringBuffer();
		
		Random rand = new Random();
		Set<Character> debugSet = new TreeSet<>();
		
		for (int i = 0; i < length; i++) {
			/*
			 * 川久保注
			 * rand.nextIntの引数にsize(26)を指定すると0から25までの乱数が発生します
			 * 文字列alphabetはindex0に'a', 1に'b', ..., 25に'z'
			 * が格納されているので、alphabet.charAt(randomInt)は発生させた0から25までの
			 * 乱数の位置にある文字を取得することになります。
			 */
			int randomInt = rand.nextInt(size);//七五三読解：上限26文字でランダムの文字数を決める
			result.append(alphabet.charAt(randomInt));
			debugSet.add(alphabet.charAt(randomInt));
		}
		/*
		 * 川久保注
		 * debugSetの説明を前回していませんでした。
		 * このSetは'a'から'z'までの文字列が過不足なく出来ていることを
		 * 確認するためのものです。
		 * 乱数を生成する場合、生成の仕方が悪く意図したものが出来ない場合があります。
		 * 今回であれば、生成したいのは'a'から'z'の文字がすべて生成され、それ以外の
		 * もじが混入していないかの確認したいのでdebugSetを作っています。
		 * debugSetは名前の通り、確認後debug用なので消しておくべきでしたね。
		 * 紛らわしくなってすみません。
		 */
		// debug start
		System.out.println("size=" + debugSet.size());
		for (var c : debugSet) {
			System.out.print(c);
		}
		System.out.println();
		// debug end
		return result.toString();
	}
}
