package org.example.Exercicio8;

import java.util.ArrayList;

public class Exercicio8 {

    public static ArrayList<Integer> exercicio8(int start, int end, int numberToCheck1, int numberToCheck2){
        ArrayList<Integer> multipleNumbers = new ArrayList<>();
        for (int i = start; i <= end; i++){
            if (i % numberToCheck1 == 0 && i % numberToCheck2 == 0){
                multipleNumbers.add(i);
            }
        }
        return multipleNumbers;
    }
}
