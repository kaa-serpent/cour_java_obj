package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1,15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] arrayCopy = array;

        for(int i = 0; i < arrayCopy.length / 2; i++)
        {
            int temp = arrayCopy[i];
            arrayCopy[i] = arrayCopy[arrayCopy.length - i - 1];
            arrayCopy[arrayCopy.length - i - 1] = temp;
        }
        for (int i: array)
            System.out.println(i);
        System.out.println("o00");
        for (int i: arrayCopy)
            System.out.println(i);
    }
}
