package org.example.Exercicio9;

import java.util.ArrayList;

public class Exercicio9 {

    public static ArrayList<Integer> exercicio9(ArrayList<Integer> numbersList) {
        ArrayList<Integer> numbersOrganized = new ArrayList<>();
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) % 2 != 0) {
                numbersOrganized.add(numbersList.get(i));
            }
        }
        for (int i = 0; i < numbersList.size(); i++) {
            if (numbersList.get(i) % 2 == 0) {
                numbersOrganized.add(numbersList.get(i));
            }
        }
        return numbersOrganized;
    }
}
