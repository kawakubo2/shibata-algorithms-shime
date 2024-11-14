package review_kawakubo;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex317_B_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> set = new TreeSet<>();
		
		prepareSet(sc, set, n);
		disp(set);
		Integer result = calcMissingNo(set);
		
		System.out.println(result);

		sc.close();
	}
	
	public static void prepareSet(Scanner sc, Set<Integer> set, int size) {
		for (int i = 0; i < size; i++) {
			/*
			 * 川久保注
			 * 
			 * TreeSetはソート順を保ちつつ要素を格納します。
			 * Treeと頭についているように、木構造で管理しているため
			 * Setのaddよりも格納速度は劣りますが、二分探索と同じ要領で
			 * 追加するので、追加はlogNで追加可能です。
			 * つまり、1000件追加するのに1秒かかったとして、100万件
			 * 追加するのに1000秒は必要なく、論理的には2秒で追加します。
			 * 改めてソートする必要がないため、件数が多いときに
			 * 有利です。一般的なソートの速度は件数に比例して遅くなりますが、
			 * TreeSetはソートなしなので、このような問題には向いている
			 * かと思います。
			 * 
			 * 七五三さんのようにソートを自分で書いてみるというのも
			 * 練習では非常に重要です。
			 */
			set.add(sc.nextInt());
		}
	}
	
	public static Integer calcMissingNo(Set<Integer> set) {
		int result = -1;
		int previous = -1;
		/*
		 * 川久保注
		 * 
		 * Setは通常のfor文では回せないので
		 * 拡張for文を1回だけ回し、最初の
		 * 値を取り出しています。
		 * そこから1引けば、次の拡張for文
		 * の先頭要素の前の値という意味になります。
		 */
		for (int e: set) {
			previous = e - 1;
			break;
		}
		for (int e: set) {
			if ((e - previous) > 1) {
				result = previous + 1;
				break;
			}
			previous = e;
		}
		return result;
	}
	
	public static void disp(Set<Integer> set) {
		for (int e: set) {
			System.out.print(e + " ");
		}
		System.out.println();
	}

}