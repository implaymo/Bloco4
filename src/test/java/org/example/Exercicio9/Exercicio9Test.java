package org.example.Exercicio9;

import org.example.Exercicio8.Exercicio8;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio9Test {

    @Test
    void test_constructor() {
        new Exercicio9();
    }

    @Test
    void should_return_array_with_all_odd_numbers_before_all_the_even_numbers() {
        // arrange
        ArrayList<Integer> numbersWithoutOrder = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5,6));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1 ,3 ,5 ,2 ,4 ,6));
        // act
        ArrayList<Integer> result = Exercicio9.exercicio9(numbersWithoutOrder);
        // assert
        assertEquals(expected, result);
    }
}