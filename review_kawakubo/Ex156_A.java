package review_kawakubo;

import java.util.Scanner;

public class Ex156_A {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        /*
         * ほとんど指摘することはありませんが、
         * n >= 10がfalseということは
         * elseだけで
         * n < 10
         * と同じ意味なります。
         */
        if(n >= 10){
            System.out.println(r);
        // }else if(n < 10){
        } else {
            int fixedRate = r + (100 * (10 - n));
            System.out.println(fixedRate);
        }
        sc.close();
    }
}
