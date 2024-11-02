package org.example.Exercicio12;

public class Exercicio12_7 {

    public static int[] exercicio12_7(int[] numbers){
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0){
                count++;
            }
        }
        return addEvenNumbersToList(count, numbers);
    }

    public static int[] addEvenNumbersToList(int totalEvenNumbers, int[] numbers) {
        int [] evenNumbers = new int[totalEvenNumbers];
        int indexOfEvenNumber = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % 2 == 0 && indexOfEvenNumber < totalEvenNumbers){
                evenNumbers[indexOfEvenNumber] = numbers[i];
                indexOfEvenNumber++;
            }
        }
        return evenNumbers;
    }
}
