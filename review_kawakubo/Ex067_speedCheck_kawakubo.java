package review_kawakubo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ex067_speedCheck_kawakubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		// テストデータの準備	
		Integer[] array = prepareArray(sc, n);
		List<Integer> list = prepareList(array, n);

		System.out.println("---< Listバージョン >---");
		long startTest01 = System.nanoTime();
		System.out.println(test1(list, k));
		long  endTest01 = System.nanoTime();
		System.out.printf("処理時間: %dナノ秒%n",(endTest01 - startTest01));
		
		System.out.println("---< 配列バージョン >---");
		long startTest02 = System.nanoTime();
		System.out.println(test2(array, k));
		long  endTest02 = System.nanoTime();
		System.out.printf("処理時間: %dナノ秒%n",(endTest02 - startTest02));
		
		sc.close();	
	}

	public static Integer[] prepareArray(Scanner sc, int n) {
		Integer[] array = new Integer[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		return array;
	}

	public static List<Integer> prepareList(Integer[] array, int n) {
		return Arrays.asList(array);
	}

	public static int test1(List<Integer> list, int k) {

		list.sort(Comparator.reverseOrder());

		int sum = 0;

		for (int i = 0; i < k; i++) {
			sum += list.get(i);
		}

		return sum;
	}


	public static int test2(Integer[] array, int k) {

		Arrays.sort(array, Comparator.reverseOrder());

		int sum = 0;
		for (int i = 0; i < k; i++) {
			sum += array[i];
		}
		
		return sum;
	}
}
