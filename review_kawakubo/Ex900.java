package review_kawakubo;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Ex900 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        /*
         * TreeMapでキーをゴールまでの秒数にすると
         * addで追加するたびに秒数の昇順にソート
         * した状態が保たれます。
         */
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            map.put(a[i], i + 1);
        }

        System.out.println(map.entrySet()
                .stream()
                .map(e -> e.getValue()) // Mapから値だけを取り出します
                .toList()
                .subList(0, 3) // 先頭から3件取り出します。
                .stream()
                .map(String::valueOf) // この下の行でjoiningを使って要素を半角空白でくっつけるためにString型に変換します
                .collect(Collectors.joining(" "))); // 文字列型へ変換したものを半角空白でくっつけます。
        ;
        scanner.close();
    }
}
