package org.example.Exercicio13;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Exercicio13Test {

    @Test
    void test_constructor() {
        new Exercicio13();
    }

    @ParameterizedTest
    @MethodSource("arrayProvider")
    void should_return_not_repeated_numbers(int[] array1, int[] array2, int expected) {
        // arrange
        // act
        int result = Exercicio13.exercicio13(array1, array2);
        // assert
        assertEquals(expected, result);
    }


    // This method provides test data to the parameterized test
    private static Stream<Arguments> arrayProvider() {
        return Stream.of(
                Arguments.of(new int[]{2, 3}, new int[]{1,2}, 8),
                Arguments.of(new int[]{2, 3, 4}, new int[]{1, 2, 3}, 20),
                Arguments.of(new int[]{-1, -2, 3}, new int[]{2, 3, 4}, 4)
        );
    }
}