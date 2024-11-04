package org.example.Exercicio9;

import java.util.ArrayList;

public class Exercicio9 {

    public static ArrayList<Integer> exercicio9(int[] numbersList) {
        ArrayList<Integer> numbersOrganized = new ArrayList<>();
        for (int i = 0; i < numbersList.length; i++) {
            if (numbersList[i] % 2 != 0) {
                numbersOrganized.add(numbersList[i]);
            }
        }
        for (int i = 0; i < numbersList.length; i++) {
            if (numbersList[i] % 2 == 0) {
                numbersOrganized.add(numbersList[i]);
            }
        }
        return numbersOrganized;
    }
}
