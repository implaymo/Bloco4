package org.example.Exercicio10;

import org.example.Exercicio9.Exercicio9;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio10Test {

    @Test
    void test_constructor() {
        new Exercicio10();
    }

    @Test
    void should_return_array_with_all_odd_numbers() {
        // arrange
        int[] numbersWithoutOrder = {1, 2, 3, 4, 5,6};
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1 ,3 ,5));
        // act
        ArrayList<Integer> result = Exercicio10.exercicio10(numbersWithoutOrder);
        // assert
        assertEquals(expected, result);
    }
}