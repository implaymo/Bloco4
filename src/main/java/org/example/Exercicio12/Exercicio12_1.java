package org.example.Exercicio12;

public class Exercicio12_1 {

    public static int exercicio12_1(int[] numbers){
        int temp;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i+1]) {
                temp = numbers[i];
                numbers[i+1] = numbers[i];
                numbers[i] = temp;
            }
        }
        return numbers[numbers.length - 1];
    }
}
