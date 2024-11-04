package org.example.Exercicio5;

import java.util.ArrayList;

public class Exercicio5 {


    public static ArrayList<Integer> exercicio5(int[] numbers, int userInput){
        ArrayList<Integer> finalNumbers = new ArrayList<>();
        int i = 0;
        while (i < userInput) {
            int numberFromList = numbers[i];
            finalNumbers.add(numberFromList);
            i++;
        }
        return finalNumbers;
    }
}
