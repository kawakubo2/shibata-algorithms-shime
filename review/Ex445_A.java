package review;

import java.util.Scanner;

class Ex445_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (checkStrongWord(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }

    public static boolean checkStrongWord(String str) {
        int n = str.length() - 1;
        if (str.charAt(0) != str.charAt(n))
            return false;
        else
            return true;
    }
}
