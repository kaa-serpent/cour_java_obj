package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        for (int a : array)
            System.out.println(a);
        System.out.println("Inverse");
        for (int i = array.length - 1; i != 0; i--)
            System.out.println(array[i]);
        int[] arrayCopie = array.clone();
        for (int i: arrayCopie)
            System.out.println(i);
    }
}