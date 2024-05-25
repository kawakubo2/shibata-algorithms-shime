package review_kawakubo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex073_C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i < n; i++) {
			int target = sc.nextInt();
			//System.out.println("target" + target);
			
			/*
			 * 川久保注
			 * 以下はJDK17のAPIからの抜粋です。
			 * https://docs.oracle.com/javase/jp/17/docs/api/java.base/java/util/ArrayList.html#method-summary
			 *	remove(int index)
			 *	このリストの指定された位置にある要素を削除します。
			 *	boolean
			 *	remove(Object o)
			 *
			 * この場合、removeがオーバーライドされています。
			 * ここはオートアンボクシングの機能が働き
			 * Integerがintへ変換されてしまいます。
			 * 入力例2場合、indexは0～3までしか存在しない
			 * ので、5を入力した時点でindexの5と勘違いして
			 * IndexOutOfBoundExceptionを発生させます。
			 * 
			 * 対処方法として、取り出した数値をラッパーオブジェクト(Integer)
			 * に強制的に型変換する方法があります。
			 * 
			 * また、今回if文を2つに分けると、せっかく削除した要素が
			 * もう一度追加されるため、存在する要素を削除できなくなります。
			 * こういう場合はif elseになります。
			 * 
			 * Nが最大10万という制約があるのでListよりもSetで実装したほうがいいでしょうね。
			 * 時間が合ったらチャレンジしてください。
			//  */
			// if(list.contains(target)) {
			// 	list.remove(target);
			// }
			// if(!list.contains(target)) {
			// 	list.add(target);
			// }
		
			if(list.contains(target)) {
				list.remove(Integer.valueOf(target)); // Integer型とみなしてもらうために明示的に型変換
			} else {
				list.add(target);
			}
		}
		System.out.println(list.size());
	
		sc.close();
	}

}
