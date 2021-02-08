package fr.algorithmie;

import java.util.Arrays;

public class AffichagePartiel {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println("sup 3 :");
        for (int i : array){
            if (i > 3) {
                System.out.println(i);
            }
        }
        System.out.println("pair :");
        for (int i : array){
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("index pair :");
        for (int i=0;i<array.length;i++){
            if (i%2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("impair :");
        for (int i : array){
            if (i%2 != 0) {
                System.out.println(i);
            }
        }

    }
}
