package fr.algorithmie;

public class RechercheMin {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        System.out.println("plus petit");
        int a = array[0];
        for (int i : array){
            if (i < a) {
                a = i;
            }
        }
        System.out.println(a);
    }
}
