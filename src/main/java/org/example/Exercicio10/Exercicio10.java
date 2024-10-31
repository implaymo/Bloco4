package org.example.Exercicio10;

import java.util.ArrayList;

public class Exercicio10 {

    public static ArrayList<Integer> exercicio10(int[] numbersList) {
        ArrayList<Integer> oddNumbers = new ArrayList<>();
        for (int i = 0; i < numbersList.length; i++) {
            if (numbersList[i] % 2 != 0) {
                oddNumbers.add(numbersList[i]);
            }
        }
        return oddNumbers;
    }
}
