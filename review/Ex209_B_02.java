package review;

import java.util.Scanner;

public class Ex209_B_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] array = new int[n];
		int total = 0;
		
		prepareArray(array, sc);
		total = addTotal(array,total);
		judge(x, total);
		
		sc.close();
	}
	
	public static void prepareArray(int[] a,Scanner sc) {
		for(int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
	}
	
	public static int addTotal(int[] a, int total) {
		
		for(int i = 0; i < a.length; i++) {
			if(i % 2 != 0) {
				total += (a[i] - 1);
			}else {
				total += a[i];
			}
		}
		return total;
	}
	
	public static void judge(int x, int total) {
		if(x >= total) {
			System.out.println("yes");
		}else {
			System.out.println("No");
		}
	}

}
