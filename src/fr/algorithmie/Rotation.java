package fr.algorithmie;

public class Rotation {
    public String on;

    public static void main(String[] args) {
        int[] array = {7, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, 5};
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            try {
                result[i + 1] = array[i];;
            } catch (Exception e) {
                result[0] = array[i];
            }
        }
        for (int i : result) {
            System.out.println(i);
        }
        System.out.println("ghfdjqo");
        for (int i : array) {
            System.out.println(i);
        }
    }
}