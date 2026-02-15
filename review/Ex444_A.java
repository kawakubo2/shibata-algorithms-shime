package review;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex444_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = num / 100;
        int b = (num / 10) % 10;
        int c = num % 10;
        Set<Integer> mySet = new HashSet<>();
        mySet.add(a);
        mySet.add(b);
        mySet.add(c);
        if (mySet.size() == 1) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
        sc.close();
    }
}
