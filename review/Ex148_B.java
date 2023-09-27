package review;

import java.util.Scanner;

public class Ex148_B {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();//文字列は二つとも同じ長さ
		String str01 = sc.next();
		String str02 = sc.next();
		
		//chatAtで交互に表示する
		for(int i = 0; i < num; i++) {
			System.out.print(str01.charAt(i));
			System.out.print(str02.charAt(i));
		}
		System.out.println();
		
		sc.close();
	}

}
