package review_2;

import java.util.Scanner;

public class Ex212_B_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		int[] x = prepareToInt(str);
	
		finalJudge(x);

		sc.close();
		
	}
	
	//入力された文字列をint型の配列に格納するメソッド
	public static int[] prepareToInt(String str) {
		
		int[] x = new int[str.length()];
		for(int i = 0; i < str.length(); i++) {
			x[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		
		return x;
	}
	
	//各桁の数字が同じ数字かチェックするメソッド
	public static boolean checkSameNumber(int[] x) {
		
		boolean flag = false;
		if(x[0] == x[1] && x[1] == x[2] && x[2] == x[3]) {
			return flag = true;
		}
		
		return flag;
	}
	
	//各桁の数が1つずつ増えているかチェック　//増えていた弱いパスワード判定
	public static boolean checkOrderNumber(int[] x) {
		
		boolean flag = false;
		int count = 0;
		
		for(int i = 0; i < x.length -1; i++) {
			if((x[i] + 1) % 10 == x[i + 1]) {
				count ++;
			}
		}
		
		if(count == 3) {
			flag = true;
			return flag;
		}
		
		return flag;
		
	}
	
	//最終チェックメソッド
	public static void finalJudge(int[] x) {
		if(checkOrderNumber(x) || checkSameNumber(x)) {
			System.out.println("Weak");
		}else {
			System.out.println("Strong");
		}
	}
	
	

}
