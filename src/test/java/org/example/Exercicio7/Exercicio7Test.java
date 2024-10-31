package org.example.Exercicio7;

import org.example.Exercicio6.Exercicio6;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio7Test {

    @Test
    void test_constructor() {
        new Exercicio7();
    }

    @Test
    void should_return_array_with_multiples_of_number_3() {
        // arrange
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(6,9));
        // act
        ArrayList<Integer> result = Exercicio7.exercicio7(4, 10, 3);
        // assert
        assertEquals(expected, result);
    }

    @Test
    void should_return_array_with_multiples_of_number_6() {
        // arrange
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(6,12,18));
        // act
        ArrayList<Integer> result = Exercicio7.exercicio7(1, 20, 6);
        // assert
        assertEquals(expected, result);
    }
}