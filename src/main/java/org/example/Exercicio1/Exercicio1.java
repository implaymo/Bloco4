package org.example.Exercicio1;

public class Exercicio1 {
    public static int exercicio1(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            int numberInArray = numbers[i];
            sum += numberInArray;
        }
        return sum;
    }
}
