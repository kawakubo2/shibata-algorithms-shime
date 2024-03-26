package review_kawakubo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*
 * 川久保
 * 特に指摘することはありません。
 * 問題が、「最大になるように重ねた場合の枚数と
 * その順序」のような問題であればTreeSetが使えそうですね。
 * TreeSetは重複のないソートされた状態になったいるので、
 * それをfor文で取り出せます。
 * 
 * 
 */
public class Ex85_B_02 {

	public static void main(String[] args) {

		//今回重複したサイズはカウントしないのでSetが有効
		
		Set<Integer> set = new HashSet<>();
		var set2 = new TreeSet<Integer>(); // 川久保追加
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
	

		for (int i = 0; i < num; i++) {
			int a = sc.nextInt();
			set.add(a);
			set2.add(a); // 川久保追加
		}
		
		System.out.println(set.size());

		/*
		 * 川久保追加
		 */
		System.out.println("---< 「数値まで列挙する」という想定で解いたら >---");
		System.out.println(set2.size());
		for (var n : set2) {
			System.out.print(n + " ");
		}
		System.out.println();

		sc.close();
	}

}
