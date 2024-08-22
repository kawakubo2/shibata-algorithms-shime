package kawakubo;

import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        int score; // 0 - 100
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("点数: ");
            score = sc.nextInt();
        } while (score < 0 || score > 100);
        System.out.println("点数: " + score);

        sc.close();
    }
}