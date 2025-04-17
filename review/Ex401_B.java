package review;

import java.util.Scanner;

public class Ex401_B {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		//認証状態を確認
		boolean isAuthorized = false;
		
		int error = countError(n, isAuthorized, sc);
		
		showErrorCounts(error);

		sc.close();
		
	}
	
	//認証エラーの回数をカウントする
	public static int countError(int n, boolean isAuthorized,Scanner sc) {
		
		int error = 0;
		
		for(int i = 0; i < n; i++) {
			String status = sc.next();
			switch(status) {
				case "login":
					isAuthorized = true;
					break;
				case "logout":
					isAuthorized = false;
					break;
				case "private":
					if(!isAuthorized) {
						error++;
					}
					break;
			}
		}
		return error;
	}
	
	//エラー回数を表示
	public static void showErrorCounts(int error) {
		System.out.println(error);
	}
}
