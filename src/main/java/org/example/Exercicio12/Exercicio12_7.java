package org.example.Exercicio12;

public class Exercicio12_7 {

    public static int[] exercicio12_7(int[] numbers){
        int count = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < 0 || (numbers[i] % 2 == 0 && numbers[i] != 2)){
                continue;
            }
            if (isPrime(numbers[i])){
                count++;
            }
        }
        return addPrimeNumbersToList(count, numbers);
    }


    public static boolean isPrime(int number){
        int totalDivisors = 0;
        for (int i = 3; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                totalDivisors++;
            }
        }
        if (totalDivisors > 0){
            return false;
        }
        return true;
    }


    public static int[] addPrimeNumbersToList(int totalPrimeNumbers, int[] numbers) {
        int [] primeNumbers = new int[totalPrimeNumbers];
        int index = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < 0 || (numbers[i] % 2 == 0 && numbers[i] != 2)){
                continue;
            }
            if (index < totalPrimeNumbers && isPrime(numbers[i])){
                primeNumbers[index] = numbers[i];
                index++;
            }
        }
        return primeNumbers;
    }
}
