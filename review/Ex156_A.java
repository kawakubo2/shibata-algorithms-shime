package review;

import java.util.Scanner;

public class Ex156_A {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        if(n >= 10){
            System.out.println(r);
        }else if(n < 10){
            int fixedRate = r + (100 * (10 - n));
            System.out.println(fixedRate);
        }
        sc.close();

    }
}
