package org.example.Exercicio12;

import org.example.Exercicio2.Exercicio2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio12_1Test {

    @Test
    void test_constructor() {
        new Exercicio12_1();
    }

    @Test
    void should_return_the_lowest_value(){
        // arrange
        int[] numbers = {1,2,3,4,5};
        // act
        int result = Exercicio12_1.exercicio12_1(numbers);
        // assert
        assertEquals(1, result);
    }
}