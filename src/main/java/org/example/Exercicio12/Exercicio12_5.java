package org.example.Exercicio12;

import java.util.ArrayList;

public class Exercicio12_5 {

    public static ArrayList<Integer> exercicio12_5(int[] numbers) {
        ArrayList<Integer> numbersNotRepeated = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            boolean checkNumber = checkIfInputInArray(numbers, numbers[i], i);
            if (!checkNumber) {
                numbersNotRepeated.add(numbers[i]);
            }
        }
        return numbersNotRepeated;
    }

    public static boolean checkIfInputInArray(int[] numbers, int numberToCheck, int index) {
        for (int j = 0; j < numbers.length; j++) {
            if (j == index) {
                continue;
            }
            if (numbers[j] == numberToCheck) {
                return true;
            }
        }
        return false;
    }
}

