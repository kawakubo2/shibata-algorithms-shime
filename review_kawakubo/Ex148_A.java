package review_kawakubo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex148_A {

	static final Set<Integer> options = new HashSet<>(Arrays.asList(1, 2, 3));

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		options.remove(A);
		options.remove(B);

		for (int option: options) {
			System.out.println(option);
		}

		sc.close();	
	}

}
