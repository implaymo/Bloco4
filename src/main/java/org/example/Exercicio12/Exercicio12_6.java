package org.example.Exercicio12;

public class Exercicio12_6 {

    public static int[] exercicio12_6(int[] numbers){
        int[] reversedNumbers = new int[numbers.length];
        int indexReversedNumber = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            reversedNumbers[indexReversedNumber] = numbers[i];
            indexReversedNumber++;
        }
        return reversedNumbers;
    }
}
