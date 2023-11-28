package review;

import java.util.Scanner;

public class Ex81_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < x.length;i++){
            x[i] = sc.nextInt();
        }

        int max = x[0];
        for(int i = 1; i < x.length; i++){
            if(x[i -1] < x[i]){
                max = x[i];
            }
        }
        
        int count = 0;
        outer:
        for(int i = 0; i <= max / 2; i++){
            for(int j = 0; j < x.length; j++){
                if( x[j] % 2 != 0){
                    break outer;
                }
                x[j] = x[j] / 2;
            }
            count ++;
        }
        System.out.println(count);

        sc.close();
    }
}
