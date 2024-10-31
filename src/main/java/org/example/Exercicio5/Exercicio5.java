package org.example.Exercicio5;

import java.util.ArrayList;

public class Exercicio5 {


    public static ArrayList<Integer> exercicio5(ArrayList<Integer> numbers, int userInput){
        ArrayList<Integer> finalNumbers = new ArrayList<>();
        int i = 0;
        while (i < 4) {
            finalNumbers.add(numbers.get(i));
            i++;
        }
        return finalNumbers;
    }
}
