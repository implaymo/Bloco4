package org.example.Exercicio11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio11Test {

    @Test
    void test_constructor() {
        new Exercicio11();
    }

    @Test
    void should_return_true_if_number_palindrome(){
        // arrange
        // act
        boolean result = Exercicio11.exercicio11(1771);
        // assert
        assertTrue(result);
    }

    @Test
    void should_return_false_if_number_not_palindrome(){
        // arrange
        // act
        boolean result = Exercicio11.exercicio11(1772);
        // assert
        assertFalse(result);
    }
}