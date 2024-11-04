package org.example.Exercicio11;

import org.example.Exercicio4.Exercicio4;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio11Test {

    @Test
    void test_constructor() {
        new Exercicio11();
    }

    @ParameterizedTest
    @MethodSource("allTests")
    void should_return_true_if_palindrome_and_false_if_not_palindrome(int userInputNumber, boolean expected) {
        // arrange
        // act
        boolean result = Exercicio11.exercicio11(userInputNumber);
        // assert
        assertEquals(expected, result);
    }


    // This method provides test data to the parameterized test
    private static Stream<Arguments> allTests() {
        return Stream.of(
                Arguments.of(1771, true),
                Arguments.of(1772, false),
                Arguments.of(1, true),
                Arguments.of(12, false)
                );
    }
}