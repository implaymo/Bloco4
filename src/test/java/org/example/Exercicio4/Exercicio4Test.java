package org.example.Exercicio4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio4Test {

    @Test
    void test_constructor() {
        new Exercicio4();
    }

    @Test
    void should_return_number_split_into_an_array(){
        // arrange
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        // act
        ArrayList<Integer> result = Exercicio4.exercicio4(1234);
        // assert
        assertEquals(expected, result);
    }
}