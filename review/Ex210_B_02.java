package review;

import java.util.Scanner;

public class Ex210_B_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		
		prepareArray(s, sc);
		judge(s);

	}

	public static void prepareArray(int[] s, Scanner sc) {
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.nextInt();
		}
	}

	public static void judge(int[] s) {
		
		for (int i = 0; i < s.length; i++) {
			if (s[i] == 1) {
				if (i % 2 == 0) {
					System.out.println("Takahashi");
					break;
				} else {
					System.out.println("Aoki");
					break;
				}
			}
		}
	}
}
