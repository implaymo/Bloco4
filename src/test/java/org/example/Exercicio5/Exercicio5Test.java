package org.example.Exercicio5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio5Test {

    @Test
    void test_constructor() {
        new Exercicio5();
    }

    @Test
    void should_return_all_numbers_at_index_before_4(){
        // arrange
        ArrayList<Integer> allNumbers = new ArrayList<>(Arrays.asList(3, 4, 6, 8, 1, 23, 89, 12));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(3, 4, 6, 8));

        //
        ArrayList<Integer> result = Exercicio5.exercicio5(allNumbers, 4);
        // assert
        assertEquals(expected, result);
    }
}