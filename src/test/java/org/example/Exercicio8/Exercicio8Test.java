package org.example.Exercicio8;

import org.example.Exercicio7.Exercicio7;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio8Test {

    @Test
    void test_constructor() {
        new Exercicio8();
    }

    @Test
    void should_return_array_with_multiples_of_number_6() {
        // arrange
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(6,12));
        // act
        ArrayList<Integer> result = Exercicio8.exercicio8(4, 12, 2, 3);
        // assert
        assertEquals(expected, result);
    }
}