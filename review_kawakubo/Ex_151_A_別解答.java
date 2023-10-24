package review_kawakubo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex_151_A_別解答 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("アルファベットを一文字入力せよ：");
		char ans = sc.next().charAt(0);

		/*
		 * 英小文字a～zは連続した数字が割り振られています。
		 * UTF-8であれば小文字aには97、bには98、... zには122
		 * という風に割り振られています。
		 * また、char型は整数型に分類される基本データ型なので
		 * 加算、減算ができるようになっています。
		 * ということで、zの入力はないと制約に書いてありますので、
		 * 以下のように書いていいかと思います。
		 */

		System.out.println((char)(ans + 1));

		
		List<Character> list = new ArrayList<Character>();
		for (char c = 'a'; c <= 'z'; c++) {
			list.add(c);
		}
		for(Character ch : list){
			if(ch == ans) {
				System.out.println((char) ((int)(ch + 1)));
				//下記コードだとOutoｆBoundExceptionが発生する
				//System.out.println(list.get(list.indexOf((ch + 1))));		
			}
		}
	
		/**
		 * エラー　Iteratorでトライしたコード　でもoutofBoundExceptionが出た
		 *
		 */
		Iterator<Character> itr = list.iterator();
		
		while(itr.hasNext()) {
			char target = itr.next();
			if(target == ans) {
				// target + 1の結果はint型になります。もう一度char型に戻してから
				// 検索する必要があります。
				System.out.println(list.get(list.indexOf((char)(target + 1))));
				break; // 見つけたら早めに抜け出した方がいいと思います。
			}
		}
		/*
		 * ちなみにiteratorは拡張for文の中で自動的に適用されます。
		 * すなわち七五三さんの書いた構文は拡張for文の内部の動きを
		 * コード化していることになります
		 */
		for (char c : list) {
			if (c == ans) {
				/*
				 * aから順番に格納しているので(c - 'a')で格納している
				 * インデックスを求めることができます。
				 * 例えば'd'(100) - 'a'(97) = 3となります。
				 * 今回は次の文字を求めるため1加算します。
				 * 以前の問題で、七五三さんがこの方法を使っていた記憶が
				 * ありますので、前の問題の解答を読み返してください。
				 */
				System.out.println(list.get((c - 'a' + 1)));
				break; // 見つけたら早めに抜け出した方がいいと思います。
			}
		}
	
		sc.close();
	}

}
