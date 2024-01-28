package review;

import java.util.Scanner;

public class Ex93_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a  = sc.nextInt();
		int b = sc.nextInt();
		int k = sc.nextInt();
		
		//整数の総数が対象のk個より少ない場合、全て対象なので全出力する
		if((b - a + 1) <= 2 * k) {
			for(int i = a; i <= b; i++) {
				System.out.println(i);
			}
		}else {
			//aからk個までを出力する
			for(int i = a; i <= a + k -1 ; i++) {
				System.out.println(i);
			}
			
			//bからk個まで出力する
			for(int i = b - k + 1; i <= b; i++) {
				System.out.println(i);
			}
		}	
		sc.close();
	}

}
