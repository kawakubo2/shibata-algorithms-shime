package review_kawakubo;

import java.util.Scanner;

class Ex445_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.charAt(0) == str.charAt(str.length() - 1) ? "Yes" : "No");
        sc.close();
    }
}
