package review;

import java.util.Scanner;

public class Ex82_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();

		sort(sChar);
		reverse(tChar);
		
		String s1 = new String(sChar);
		String s2 = new String(tChar);
		if(s1.compareTo(s2) < 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	
	}
	
	//降順ソート
	public static void sort(char[] array) {
		
		for (int i = 0; i < array.length -1; i++) {
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] < array[i]) {
					char temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		
	}
	
	//逆順ソート
	public static void reverse(char[] array) {
		 int n = array.length;
		 
		 for(int i = 0; i < n /2; i++) {
			 char temp = array[i];
			 
			 array[i] = array[n -i -1];
			 
			 array[n - i -1] = temp;
		 }
	}

}
