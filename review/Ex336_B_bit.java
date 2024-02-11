package review;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex336_B_bit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		
		
		//2進数に変換する
		list = RadixConv(n, 2);
		
		//ここで詰まる
		/**
		 * 2進数をlist型で持ってきたが
		 * その後の処理（左シフトして0を数える）の操作をしたいが、型変換で苦戦
		 * 2つのメソッド（2進数変換メソッドと0をカウントするメソッド）はどちらも
		 * 問題なく動きそうだがメインメソッドでこの二つのメソッドにデータを引き渡すやり取りが上手くいかない
		 * 
		 */
		
	
		//StringBuilderでString型にする前準備をする？
		StringBuilder sb = new StringBuilder();
        for (String str: list) {
            sb.append(str);
        }
 
        //String型にする
        String result = sb.toString();
        
        //ここでエラー出る
        /**
         * Exception in thread "main" java.lang.NumberFormatException: For input string: "11111101000"
         * エラー箇所は↓のint ans = Integer.parseInt(result);
         * 
         */
		int ans = Integer.parseInt(result);
		System.out.println(countZeros(ans));
		
		sc.close();
	}
	

	//基数変換メソッド
	//今回2進数のみだがメソッドは2進数以外は対応可能
	public static List<String> RadixConv(int x,int r) {
		List<String> list = new ArrayList<>();
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		do {
			//dcharの中にある文字列とx % rと一致するものをリストに格納する
			 list.add(String.valueOf(dchar.charAt(x % r)));
			//次の桁へ移動
			x /= r;
		}while(x != 0);
		
		//逆順にする
		Collections.reverse(list);
		return list;
	}

	
	//末尾に連続する0の個数を求めるメソッド
	public static long countZeros(long n) {
		int count = 0;
		
		//1 の論理積 (AND)で0の場合なら繰り返す
		while((n & 1) == 0) {
			count ++;
			//シフトする
			n >>= 1;
		}
		return count;
	}
}
