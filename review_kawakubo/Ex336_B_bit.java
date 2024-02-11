package review_kawakubo;

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
		System.out.println("toStringした結果: " + result);

        
        //ここでエラー出る
        /*
         * Exception in thread "main" java.lang.NumberFormatException: For input string: "11111101000"
         * エラー箇所は↓のint ans = Integer.parseInt(result);
         */

		 /*
		  * 川久保コメント)
		  * 2024をRadixConvした後、文字列型へ変換した場合
		  * "11111101000" -> 11_111_101_000
		  * となります。今回Nは10の9乗以下となっていますので、
		  * 少し大きい数字を指定するとlong型でさえ表現できません。
		  * int型で表現できる正の最大値は(2 ** 31 -1)です。
		  *  2_147_483_647 <--- int型の最大値
		  * 11_111_101_000 <--- Integer.parseIntに与えた文字列
		  * int型に変換できないため、NumberFormatExceptionが投げられます。
		  * NumberFormatExceptionの親クラスはIllegalArgumentExceptionです。
		  * つまり、メソッドの引数が、そのメソッドの想定外の値を受け取ったときに
		  * 発生します。つまり、-(2 ** 31) ～ (2 ** 31 - 1)の範囲内に変換できない
		  * 値が与えられた場合に投げられるのがNumberFormatExceptionです。
		  * 
		  * ただし、resultは2進数を表現した文字列でint型を超える
		  * 長さになってしまいます。
		  * "11111101000"
		  *
		  * また、この場合、せっかく文字列に変換しているので
		  * int型に変換する操作自体が不要です。
		  * 右側からchar型の'0'の数をカウントするだけで求めることができるはずです。
		  * countZerosを作り変えてみました。
		  * 
		  * ビット演算子は整数型であれば使用できます。
		  * Ex336_B_bit_別解.javaを参照ください。
		  */
		// int ans = Integer.parseInt(result);
		System.out.println(countZeros(result));
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
	/*
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
	*/

	// 川久保コメント 引数を文字列にし、右側から
	// '0'の個数を数えます。
	public static long countZeros(String n) {
		int count = 0;
		for (int i = n.length() - 1; i >= 0; i--) {
			if (n.charAt(i) != '0') {
				break;
			}
			count++;
		}
		return count;
	}
}
