package review_kawakubo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex431_B_Set {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		int n = sc.nextInt();
		int[] w = new int[n];

		prepare(w, sc);

		int q = sc.nextInt();

		int result = calcWeight(sc, x, w, q);
		System.out.println(result);

		sc.close();
	}

	public static void prepare(int[] w, Scanner sc) {

		for (int i = 0; i < w.length; i++) {
			w[i] = sc.nextInt();
		}
	}

	public static int calcWeight(Scanner sc, int weight, int[] w, int querySize) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < querySize; i++) {
			int q = sc.nextInt();
			int qWeight = w[q - 1]; // qは1始まり他のめ、1減算

			if (set.contains(qWeight)) {
				weight -= qWeight;
				set.remove(qWeight);
			} else {
				weight += qWeight;
				set.add(qWeight);
			}
		}
		return weight;
	}

}
