package org.example.Exercicio12;

public class Exercicio12_2 {

    public static int exercicio12_2(int[] numbers){
        int temp;

        if (numbers.length == 0) {
            return 0;
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i+1]) {
                temp = numbers[i];
                numbers[i+1] = numbers[i];
                numbers[i] = temp;
            }
        }
        return numbers[numbers.length - 1];
    }
}
