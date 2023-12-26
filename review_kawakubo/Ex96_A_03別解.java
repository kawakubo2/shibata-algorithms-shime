package review_kawakubo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex96_A_03別解 {

	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			//monthを入力
			int a = Integer.parseInt(br.readLine());
			//dayを入力
			int b = Integer.parseInt(br.readLine());
			
			int count = 0;
			int loopCount = 0;
			for(int i = 1; i <= a; i++) {
				for(int j = 1; j <= b; j++) {
					loopCount++;
					if(i == j) {
						//month == dayならカウントする
						count ++;
					}
					
					if((i == a && j == b) && (i != j)) {
						//i==a月かつj==b日　&& iとjの値が異なる場合
						//例: 8月7日 iとjが8月7日までfor文回ってこの二つの値が同じでない場合continueする
						continue;
					}
				}
			}
			
			System.out.println(count);
			System.out.printf("内側のfor文に入った回数: %d", loopCount);

			//--------------------------------------------
			// 別解1
			// 29から33行目をコメントアウト
			//
			//  ((i == a && j == b) && (i != j))
			//  この条件式の意味するところは
			//  i, jとも末尾まで到達し、iとjが異なれば 
			//  なので、その上の条件式が全てを表しています。
			//  元のコードと別解1のコードは回る回数が
			//  同じなので、特に効果はありません。
			//
			//  また、ここはskypeでも書かれている通り
			//  breakの間違いだと思います。continueだと
			//  また同じループに戻るだけになります。
			//  
			//  continueまたはbreakどちらにせよ、この場合は
			//  ループの一番最後なので、書かないのと同じになります。
			//--------------------------------------------
			test1(a, b);			

			//--------------------------------------------
			// 別解2 
			// (1)
			// 26行目の下にbreak文を追加
			// jがiより大きくなったらそれ以降「高橋」は存在しないから
			// この場合、ループを回す回数をだいぶ節約できます。
			// (2)
			// (1)と同じ理由で
			// 29～33行目をコメントアウト
			//--------------------------------------------
			test2(a, b);			

			//--------------------------------------------
			// 別解3 
			// (1)
			// カンマ演算子を使うとiとjを同時に初期化、インクリメント
			// できるため効率的に回すことができます。
			// (2)
			// (1)と同じ理由で
			// 29～33行目をコメントアウト
			//--------------------------------------------
			test3(a, b);			

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static void test1(int a, int b) {
		System.out.println("\n---< 別解1 >---");

		int count = 0;
		int loopCount = 0;
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= b; j++) {
				loopCount++;
				if(i == j) {
					//month == dayならカウントする
					count ++;
				}
				
				// if((i == a && j == b) && (i != j)) {
					//i==a月かつj==b日　&& iとjの値が異なる場合
					//例: 8月7日 iとjが8月7日までfor文回ってこの二つの値が同じでない場合continueする
					/// continue;
				// }
			}
		}
		
		System.out.println(count);
		System.out.printf("内側のfor文に入った回数: %d", loopCount);
	}

	private static void test2(int a, int b) {
		System.out.println("\n---< 別解2 >---");

		int count = 0;
		int loopCount = 0;
		for(int i = 1; i <= a; i++) {
			for(int j = 1; j <= b; j++) {
				loopCount++;
				if(i == j) {
					//month == dayならカウントする
					count ++;
					break; // これ以上、i == jになることはないので
				}

				// if((i == a && j == b) && (i != j)) {
					//i==a月かつj==b日　&& iとjの値が異なる場合
					//例: 8月7日 iとjが8月7日までfor文回ってこの二つの値が同じでない場合continueする
				//	break;
			}
		}
		
		System.out.println(count);
		System.out.printf("内側のfor文に入った回数: %d", loopCount);

	}

	private static void test3(int a, int b) {
		System.out.println("\n---< 別解3 >---");

		int count = 0;
		int loopCount = 0;
		for(int i = 1, j = 1; i <= a && j <= b; i++, j++) {
			loopCount++;
			count ++;
			
			// if((i == a && j == b) && (i != j)) {
				//i==a月かつj==b日　&& iとjの値が異なる場合
				//例: 8月7日 iとjが8月7日までfor文回ってこの二つの値が同じでない場合continueする
				/// continue;
			// }
		}
		
		System.out.println(count);
		System.out.printf("内側のfor文に入った回数: %d", loopCount);

	}

}
