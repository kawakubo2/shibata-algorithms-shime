package kawakubo;

import java.util.Scanner;

public class Score2 {
    public static void main(String[] args) {
        int score;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("点数: ");
            score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                break;
            }
        }
        sc.close();
    }
}
