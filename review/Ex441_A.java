package review;

import java.util.Scanner;

public class Ex441_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt();
        int Q = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        if (X >= P && X <= P + 99 && Y >= Q && Y <= Q + 99) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
