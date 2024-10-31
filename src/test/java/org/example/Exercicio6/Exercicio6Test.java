package org.example.Exercicio6;

import org.example.Exercicio5.Exercicio5;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio6Test {

    @Test
    void test_constructor() {
        new Exercicio6();
    }

    @Test
    void should_return_array_with_multiples_of_number_3() {
        // arrange
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(6,9));
        // act
        ArrayList<Integer> result = Exercicio6.exercicio6(4, 10);
        // assert
        assertEquals(expected, result);
    }
}