package review;

import java.util.Arrays;
import java.util.Scanner;

public class Ex213_B_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] array = new int[n];
		prepareArray(array, sc);
		
		int[] copy = Arrays.copyOf(array, n);
		inorderArray(copy);
		
		int result = judge(array, copy);
		
		System.out.println(result);

		sc.close();
	}
	
	public static void prepareArray(int[] array, Scanner sc) {
		for(int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
	}
	
	public static void inorderArray(int[] copy) {
		
		for(int i = 0; i < copy.length -1; i++) {
			for(int j = i + 1; j < copy.length; j++) {
				if(copy[i] < copy[j]) {
					int temp = copy[i];
					copy[i] = copy[j];
					copy[j] = temp;
				}
			}
		}
		
	}
	
	public static int judge(int[] array, int[] copy) {
		
		int result = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(copy[1] == array[i]) {
				 result = i + 1;
				
			}
		}
		return result;
	}

}
