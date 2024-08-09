package review_kawakubo;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex204_speedCheck_kawakubo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		//testデータ準備
		Integer[] array = prepareArray(sc, n);
		List<Integer> list = prepareList(array);
		
		System.out.println("---<List version>---");
		long startTestList = System.nanoTime();
		System.out.println(testList(list));
		long endTestList = System.nanoTime();
		System.out.printf("処理時間: %dナノ秒%n",(endTestList - startTestList));
		
		System.out.println("---<配列 version>---");
		long startTestArray = System.nanoTime();
		System.out.println(testArray(array));
		long endTestArray = System.nanoTime();
		System.out.printf("処理時間: %dナノ秒%n",(endTestArray - startTestArray));
		
		sc.close();
		
	}

	public static Integer[] prepareArray(Scanner sc, int n) {
		Integer[] array = new Integer[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		return array;
	}

	/*
	 * 川久保注
	 * 制約でNは1000が上限ですが、1000回間違えずに同じ値を入力するのは
	 * 困難です。Integer[] ---> List<Integer>に変換する方が楽ですし、
	 * array,listとも全く同じデータが格納できるので、正確なテストができます。
	 */
	public static List<Integer> prepareList(Integer[] array){
		return Arrays.asList(array);
	}

	public static int testArray(Integer[] array) {

		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 10) {
				sum += array[i] - 10;
			}
		}
		return sum;

	}

	public static int testList(List<Integer> list) {

		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) > 10) {
				sum += list.get(i) - 10;
			}
		}
		return sum;
	}

}
