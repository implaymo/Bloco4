package org.example.Exercicio12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio12_2Test {

    @Test
    void test_constructor() {
        new Exercicio12_2();
    }

    @Test
    void should_return_the_lowest_value(){
        // arrange
        int[] numbers = {1,2,3,4,5};
        // act
        int result = Exercicio12_2.exercicio12_2(numbers);
        // assert
        assertEquals(5, result);
    }
}