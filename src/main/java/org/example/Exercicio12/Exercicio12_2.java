package org.example.Exercicio12;

import java.util.Arrays;

public class Exercicio12_2 {

    public static int exercicio12_2(int[] numbers){
        int temp;
        boolean swap = false;

        if (numbers.length == 0) {
            return 0;
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i == j) {
                    continue;
                }
                if (numbers[i] < numbers[j]) {
                        temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                }
            }
        }
        return numbers[numbers.length - 1];
    }
}
