package org.example.Exercicio6;

import java.util.ArrayList;

public class Exercicio6 {

    public static ArrayList<Integer> exercicio6(int start, int end){
        if (start > end){
          int temp = start;
            start = end;
            end = temp;
        }

        ArrayList<Integer> multipleNumbers = new ArrayList<>();
        for (int i = start; i < end; i++){
            if (i % 3 == 0){
                multipleNumbers.add(i);
            }
        }
        return multipleNumbers;
    }
}
