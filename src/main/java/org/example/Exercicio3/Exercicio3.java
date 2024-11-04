package org.example.Exercicio3;

import java.util.ArrayList;

public class Exercicio3 {

    public static int exercicio3(int[] numbers, int userInput) {
        int acummulatedProduct = 1;
        for (int index = 0; index < numbers.length; index++) {
            int numberInArray = numbers[index];

            acummulatedProduct *= numberInArray;
            if (acummulatedProduct > userInput) {
                return index;
            }
        }
        return -1;
    }
}
