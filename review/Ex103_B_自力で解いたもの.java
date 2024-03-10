package review;

import java.util.Scanner;

public class Ex103_B_自力で解いたもの {

	//間違っている
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		
		for(int i = 0; i < s.length(); i++) {
			if(s.equals(t)) {
				System.out.println("Yes");
				break;
			}
			s = rotate(s);
		}

		sc.close();
	}
	
	public static String rotate(String s) {
		return s.substring(1,s.length()) + s.substring(0,1);
	}

}
