package review;

import java.util.Arrays;
import java.util.Scanner;

public class Ex432_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] arry = sc.next().toCharArray();
		Arrays.sort(arry);
		if (arry[0] == '0') {
			for (int i = 1; i < arry.length; i++) {
				if (arry[i] != '0') {
					char t = arry[i];
					arry[i] = arry[0];
					arry[0] = t;
					break;
				}
			}
		}

		System.out.println(Arrays.toString(arry));

		sc.close();

	}

}
