package review_kawakubo;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex392_B_kawakubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		Set<Integer> target = new LinkedHashSet<>();

		//対象の数字をm個分格納する　(ex.3,9,2等)
		prepareSet(sc, target, m);
		
		Set<Integer> set = new LinkedHashSet<>();
		
		//上記のprepareSetで格納した数字以外の数字を1~n個分格納する (ex 1~nまでの数字をaddする　ただし上記で格納した3,9,2は格納しない)
		addSetExceptTarget(set, target, n);
		
		//setのサイズを表示する
		showSetSize(set);
		
		//setの中身を表示する
		showList(set);

		sc.close();
		 
	}

	public static void prepareSet(Scanner sc, Set<Integer> target, int m) {
		for (int i = 0; i < m; i++) {
			target.add(sc.nextInt());
		}
	}
	
	public static void addSetExceptTarget(Set<Integer> set, Set<Integer> target, int n) {
		for(int i = 1; i <= n; i++) {
            if(!target.contains(i)) {
            	set.add(i);
            }
        }
	}
	
	//listのサイズを表示する
	public static void showSetSize(Set<Integer> set) {
		System.out.println(set.size());
	}
	
	//listの中身を表示する
	public static void showList(Set<Integer> set) {
		for(Integer num: set) {
			System.out.printf("%d ", num);
		}
		System.out.println();
	}
}
