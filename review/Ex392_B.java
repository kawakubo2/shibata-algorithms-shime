package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex392_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		List<Integer> target = new ArrayList<Integer>();

		//対象の数字をm個分格納する　(ex.3,9,2等)
		prepareList(sc, target, m);
		
		List<Integer> list = new ArrayList<>();
		
		//上記のprepareListで格納した数字以外の数字を1~n個分格納する (ex 1~nまでの数字をaddする　ただし上記で格納した3,9,2は格納しない)
		addListExceptTarget(list, target, n);
		
		//listのサイズを表示する
		showistSize(list);
		
		//listの中身を表示する
		showList(list);

		sc.close();
		 
	}

	//対象の数字をm個分格納する　(ex.3,9,2等)
	public static void prepareList(Scanner sc,List<Integer> target, int m) {
		
		for (int i = 0; i < m; i++) {
			target.add(sc.nextInt());
		}
	}
	
	//上記のprepareListで格納した数字以外の数字を格納する (ex 1~nまでの数字をaddする　ただし上記で格納した3,9,2は格納しない)
	public static void addListExceptTarget(List<Integer> list,List<Integer> target, int n) {
		
		for(int i = 1; i <= n; i++) {
            if(!target.contains(i)) {
            	list.add(i);
            }
        }
	}
	
	//listのサイズを表示する
	public static void showistSize(List<Integer> list) {
		
		System.out.println(list.size());
	}
	
	//listの中身を表示する
	public static void showList(List<Integer> list) {
		
		for(Integer num: list) {
			System.out.println(num);
		}
	}
}
