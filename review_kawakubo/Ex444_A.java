package review_kawakubo;

import java.util.Scanner;

public class Ex444_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(isSameDigits(num) ? "Yes" : "No");

        sc.close();
    }

    public static boolean isSameDigits(int num) {
        boolean result = true;
        int prev = num % 10;
        num /= 10;
        do {
            if (prev != num % 10) {
                result = false;
                break;
            }
            num /= 10;
        } while (num > 0);
        return result;
    }
}
