package org.example.Exercicio4;

import java.util.ArrayList;

public class Exercicio4{

    public static ArrayList<Integer> exercicio4(int userInputNumber){
        ArrayList<Integer> numbersList = new ArrayList<>();
        String userInputNumberToString = String.valueOf(userInputNumber);
        for (int i = 0; i < userInputNumberToString.length(); i++){
            int numberAsInt = Integer.parseInt(String.valueOf(userInputNumberToString.charAt(i)));
            numbersList.add(numberAsInt);
        }
        return numbersList;
    }
}