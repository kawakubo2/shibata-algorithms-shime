package review;

import java.util.Scanner;

public class Ex317_B_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		
		prepareArray(sc, array);
		inorder(array);
		int result = calcMissingNo(array);
		
		System.out.println(result);

		sc.close();
	}
	
	public static void prepareArray(Scanner sc, int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

	}
	
	public static void inorder(int[] array) {
		
		for(int i = 0; i < array.length -1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] < array[i]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
	}
	
	public static int calcMissingNo(int[] array) {
		int result = 0;
		for(int i = 0; i < array.length - 1; i++) {
			if((array[i + 1] - array[i]) > 1) {
				result = array[i] + 1;
			}
		}
		return result;

	}
	
	public static void disp(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}

}
