package review_kawakubo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex445_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] S = new String[N];

        // N個の文字列の入力
        inputStrings(sc, S, N);

        // 最大文字数の計算
        int max = getMaxLength(S);

        // 最大文字数に満たない文字の場合、左右に均等に.を追加
        /*
         * 実際にはmax個の.の文字列を作成し
         * maxに見たいない場合は元の文字列を
         * 左右均等に.が残るようにセットする
         */
        List<String> filledStrings = padDotAll(S, max);

        for (String s : filledStrings) {
            System.out.println(s);
        }

        sc.close();
    }

    private static void inputStrings(Scanner sc, String[] strings, int size) {
        for (int i = 0; i < size; i++) {
            strings[i] = sc.next();
        }
    }

    private static int getMaxLength(String[] strings) {
        int max = 0;
        for (String s : strings) {
            if (s.length() > max) {
                max = s.length();
            }
        }
        return max;
    }

    private static List<String> padDotAll(String[] strs, int max) {
        String maxString = ".".repeat(max);
        List<String> result = new ArrayList<>();
        for (String s : strs) {
            result.add(padDot(s, maxString, max));
        }
        return result;
    }

    private static String padDot(String s, String maxString, int max) {
        StringBuffer sb = new StringBuffer(maxString);
        int padlength = (max - s.length()) / 2;
        sb.replace(padlength, padlength + s.length(), s);
        return sb.toString();
    }
}
