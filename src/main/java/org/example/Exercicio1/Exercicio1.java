package org.example.Exercicio1;

import java.util.ArrayList;

public class Exercicio1 {
    public static int exercicio1(ArrayList<Integer> numbers){
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++){
            sum += numbers.get(i);
        }
        return sum;
    }
}
