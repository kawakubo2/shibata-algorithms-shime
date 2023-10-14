package review_kawakubo;

import java.util.Scanner;

public class Ex_150_B_kawakubo {

	public static void main(String[] args) {

		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();

		/*
		 * この問題は出題の仕方が非常にまずい例の一つです。
		 * 七五三さんの解き方で全く問題ないのですが、
		 * 部分文字列によっては解釈が2つに分かれます。
		 * 例えば文字列の中に"AAA"という文字列が何個あるか
		 * 求める場合、カウントの仕方が変わります。
		 * -----------------------------------------
		 * 1) 解釈1
		 * とにかく可能性がある文字列を全て数えあげる
		 * 場合、七五三さん方式となり3個となります。
		 * 対象となる文字列が xxxAAAAAyy
		 * 部分文字列がAAA
		 * だとすると、
		 * xxxAAAAAyy
		 *    ~~~   1個目
		 *     ~~~  2個目
		 *      ~~~ 3個目
		 * -----------------------------------------
		 * 2) 解釈2
		 * 一度読み取った部分文字列はそこで完結していると
		 * みなし、部分文字列の次から再検索する方式です。
		 * xxxAAAAAyy
		 *    ~~~   1個目
		 *       +  +の位置から検索するためAAは対象外となる
		 * つまり1個だけとみなされます。不思議なことに多くの言語は
		 * こちらの方式でカウントします。正規表現で見つける場合も
		 * こちらの方式ですね。 
		 */

		System.out.println("---< 解釈1にしたがった解法 >---");
		int count = 0;
		for(int i = 0; i < n - 2; i++) {
			if(str.substring(i,i + 3).equals("AAA")) { // ABCからAAAに変更しています
				count ++;
			}
		}
		System.out.println(count);

		System.out.println("---< 解釈2にしたがった解法 >---");
		int count2 = 0;
		int i = 0;
		while (i < n - 2) {
			if (str.substring(i, i + 3).equals("AAA")) {
				count2++;
				i += 3;
			} else {
				i++;
			}
		}
		System.out.println(count2);
		

		sc.close();
	}

}
