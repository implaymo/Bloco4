package org.example.Exercicio8;

import java.util.ArrayList;

public class Exercicio8 {

    public static ArrayList<Integer> exercicio8(int start, int end, int[] numbers){
        ArrayList<Integer> multipleNumbers = new ArrayList<>();
        for (int i = start; i <= end; i++){
            boolean checkNumber = checkIfMultiple(i, numbers);
            if (checkNumber){
                multipleNumbers.add(i);
            }
        }
        return multipleNumbers;
    }

    public static boolean checkIfMultiple(int numberToCheck, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numberToCheck % numbers[i] != 0){
                return false;
            }
        }
        return true;
    }
}
