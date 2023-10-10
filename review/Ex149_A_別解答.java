package review;

import java.util.Scanner;

public class Ex149_A_別解答 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String s1 = sc.next();
		String s2 = sc.next();

		StringBuffer sb = new StringBuffer();

		/*
		特に指摘することはありません
		あえて言えばappendはthis(自分のアドレス)
		を返すためメソッドチェーンも使えます。
		sb.append(s2);
		sb.append(s1);
		*/
		sb.append(s2).append(s1);
		System.out.println(sb.toString());

		sc.close();

	}

}
