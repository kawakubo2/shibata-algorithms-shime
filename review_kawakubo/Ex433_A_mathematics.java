package review_kawakubo;

import java.util.Scanner;

public class Ex433_A_mathematics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        sc.close();

        /*
         * X + i = (Y + i) * Z
         * X + i = Y * Z + Z * i
         * X - Y * Z = Z * i - i
         * X - Y * Z = (Z - 1) * i
         * i = (X - Y * Z) / (Z - 1)
         * 要するに (X - Y * Z) / (Z + 1)が整数値であれば正解があり
         * そうでなければ正解がないということになります。
         * ただし、そもそもX < Y * Zであれば答えがありません。
         * 入力例2を見ると
         * 28 10 3
         * とあります。
         * この時点で 28 < 10 * 3です。
         * これに1を加算していっても永久に答えがありません。
         * 下記の
         * X - Y * Z >= 0
         * がその条件で
         * (X - Y * Z) % (Z - 1) == 0
         * が倍数になりうるかと条件です。
         * この2つの条件を満たすとYesとなり、満たさないとNoとなります
         */
        System.out.println((X - Y * Z >= 0) && (X - Y * Z) % (Z - 1) == 0 ? "Yes" : "No");
    }
}
