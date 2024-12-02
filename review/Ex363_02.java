package review;

import java.util.Scanner;

public class Ex363_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t = sc.nextInt();
		int p = sc.nextInt();

		int[] hairArray = new int[n];

		prepareArray(hairArray, n, sc);
		calcHair(hairArray, t, p);

	}

	public static void prepareArray(int[] hairArray, int n, Scanner sc) {
		for (int i = 0; i < n; i++) {
			hairArray[i] = sc.nextInt();
		}

	}

	public static void calcHair(int[] hairArray, int t, int p) {

		for(int i = 0; i < t; i++) {
			int count = 0;
			for(int j = 0; j < hairArray.length; j++) {
				if(hairArray[j] >= t) {
					count ++;
				}
				hairArray[j] = hairArray[j] + 1;
			}
			if(count >= p) {
				System.out.println(i);
				break;
			}

	
	}
	}
}
