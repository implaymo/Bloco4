package org.example.Exercicio4;

import java.util.ArrayList;

public class Exercicio4{

    public static ArrayList<Integer> exercicio4(int number){
        ArrayList<Integer> numbersList = new ArrayList<>();
        String numberAsString = String.valueOf(number);
        for (int i = 0; i < numberAsString.length(); i++){
            int numberAsInt = Integer.parseInt(String.valueOf(numberAsString.charAt(i)));
            numbersList.add(numberAsInt);
        }
        System.out.println(numbersList);
        return numbersList;
    }
}