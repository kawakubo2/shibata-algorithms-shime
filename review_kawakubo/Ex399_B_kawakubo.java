package review_kawakubo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/*
川久保解説
入力データ
10
8 12 15 11 12 15 7 10 11 12

制約として
1 <= Pi <= 100
とあるので、分布を求めるための配列を用意します。
indexを点数として使用したいのでindexの0は未使用にします。

		int[] bunpu = new int[101];
		for (int i = 1; i <= 100; i++) {
			bunpu[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			bunpu[data[i]] += 1;
			

100点までの例だと大変なので7点から15点の分布だけを例とします。

 7  8  9  10  11  12  13  14  15 <- 点数
 1  1  0   1   2   3   0   0   2 <- 分布(人数)
 
ここから累積の計算です。今回はMapを使用しました。

点数の多い方から累積していきます。
15 ---> 1
12 ---> 1 + 2(15点の人数) ---> 3
11 ---> 3 + 3(12点の人数) ---> 6
10 ---> 6 + 2(11点の人数) ---> 8
 8 ---> 8 + 1(10点の人数) ---> 9
 7 ---> 9 + 1( 8点の人数) ---> 10
 
結果
15: 1
12: 3
11: 6
10: 8
 8: 9
 7: 10
というマップができます

		Map<Integer, Integer> ruiseki = new LinkedHashMap<>();
		int r = 1;
		for (int i = 100; i > 0; i--) {
			if (bunpu[i] > 0) {
				ruiseki.put(i, r);
				r += bunpu[i];
			}
		}

最後は表示です。
8 12 15 11 12 15 7 10 11 12
のデータがMapのキーとして存在するので
その値をキーとしてマップから順位を取り出します。
8  --->  9
12 --->  3
15 --->  1
11 --->  6
12 --->  3
15 --->  1
 7 ---> 10
10 --->  8
11 --->  6
12 --->  3

結果 
9 
3 
1 
6 
3 
1 
10 
8 
6 
3 
となります。
 */

public class Ex399_B_kawakubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		

		/* 点数入力用配列 */
		int[] data = new int[n];
		for (int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}	

		/* 
		 分布用配列 
		 indexを点数とするのでindexの0は使用しない。 
		*/
		int[] bunpu = new int[101];
		for (int i = 1; i <= 100; i++) {
			bunpu[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			bunpu[data[i]] += 1;
		}
		
		/*
		 * 累積用Map
		 */
		Map<Integer, Integer> ruiseki = new LinkedHashMap<>();
		int r = 1;
		for (int i = 100; i > 0; i--) {
			if (bunpu[i] > 0) {
				ruiseki.put(i, r);
				r += bunpu[i];
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println(ruiseki.get(data[i]));
		}

		sc.close();
		
	}
}
