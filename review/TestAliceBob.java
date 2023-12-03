package review;

import java.util.Arrays;
import java.util.Scanner;

public class TestAliceBob {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    
        int[] array = new int[num];
    
        int aliceScore = 0;
        int bobScore = 0;
    
        for(int i = 0; i < array.length;i++){
            array[i] = sc.nextInt();
        }
        
        Arrays.sort(array);

        for (int f = 0, l = array.length - 1; f < l; f++, l--){
            int temp = array[f];
            array[f]  = array[l];
            array[l] = temp;
          }
      
    
        for(int i = 0; i < array.length;i++){
            System.out.println(array[i]);
        }

        for(int i = 0; i< array.length; i += 2){
            aliceScore += array[i];
           // System.out.println(aliceScore);
        }

        for(int i = 1; i< array.length; i += 2){
            bobScore += array[i];
           // System.out.println(bobScore);
        }

        System.out.println(aliceScore - bobScore);

        sc.close();
    }
   



}
