package review;

import java.util.Arrays;
import java.util.Scanner;

public class Ex334_D {

	public static void main(String[] args) {

		
		/**
		 * 解き方
		 * 指定されたトナカイの数を昇順にして小さい順から引き算しました
		 * 引き算できない数値になるまで引き算してそのたびにcount++しました
		 * 尺取り法？で解くと良いとネットには書いてましたがまだ勉強していないので力技で解きました ε=(ﾉ‥)ﾉ
		 * 
		 * 以下質問です
		 * 質問１：
		 * 問題に記載されている入力例は全て同じ出力結果になったのですがAtcoderの自動採点システムで提出するとWrong Answerになります:(´ཀ`」 ∠):
		 * なにが間違っているのか分からず詰まりましたε=(o- -)o
		 * 
		 * 質問2
		 * 下記のコメント欄に書きました
		 * 
		 * 以上になります　お手数をおかけしますがよろしくお願いします...!
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ソリの台数N:");
		long n = sc.nextLong();
		
		System.out.println("クエリQの個数:");
		long q = sc.nextLong();
		
		//質問2：(int)nの書き方合っているのか？Eclipseに指摘されたから直したがモヤモヤする
		//トナカイ数の配列
		long[] r = new long[(int) n];
		
		//質問2と同じ(int)qの書き方合っているのか？
		//クエリ数の配列
		long[] query = new long[(int) q];
		
		System.out.println("必要なトナカイR匹");
		for(int i = 0; i < n; i++) {
			 r[i] = sc.nextInt();			
		}
		
		//昇順にする
		Arrays.sort(r);
		
		//クエリの数値を入力する
		System.out.println("query数");
		for(int i = 0; i < q; i++) {
			query[i] = sc.nextLong();
		}
		
		
		//トナカイの数分引き算していく
		for(int i = 0; i < q; i++) {
			long num = query[i];
			int count = 0;
			for(int j = 0; j < r.length; j++) {
				if(num >= r[j]) {
					//System.out.println("num=" + num + "  r[" + j + "]=" + r[j]);
					num -= r[j];
					count++;
				}
			}
			System.out.println(count);
		}
		sc.close();
		
	}
}
