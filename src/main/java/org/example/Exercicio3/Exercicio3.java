package org.example.Exercicio3;

import java.util.ArrayList;

public class Exercicio3 {

    public static int exercicio3(ArrayList<Integer> numbers, int userInput) {
        int acumulatedProduct = 1;
        int index = 0;
        for (int i = 0; i < numbers.size(); i++) {
            acumulatedProduct *= numbers.get(i);
            if (acumulatedProduct > userInput) {
                index = i;
                return index;
            }
        }
        return -1;
    }
}
