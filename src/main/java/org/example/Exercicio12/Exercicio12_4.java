package org.example.Exercicio12;

public class Exercicio12_4 {

    public static int exercicio12_4(int[] numbers){
        int productOfNumbers = 1;
        for (int i = 0; i < numbers.length; i++) {
            productOfNumbers *= numbers[i];
        }
        return productOfNumbers;
    }
}
