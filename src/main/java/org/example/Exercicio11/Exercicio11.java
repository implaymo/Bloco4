package org.example.Exercicio11;

import javax.swing.text.AttributeSet;
import java.util.ArrayList;

public class Exercicio11 {

    public static boolean exercicio11(int number){
        String numberAsString = String.valueOf(number);
        ArrayList<String> reversedNumber = new ArrayList<>();
        boolean isPalindrome = false;

        for (int i = numberAsString.length() - 1; i >= 0; i--) {
            String charAsString = String.valueOf(numberAsString.charAt(i));
            reversedNumber.add(charAsString);
        }
        String allNumbersTogether = String.join("", reversedNumber);
        if (allNumbersTogether.equals(numberAsString)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
