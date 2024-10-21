package review;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ex260_B_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();

		List<Integer> math = new ArrayList<Integer>();
		List<Integer> english = new ArrayList<Integer>();
		List<Integer> total = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			math.add(sc.nextInt());
		}

		for (int i = 0; i < n; i++) {
			english.add(sc.nextInt());
		}

		for (int i = 0; i < n; i++) {
			total.add(math.get(i) + english.get(i));
		}

		math.sort(Comparator.reverseOrder());
		english.sort(Comparator.reverseOrder());
		total.sort(Comparator.reverseOrder());

		//数学のｘ人分を表示する
		for (int i = 0; i < x; i++) {
			System.out.println(math.get(i));

		}

		//数学のx人分合格したので、インデックスを英語のy分インデックスから始める？
		for (int i = x; i < y; i++) {
			System.out.println(english.get(i));
		
		}

		
		for (int i = x + y; i < z; i++) {
			System.out.println(total.get(i));
	
		}

		sc.close();

	}

}

/**
 * 		for (Integer num : math) {
			System.out.print(num);
		}
		System.out.println();
		
		for (Integer num : english) {
			System.out.print(num);
		}
		System.out.println();
		
		for (Integer num : total) {
			System.out.print(num);
		}
		System.out.println();
 * 
 * 
 */
