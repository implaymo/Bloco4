package org.example.Exercicio13;

public class Exercicio13 {
    public static int exercicio13(int[] array1, int[] array2) {
        int scalarProduct = 0;
        for (int i = 0; i < array1.length; i++) {
            scalarProduct += array1[i] * array2[i];
        }
        return scalarProduct;
    }
}
