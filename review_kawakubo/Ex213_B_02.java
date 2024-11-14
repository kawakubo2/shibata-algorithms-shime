package review_kawakubo;

import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex213_B_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		/*
		 * キーが点数、値が選手の番号
		 * キーは重複が許されませんが、Aiは「相異なる」とあるので
		 * キーとして使用できます。本来のゲームであれば同点も出てきそうなので
		 * キーに指定したら危なそうですが。
		 * 
		 * TreeMapは前回紹介した、TreeSetと同様、キーがソート順を保ったまま
		 * データを格納できます。logNのオーダーで格納できます。ソート順を
		 * 保ったまま格納されていきますので、改めてソートが不要となり、
		 * このような問題を解くのにむいていると思います。
		 * 
		 * TreeMapのキーの並び順は昇順なので、インスタンス化する際、
		 * Comparator.reverseOrder()メソッドを使って降順を指定します。
		 */
		Map<Integer, Integer> map = new TreeMap<>(Comparator.reverseOrder());
		prepare(map, n, sc);

		int result = booby(map);

		System.out.println(result);

		sc.close();
	}
	
	public static void prepare(Map<Integer, Integer> map, int size, Scanner sc) {
		for(int i = 0; i < size; i++) {
			map.put(sc.nextInt(), i + 1);
		}
	}
	
	/*
	 * mapはfor(int i = 0; i < size; i++)
	 * の構文が使えないので、拡張for文を使って
	 * 2番目のキー(最後から2番目の点数)を取り出します。
	 * キーが点数、値が選手の番号なので
	 * map.get(score)で選手番号がわかります。
	 */
	public static int booby(Map<Integer, Integer> map) {
		int number = -1;
		int count = 0;
		for (int score: map.keySet()) {
			count++;
			if (count == 2) {
				number = map.get(score);
				break;
			}
		}	
		return number;	
	}

}
