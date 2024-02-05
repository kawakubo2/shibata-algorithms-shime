package review_kawakubo;

import java.util.Scanner;

public class Ex335_B_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		/*
		 * 素晴らしいとき方だと思います。
		 * 1.以下の条件により辞書順が保たれます。 
		 * 	 多重繰返し構文の場合、一番内側のループから一番外側の
		 *   ループの順で動きます。
		 *      (1) kのループが最初に回ります。
		 *      (2) kが回り終わったらjが回ります。
		 *      (3) jが回り終わったらiが回ります。
		 *   したがって、辞書順に並ぶことが保証されます。
		 * 2. それぞれの条件式について
		 *      (1) 一番外側のループでは、iはnまで使用可能なので、
		 *          継続条件は i <= n
		 *      (2) 中間のループでは、iがnのうちiの分を消費しているので、
		 *          継続条件は j <= n - i
		 *      (3) 一番内側のループでは、iとjがnのうち(i + j)分消費しているので、
		 *          継続条件は k <= n - (i + j) ---> k <= n - i - j
		 *    この3つの条件によりnを超えないことが保証されます。
		 * [結論]
		 * 1と2の条件によりnを超えることがない組み合わせを辞書順に並べることが
		 * 可能となります
		 */
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= n - i; j++) {
				for(int k = 0; k <= n -i - j; k++) {
					System.out.println(i + " " + j + " " + k);
				}
			}
		}

		sc.close();
	}

}
