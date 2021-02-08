package fr.algorithmie;

import java.util.ArrayList;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int[] array1= {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8};
        System.out.println("commun : ");

        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i=0;i<array1.length;i++){
            for(int b=0;b<array2.length;b++)
                if(array1[i] == array2[b]){
                    result.add(array1[i]);
                }
        }
        for (int i : result){
            System.out.println(i);
        }
        System.out.println("il y à " + result.size() + " communs dans les lists");
    }
}
