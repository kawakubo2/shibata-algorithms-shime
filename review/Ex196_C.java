package review;

import java.util.Scanner;

public class Ex196_C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		long n = Long.parseLong(str);
		
		long count = 0;
		//解説の中で今回の条件は10の12乗までとあったが、全探索すると処理時間がかなりかかるため不合格になる
		//Atcoderは基本どの問題も2秒以内に処理を終わらせることが条件　10の6乗くらいまでなら2秒以内で終わると解説内で言っていたため、100万まで探索させている　
		for(int  i = 0; i <= 1000000;i++) {
			//文字列で一旦扱ってからlongに変換
			long num = Long.parseLong(i + "" + i);
			
			if(num < n) {
				count ++;
			}
		}
		
		System.out.println(count);

		sc.close();
	}

}
