package org.example.Exercicio2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio2Test {

    @Test
    void test_constructor() {
        new Exercicio2();
    }

    @ParameterizedTest
    @CsvSource({
        "12345, 5"
    })
    void should_return_5(int number, int expected) {
        // arrange
        // act
        int result = Exercicio2.exercicio2(number);
        // assert
        assertEquals(expected, result);
    }
}