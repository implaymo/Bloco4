package org.example.Exercicio7;

import java.util.ArrayList;

public class Exercicio7 {

    public static ArrayList<Integer> exercicio7(int start, int end, int numberToCheck){
        ArrayList<Integer> multipleNumbers = new ArrayList<>();

        if (numberToCheck == 0){
            return multipleNumbers;
        }
        for (int i = start; i <= end; i++){
            if (i % numberToCheck == 0){
                multipleNumbers.add(i);
            }
        }
        return multipleNumbers;
    }
}
