package review;

import java.util.Scanner;

public class Ex165_A {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i <= b; i ++){
            if(a % k == 0){
                System.out.println("OK");
            }
        }
        sc.close();
    }
}
