package org.example.Exercicio3;

import java.util.ArrayList;

public class Exercicio3 {

    public static int exercicio3(ArrayList<Integer> numbers, int userInput) {
        int acumulatedProduct = 1;
        for (int i = 0; i < numbers.size(); i++) {
            acumulatedProduct *= numbers.get(i);
            if (acumulatedProduct > userInput) {
                return i;
            }
        }
        return 0;
    }
}
