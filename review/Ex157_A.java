package review;

import java.util.Scanner;

public class Ex157_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 != 0){
            System.out.println( (n / 2) + 1);
        }else if(n  % 2 == 0){
            System.out.println(n / 2);
        }else {
            System.out.println("もう一度やり直してください");
        }
        sc.close();
    }
}
