package review;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// 川久保追加
import static java.util.stream.Collectors.*;


public class Ex149_A_別解答その2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str01 = sc.next();
		String str02 = sc.next();
		
		/*
		 * 特に指摘することはありません。
		 * 今回もstreamを使うとしたら
		 * 以下のようになります。
		 * 上の方でCollectorsをstatic importしています。
		 */
		String str = Arrays.stream(new String[] {str02, str01})
						   .collect(joining(""));
		System.out.println(str);
		
		List<String> list = Arrays.asList(str02,str01);
		String jointedStr = String.join("", list);
		System.out.println(jointedStr);

		sc.close();

	}

}
